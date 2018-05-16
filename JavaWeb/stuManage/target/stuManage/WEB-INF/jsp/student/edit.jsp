<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>学生信息修改</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/student/edit.action" method="post">
		<input type="hidden" name="studentId" value="${existStudent.studentId }">

		<%--<br>
		学号:<input name="studentId" type="text" value="${existStudent.studentId}">--%>
		<br>
		姓名：<input name="studentName" type="text" value="${existStudent.studentName}">
		<br>

		年龄:<input name="age" id="age" type="text" value="${existStudent.age}">
		<br>
		
		<input type="submit" value="修改" >
	</form>

	<form action="${pageContext.request.contextPath }/student/index.action" method="post">
		<input type="submit" value="返回" >
	</form>
	
</body>
</html>
