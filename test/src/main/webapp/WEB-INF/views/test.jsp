<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>   
<html lang="zh-CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 登录页面 -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<script type="text/javascript" src="${ctx}/static/js/jquery-1.11.2.min.js"></script>
<script type="text/javascript" src="${ctx}/static/js/canvas.js"></script>
<title>Insert title here</title>
<script type="text/javascript">
// 	$(document).ready(function(){
		new Canvas("myCanvas").drawImg();
		
// 		function allowDrop(ev)
// 		{
// 		ev.preventDefault();
// 		}

// 		function drag(ev)
// 		{
// 		ev.dataTransfer.setData("Text",ev.target.id);
// 		}

// 		function drop(ev)
// 		{
// 		ev.preventDefault();
// 		var data=ev.dataTransfer.getData("Text");
// 		ev.target.appendChild(document.getElementById(data));
// 		}
// 	});
	
</script>
</head>
<body>
<!-- 	<div id="test" style="width:300px; height: 300px; border: 1px red solid; margin-left: auto; margin-right: auto; margin-top: 100px;"> -->
<!-- 		<span style="top:10px;left: 10px; position:relative; width:1px; font-size: 1px; background-color: black; height: 100px;"></span> -->
<!-- 		<div style="width:1px; height:100px; background-color: red; position: relative; top:100px; left: 100px;"></div> -->
	<div style="width:300px; height: 300px; border: 1px red solid;" ondrop="drop(event)" ondragover="allowDrop(event)">
		<canvas id="myCanvas" width="300px;" height="300px;" ondrop="drop(event)" ondragover="allowDrop(event)"></canvas>
	</div>
	
<!-- 	<div id="div1" ondrop="drop(event)" -->
<!-- 		ondragover="allowDrop(event)"></div> -->
<%-- 		<img id="drag1" src="${ctx}/static/images/3.jpg" draggable="true" --%>
<!-- 		ondragstart="drag(event)" width="336" height="69" /> -->
</body>
</html>