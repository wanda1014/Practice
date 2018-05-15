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
<h2>学生语文成绩平均分：${avg}</h2>
<hr>
<form id="f1" action="${pageContext.request.contextPath}/score/index.action" method="post">
	<input type="submit" value="返回">
</form>

</body>
</html>
