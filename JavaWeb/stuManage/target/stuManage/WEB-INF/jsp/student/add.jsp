<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>学生信息添加</title>
</head>

<script src="${pageContext.request.contextPath }/style/jquery.js"></script>

<body>
	学生信息添加
	<hr>
	<form id="f1" action="${pageContext.request.contextPath}/student/add.action" method="post">

		学号:<input id="studentIde" name="studentId" type="text" value=""> <br>
		姓名:<input id="studentName" name="studentName" type="text" value=""> <br>
		年龄:<input id="age" name="age" type="text" value=""> <br>
			 <input type="submit" value="提交">
	</form>

</body>
</html>
