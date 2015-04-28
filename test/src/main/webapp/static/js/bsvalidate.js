/**
 * 基于jquery 与 bootstrap 的表单验证插件
 * 使用本插件时必须将jquery.js与boostrap.css和bootstrap.js引入
 * 
 * 1.暂时支持的验证方法：
 * 		required:必输
 * 		minLength:最小长度
 * 		maxLength:最大长度
 * 		eqTo:密码验证
 * 		remote:远程验证
 * 
 * 		其他待增加
 * 
 * 2. 支持多表单验证。
 * 
 * @author gbcui
 */

/**
 * 初始化Map
 */
function Map(){
	this.container = new Object()
}

Map.prototype.put = function(key,value){
	this.container[key] = value;
}

Map.prototype.get = function(key){
	return this.container[key];
}
	

/**
 * 全局表单验证缓存
 * key:表单id
 * value:加载表单时options
 */
var _formMap = new Map();

/**
 * jquery扩展
 */
$.fn.bsvalidate = function(options){
	if(typeof(options) == 'string'){
		
	}else{
		// 初始化表单
		initForm(this,options);
	}

	/**
	 * 初始化表单
	 */
	function initForm($form,options){
		
		var defoption = {
				beforeSubmit:true
			};
		options = $.extend(defoption,options);
		
		// 添加入formMap
		_formMap.put($form.attr("id"),options);
		// 绑定事件
		for(var key in options.rules){
			(function(){
				var name = key;
				$form.find("[name='"+name+"']").blur(function(){
					validate(this,options.rules[name],name);
				});
			}());
		}
		
		// 设置回调函数
		$form.attr("onsubmit","return bs_beforeSubmit(this)");
	}
	
}

/**
 * 解析校验规则
 * @param $ele
 * @param rule
 */
function validate(ele,rule,name){
	var value = $(ele).val();
	for(var key in rule){
		var flag = true;
		(function(){
			if(!eachValidate($(ele),key,rule[key],name)){
				flag = false;
			}
			
		})()
		if(!flag){
			return;
		}
	}
	
}

function eachValidate($ele,key,validate,name){
	var value = $ele.val();
	var flag =  eval(key+"('"+value+"','"+validate+"','"+name+"')");
	changeCss($ele,defMessage(key),flag);
	return flag;
}

/**
 * 改变单元样式
 */
function changeCss($ele,message,isChange){
	var $parent = $ele.parent();
	if(isChange){
		$parent.removeClass("has-error");
		$parent.addClass("has-success");
		$ele.attr("title",message);
		$ele.tooltip("destroy");
	}else{
		$parent.removeClass("has-success");
		$parent.addClass("has-error");
		$ele.attr("data-toggle","tooltip");
		$ele.attr("data-placement","bottom");
		$ele.attr("title",message);
		$ele.tooltip("show");
	}
}


function defMessage(key){
	var map = {
			"required":"请输入",
			"minLength":"输入值小于最小长度",
			"maxLength":"输入值大于最大长度",
			"eqTo":"两次密码不一致",
			"remote":"校验失败"
			}
	
	return map[key];
}

/**
 * 提交表单时验证（回调函数）
 */
function bs_beforeSubmit(obj){
	// 获取options
	var options = _formMap.get($(obj).attr("id"));
	// 校验
	var flag = true;
	for(var key in options.rules){
		(function(){
			if(!validate($(obj).find("[name='"+key+"']"),options.rules[key])){
				flag = false;
			}
		}());
	}
	if(flag && options.beforeSubmit){
		return true;
	}
	return false;
	
}

/**
 * 校验必输项
 * @param value
 * @param validate
 * @returns {Boolean}
 */
function required(value,validate,name){
	if(validate == 'true' || validate == true || validate == 'required'){
		if(value){
			return true;
		}
	}
	return false;
}

/**
 * 最小长度
 * @param value
 * @param validate
 * @returns {Boolean}
 */
function minLength(value,validate,key,name){
	if(value){
		if(value.length<validate){
			return false;
		}
	}
	return true;
}

/**
 * 最大长度
 * @param value
 * @param validate
 * @returns {Boolean}
 */
function maxLength(value,validate,key,name){
	if(value){
		if(value.length>validate){
			return false;
		}
	}
	return true;
}

/**
 * 校验两次密码是否一致
 * @param value
 * @param validate
 */
function eqTo(value,validate,key,name){
	if(value){
		if(value != $(validate).val()){
			return false;
		}
	}
	return true;
}

/**
 * 远程校验
 * @param value
 * @param validate
 * @param name
 */
function remote(value,validate,name){
	var param = {name:value};
	var flag = false;
	$.ajax({
		url: validate, 
		data:param,
		async:false,
		type:"post",
		success: function(data){
			if(data == 'true' || data == true){
				flag = true;
			}
       }
	});
	return flag;
}
