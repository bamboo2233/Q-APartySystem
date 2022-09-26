<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加用户</title>

<style>

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
<script>
function add(){
	
}
</script>
</head>
<body>

<form name="addUserform" action="addUserServlet" method=get>
		<h1 align="center">请输入用户信息</h1>
		<div class="form-item">
			<label>用户名 </label> <input type="text" name="username">
		</div>
		<div class="form-item">
			<label>密码</label> <input type="text" name="password">
		</div>
		<div class="form-item">
			<label>电话</label> <input type="text" name="phone">
		</div>
		<div class="form-item">
			<label>身份</label> 
			<input type="radio" name="identity" value="admin" >管理员
			<input type="radio" name="identity" value="normal" checked>答题用户 </div>
		</div>
		
		<div class="form-item">
			<input type="submit"  value="添加">
		</div>
	</form>


</body>
</html>