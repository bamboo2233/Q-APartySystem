<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户管理</title>
<link rel="stylesheet" href="UserTable.css">
<script>
</script>
</head>
<body>
<form name="UsersForm" method=get> 
		<div align="center">
			<input id="but1" onclick='location.href=("addUser.jsp")'
				type="button" value="添加学生">&emsp; 
			
		</div>
		<table align="center"><tr>
				<td>序号</td>
				<td>姓名</td>
				<td>密码</td>
				<td>电话</td>
				<td colspan="2">操作选择</td>
			</tr>
			<c:forEach items="${users}" var="user" varStatus="status">
				<tr>
					<td>${ status.index + 1}</td>
					<td>${user.userName}</td>
					<td>${user.password}</td>
					<td>${user.phone}</td>
					<td><input type="button" id="but3"  value="删除"
					onclick='location.href=("DeleteUserServlet?userName=${user.userName}")'></td>
					<td><input type="button" id="but4" value="编辑"
					onclick='location.href=("EidtUser.jsp?&userName=${user.userName}&password=${user.password}&phone=${user.phone}")'>
					</td>	</tr>
			</c:forEach>
		</table><br>
		
	</form>


</body>
</html>