<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>编辑用户</title>
<style>
<%
	request.setCharacterEncoding("utf-8"); 

	String userName = request.getParameter("userName");	
	String password = request.getParameter("password");
	String phone = request.getParameter("phone");
	
	%>

.form-item {
	margin: 0px auto;
	display: flex;
	margin-bottom: 20px;
	justify-content:center;
}
label{
	padding-right:20px;
}

</style>


</head>
<body>

<form name="editForm" action="EditUserServlet" method=get>
		<h1 align="center">请编辑学生信息</h1>
		<div class="form-item">
			<label>用户名:</label> <input type="text" name="userName" value=<%=userName%>>
		</div>
		<div class="form-item">
			<label>密码:</label> <input type="text" name="password" value=<%=password%>>
		</div>
		<div class="form-item">
			<label>电话: </label> <input type="text" name="phone" value=<%=phone%>>
		</div>
		<div class="form-item">
			<input type="submit" value="修改">
		</div>
	</form>


</body>
</html>