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

<script>
	//前台JS校验
	function checkForm() {
	    //校验学号
		var studentId = document.getElementById("studentIde").value;
		if (studentId == null || studentId == ''){
		    document.getElementById("span1").innerHTML = "<font color='red'>学号不能为空!</font>"
			return false;
		}

        //校验姓名
        var studentName = document.getElementById("studentName").value;
        if (studentName == null || studentName == ''){
            document.getElementById("span2").innerHTML = "<font color='red'>姓名不能为空!</font>"
            return false;
        }

        //校验年龄
        var age = document.getElementById("age").value;
        if (age == null || age == ''){
            document.getElementById("span3").innerHTML = "<font color='red'>年龄不能为空!</font>"
            return false;
        }
    }

</script>

<script src="${pageContext.request.contextPath }/style/jquery.js"></script>

<body>
	学生信息添加
	<hr>
	<form id="f1" action="${pageContext.request.contextPath}/student/add.action" method="post" onsubmit="return checkForm();">

		学号:<input id="studentIde" name="studentId" type="text" value=""> <span id="span1"></span><br>
		姓名:<input id="studentName" name="studentName" type="text" value=""> <span id="span2"></span><br>
		年龄:<input id="age" name="age" type="text" value=""> <span id="span3"></span><br>
			 <input type="submit" value="提交">
	</form>

	<form id="f2" action="${pageContext.request.contextPath}/student/index.action" method="post">
		<input type="submit" value="返回">
	</form>

</body>
</html>
