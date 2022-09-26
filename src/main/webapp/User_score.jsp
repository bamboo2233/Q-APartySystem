<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>成绩总表</title>

<link rel="stylesheet" href="UserTable.css">

</head>
<body>

<form name="scoresForm" method="get"> 
		<div align="center">
		<h1>您的得分:<%=request.getAttribute("userpoint") %></h1>	
			<input id="but1" onclick='location.href=("UserExamServlet")'
				type="button" value="重新答题">
					
		</div>
		<table align="center"><tr>
				<td>序号</td>
				<td>用户名</td>
				<td>得分</td>
			</tr>
			<c:forEach items="${scores}" var="score" varStatus="status">
				<tr>
					<td>${ status.index + 1}</td>
					<td>${score.name}</td>
					<td>${score.userscore}</td>
			</c:forEach>
		</table><br>
		
	</form>
</body>
</html>