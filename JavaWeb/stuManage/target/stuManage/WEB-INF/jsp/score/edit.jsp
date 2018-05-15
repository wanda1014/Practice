<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>学生成绩信息修改</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/score/edit.action" method="post">
		<%--<input type="hidden" name="id" value="${scoreVo.id }">--%>

		语文:<input name="chinese" id="chinese" type="text" value="${scoreVo.chinese}">
		<br>
		数学：<input name="math" id="math" type="text" value="${scoreVo.math}">
		<br>

		英语:<input name="english" id="english" type="text" value="${scoreVo.english}">
		<br>
		
		<input type="submit" value="修改" >
	</form>

	<form action="${pageContext.request.contextPath }/score/index.action" method="post">
		<input type="submit" value="返回" >
	</form>
	
</body>
</html>
