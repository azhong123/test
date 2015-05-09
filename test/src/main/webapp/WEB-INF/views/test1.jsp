<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="${ctx}/static/bootstrap/css/bootstrap.min.css">
<script type="text/javascript" src="${ctx}/static/js/jquery-1.11.2.min.js"></script>
<script type="text/javascript" src="${ctx}/static/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${ctx}/static/js/bsvalidate.js"></script>
</head>
<script type="text/javascript">
	
	$(document).ready(function(){
		$("#form").bsvalidate({
			rules:{
				pwd:{
					required:true
				},
				pwd2:{
					required:true,
					eqTo:"#pwd"
				},
				remote:{
					remote:"${ctx}/demo/remote"
				}
			}
		});
	});
	
</script>
<body>
	<form id="form">
		<div class="row">
				<div class="col-md-4" align="right" >
					<label for="pwd">支付密码</label>
				</div>
				<div class="col-md-4">
					<input id="pwd" name="pwd" class="form-control" type="text" placeholder="支付密码">
				</div>
				<div class="col-md-4"><a href="javascript:modifyPwd()">忘记密码</a></div>
			</div>
		<div class="row">
				<div class="col-md-4" align="right" >
					<label for="pwd">支付密码</label>
				</div>
				<div class="col-md-4">
					<input id="pwd2" name="pwd2" class="form-control" type="text" placeholder="支付密码">
				</div>
				<div class="col-md-4"><a href="javascript:modifyPwd()">忘记密码</a></div>
			</div>
<!-- 		<div class="row"> -->
<!-- 				<div class="col-md-4" align="right" > -->
<!-- 					<label for="pwd">支付密码</label> -->
<!-- 				</div> -->
<!-- 				<div class="col-md-4"> -->
<!-- 					<input id="remote" name="remote" class="form-control" type="text" placeholder="支付密码"> -->
<!-- 				</div> -->
<!-- 				<div class="col-md-4"><a href="javascript:modifyPwd()">忘记密码</a></div> -->
<!-- 			</div> -->
			
		<button type="submit">test</button>
	</form>
</body>
</html>