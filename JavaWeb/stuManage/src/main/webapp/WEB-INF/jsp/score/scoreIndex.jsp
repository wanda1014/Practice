<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<link
	href="${pageContext.request.contextPath}/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/dist/css/bootstrap-theme.min.css"
	rel="stylesheet" />
<link href="${pageContext.request.contextPath}/css/dashboard.css"
	rel="stylesheet">
<script
	src="${pageContext.request.contextPath}/dist/js/ie-emulation-modes-warning.js"></script>

	<script>
        //前台JS校验
        function checkForm() {
            //校验输入区间
            var min = document.getElementById("min").value;
            var max = document.getElementById("max").value;
            if (min == null || min == '' || max == null || max == '') {
                document.getElementById("span1").innerHTML = "<font color='red'>区间不能为空!</font>"
                return false;
            }
        }
	</script>

<title>学生成绩管理</title>

</head>

<body>

	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a href="#" class="navbar-brand">信息管理系统</a>
			</div>

			<div id="navbar" class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#">概况</a></li>
					<li><a href="#">帮助</a></li>
				</ul>
				<form class="navbar-form navbar-right">
					<input type="text" class="form-control" placeholder="Search..."></input>
				</form>

			</div>


		</div>
	</nav>

	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-3 col-md-2 sidebar">
				欢迎您：${existAdmin.username} <a
					href="${pageContext.request.contextPath}/over.action">注销</a>
				<ul class="nav nav-sidebar">
					<li><a href="${pageContext.request.contextPath}/index.action">首页</a>
					</li>
				</ul>

				<ul class="nav nav-sidebar">

					<li><a href="${pageContext.request.contextPath}/teacher/index.action">老师信息</a>
					</li>
					<li><a href="${pageContext.request.contextPath}/student/index.action">学生信息</a>
					</li>
					<li class="active"><a
						href="${pageContext.request.contextPath}/score/index.action">学生成绩管理</a></li>
				</ul>
			</div>
			<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">


				<h2 class="sub-header">学生成绩</h2>

				<form id="f1" action="${pageContext.request.contextPath}/score/findScoreByChinese.action" method="post">
					<input type="submit" value="按语文成绩排序">
				</form>

				<form id="f2" action="${pageContext.request.contextPath}/score/chineseUp.action" method="post">
					<input type="submit" value="语文70分以上">
				</form>

				<form id="f3" action="${pageContext.request.contextPath}/score/chineseAver.action" method="post">
					<input type="submit" value="语文平均分">${avg}
				</form>

				<form id="f4" action="${pageContext.request.contextPath}/score/findScoreByRange.action" method="post" onsubmit="return checkForm();">
					按照区间查找:
					语文:<input id="min" name="min" value="${min}" type="text">—<input id="max" name="max" value="${max}" type="text">
					<input type="submit" value="确定"><span id="span1"></span>
				</form>


				<%--<form id="f4" action="${pageContext.request.contextPath}/score/findScoreByChinese.action" method="post">
					<input type="submit" value="按数学成绩排序">
				</form>

				<form id="f5" action="${pageContext.request.contextPath}/score/findScoreByChinese.action" method="post">
					<input type="submit" value="按英语成绩排序">
				</form>--%>

				<div class="table-responsive">
					<table class="table table-striped">
						<thead>
							<tr>
								<td>学号</td>
								<td>姓名</td>
								<td>年龄</td>
								<td>语文</td>
								<td>数学</td>
								<td>英语</td>
								<td>编辑</td>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${scoreVoList }" var="score">
								<tr>
									<td>${score.studentId }</td>
									<td>${score.student.studentName}</td>
									<td>${score.student.age}</td>
									<td>${score.chinese }</td>
									<td>${score.math }</td>
									<td>${score.english }</td>
									<td>
										<a href="${pageContext.request.contextPath}/score/editPage.action?studentId=${score.studentId }">修改成绩</a>
									</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>

	</div>



	<script type="text/javascript" src="dist/jquery/jquery.min.js"></script>
	<script type="text/javascript" src="dist/js/bootstrap.min.js"></script>
	<script src="dist/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>
