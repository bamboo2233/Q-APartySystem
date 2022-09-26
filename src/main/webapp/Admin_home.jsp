<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>管理员页面</title>

 
<script>
    function logout() {
        if (window.confirm('是否退出?')) {
            window.location.href = 'UserLogin.jsp';
        } else {
            return false;
        }
    }
</script>
<style>
    /*********** 声明公共元素样式 ***********/
* {
    margin: 0;
    padding: 0;
}
body {
    background-color: #efefef;
}
li {
    list-style-type: none;
    /***** #FFA500 ***/
    
}
a {
    color:#FFA500;
    text-decoration-line: none;
}
a:hover {
    color: brown;
    text-decoration-line: underline;
}
/*********** 声明顶部样式 ***********/
header {
    background-image: linear-gradient(to right, #f83600 0%, #f9d423 100%);;
    margin: 10px 20px;
    overflow: hidden;
    height: 60px;
    border-bottom-left-radius: 20px;
    border-bottom-right-radius: 6px;}
header div {
    width: 1200px;
    margin: auto;
}
header h1 {
    float: left;
    margin-left: 20px;
    font-weight: normal;
    line-height: 50px;
    
}
header nav {
    float: right;
    margin-right: 20px;
    
}
header nav ul li {
    float: left;
    padding-left: 20px;
    line-height: 80px;
    color:#344648 ;
}

header nav ul li a{
	color:#344648 ;
}
/*********** 声明主体区样式 ***********/
/*侧边导航栏*/
main {
    width: 1200px;  /*内容区宽度*/
    height: 800px;
    margin: 30px auto 0;
    padding-left: 200px;
    overflow: hidden;
    /*布局参考线*/
    /*border: 1px solid red;*/
}
main article {
    float: left;
    /*布局参考色块*/
    /*background-color: #FD6FCF;*/
    width: 100%;
    min-height: 100%;
    background: linear-gradient(to bottom, lightgrey, #ededed);
    box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.1);
    border-radius: 6px;
}
main aside {
    float: left;
    border-radius: 6px;
    background: #FFF9E9;
    box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.1);
    padding-bottom: 40px;
    width: 175px;
    margin-left: -100%;
    position: relative;
    left: -197px;
    
}
main aside nav li {
    line-height: 2rem;
    color:#FFA500 ;
}
main aside nav li:first-child,main aside nav li a{
	font-size:18px;
    padding: 10px 15px;
    display: block;
}
main aside nav li a.active,main aside nav li a:hover {
    border-left: 3px solid brown!important;
    background-image: linear-gradient(-20deg, #fc6076 0%, #ff9a44 100%);
    padding-left: 15px;
    margin-left: -3px;
}
main article iframe {
    min-width: 100%;
    min-height: 700px;
    margin: auto;
    border: none;
}
main article footer p {
    text-align: center;
}
</style>
</head>
<body>

<!--顶部信息区-->
<header role="header">
    <div>
        <h1>党史问答系统</h1>
        <nav role="user">
            <ul>
                <li>欢迎管理员:<strong>${username}</strong></li>
                <li><a href="javascript:void(0);" onclick="logout()">退出登录</a></li>
            </ul>
        </nav>
    </div>
</header>
<!--圣杯二列布局-->
<main role="main">
    <!--主体内联框架区-->
    <article role="content">
        <iframe src="welcome.html"  name="main"></iframe>
        <footer role="copyright">
            <p>©2022admin</p>
        </footer>
    </article>
    <!--左侧导航区-->
    <aside>
        <nav role="option">
            <ul>
                <li>管理列表</li>
                <li><a href="manageExamServlet" target="main">试题管理</a></li>
                <li><a href="manageUserServlet" target="main">用户管理</a></li>
                <li><a href="manageScoreServlet" target="main">成绩查看</a></li>
                <li><a href="welcome.html" target="main">其他</a></li>
            </ul>
        </nav>
    </aside>
</main>



</body>
</html>