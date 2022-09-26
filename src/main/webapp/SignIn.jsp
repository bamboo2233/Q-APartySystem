<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>党史问答-注册</title>
<link rel="stylesheet" href="Userlogin.css">
<script type="text/javascript">
function check(){
/*非空*/
if(SignIn.username.value==""){
alert("用户名不能为空");
SignIn.username.focus();
return false;
}
 
/*密码非空*/
if(SignIn.password.value==""){
alert("密码不能为空");
SignIn.password.focus();
return false;
}
 
/*密码含有非符号、字母、数字以外字*/
var illegal=/^[0-9a-zA-Z!~@#$%^&*()_+`\-={}:";'<>?,.\/]*$/g; 
var objExp2=new RegExp(illegal);
if(objExp2.test(SignIn.password.value)==false){
alert("密码含有非法字符");
SignIn.password.focus();
return false;
}
 
/*密码小于6位数*/
if(SignIn.password.value.length < 6){
alert("密码位数过小，请输入6-8位数字");
SignIn.password.focus();
return false;
}
 
/*密码大于16位数*/
if(SignIn.password.value.length > 8){
alert("密码位数过大，请输入6-8位数字");
SignIn.password.focus();
return false;
}
 
var reg_tel = /^(13[0-9]|14[01456879]|15[0-35-9]|16[2567]|17[0-8]|18[0-9]|19[0-35-9])\d{8}$/;
if (SignIn.phone.value =="") {
	alert("手机号码不能为空！");
	SignIn.phone.focus();	
	return false;
		}
else if (!reg_tel.test(SignIn.phone.value)) {
	alert("请正确填写您的手机号码！");
	SignIn.phone.focus();
	return false;
		}

SignIn.submit();
}
</script>


</head>
<body>
<div class="login-box">
        <h4>注册</h4>
        <div class="input-box">
        <form name="SignIn" action="SigninServlet" method="get">
             <div class="input-text">
                 <span class="login-login"><img src="images/loginUser.png"style="width: 25px;height: 25px;"></span>
                 <input name="username" type="text" placeholder="用户名">
             </div>
             <div class="input-text">
                <span class="login-passwd"><img src="images/loginPwd.png" style="width: 25px;height: 25px;"></span>
                <input  name="password" type="password" placeholder="密码6~8位">
            </div>
             <div class="input-text">
                <span class="login-phone"><img src="images/signInPhone.png" style="width: 25px;height: 25px;"></span>
                <input  name="phone" type="text" placeholder="电话号码11位">
            </div>
            <div class="button">
                <input  type="button" onclick="check()"   value="注册">
            </div>
           </form>
        </div>
    </div>   

</body>
</html>