

var _canvas;

$.fn.canvas = function(options){
	
	if(typeof(options) == 'string'){
		
	}else{
		initCanvas(this.attr("id"),options);
	}
	
	
	/**
	 * 初始化canvas
	 */
	function initCanvas(id,options){
		var c = document.getElementById(id);
		// 创建2D画布实例
		var ctx = c.getContext("2d");
		_canvas = ctx;
	}
	
}




/**
 * 初始化画布
 * @param id
 */
function Canvas(id){
	var c = document.getElementById(id);
	var ctx = c.getContext("2d");
	
}

/**
 * 画线
 */
Canvas.prototype.drawLine = function(){
	alert("画线");
}

/**
 * 拖放图片
 */
Canvas.prototype.drawImg = function(){
	var img=new Image()
	img.src="demo/static/images/3.jpg";
//	img.onclick = function(){
//		alert("点击");
//	};
	this.cxt.drawImage(img,0,0);
}

/**
 * 
 */
function drap(){
	
}

