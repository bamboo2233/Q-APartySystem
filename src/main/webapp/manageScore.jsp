<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>成绩排名</title>
<link rel="stylesheet" href="UserTable.css">
</head>
<body>

<form name="ScoresForm" method=get> 
		
		<table align="center"><tr>
				<td>序号</td>
				<td>用户</td>
				<td>得分</td>
				<td>提交时间</td>
			</tr>
			<c:forEach items="${score}" var="score" varStatus="status">
				<tr>
					<td>${ status.index + 1}</td>
					<td>${score.name}</td>
					<td>${score.userscore}</td>
					<td>${score.time}</td>
					</tr>
			</c:forEach>
		</table><br>
		
	</form>

</body>
</html>