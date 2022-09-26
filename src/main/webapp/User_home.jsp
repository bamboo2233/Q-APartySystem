<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>欢迎学习党史！</title>
<script>

function alter() {
    if (window.confirm('是否修改信息?')) {
        window.location.href = 'UserEditUser.jsp';
    } else {
        return false;
    }
}
    function logout() {
        if (window.confirm('是否退出?')) {
            window.location.href = 'UserLogin.jsp';
        } else {
            return false;
        }
    }
</script>
<style>


header {
 	background-image:url(images/header.jpg);
    margin: 10px 20px;
    overflow: hidden;
    height: 200px;
    border-bottom-left-radius: 20px;
    border-bottom-right-radius: 6px;}
header div {
    width: 1200px;
    margin: auto;
}
header nav {
    float: right;
    margin-right: 20px;
    
}
header nav ul li {
    float: left;
    padding-left: 20px;
    line-height: 300px;
    color:#FFA500 ;
    list-style-type:none;
}

header nav ul li a{
	color:#FFA500 ;
}
iframe {
    min-width: 100%;
    min-height: 700px;
    marginwidth: 200px;
    scrolling:no;
    border: none;
}


</style>
</head>
<body>

<header role="header">
    <div>
        <nav role="user">
            <ul>
                <li>欢迎用户: <strong>${sessionScope.name} </strong></li>
                <li><a href="javascript:void(0);" onclick="alter()">修改信息</a></li>
                <li><a href="javascript:void(0);" onclick="logout()">退出登录</a></li>
                
            </ul>
        </nav>
    </div>
</header>
<iframe src="UserExamServlet"  name="main"></iframe>




</body>
</html>