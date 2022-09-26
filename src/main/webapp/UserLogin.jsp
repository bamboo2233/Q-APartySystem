<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>党史问答-登录</title>
<link rel="stylesheet" href="Userlogin.css">
<script type="text/javascript">
	function submitButton(){
		UserLogin.action="LoginServlet";
		UserLogin.submit();
	}
</script>


</head>
<body>
	<div class="login-box">
		<h4>登录</h4>
		<div class="input-box">
			<form name="UserLogin" action="#" method="get">

				<div class="input-text">
					<span class="login-login"><img src="images/loginUser.png" style="width: 25px; height: 25px;"></span> 
						<input name="username"type="text" placeholder="用户名">
				</div>
				<div class="input-text">
					<span class="login-passwd"><img src="images/loginPwd.png" style="width: 25px; height: 25px;"></span> 
						<input name="password" type="password" placeholder="密码">
				</div>
				<div class="button">
					<button  onclick="submitButton()"><span>登录 </span></button>
				</div>
				<div class="signup">
					没有账号？--><a href="SignIn.jsp">注册</a>
				</div>
			</form>
		</div>
	</div>

</body>
</html>