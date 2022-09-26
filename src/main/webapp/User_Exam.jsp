<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户答题页面</title>

<style>

.formdiv{

 display: flex;
 justify-content: center;
}
.divCss{
	margin-bottom: 10px;
}
.olCss{
	padding-left: 20px;
    margin-top: 0px;
    margin-bottom: 0px;
	margin-left: 40px;
}
.inputClass {
	float:left;
	margin-left: -50px;
}

</style>
 

</head>
<body>
<div class="formdiv">
	<form action="CountServlet" method="get">
	
		<c:forEach items="${lists}" var="test" varStatus="status">
			<div class="divCss">${ status.index + 1}、${test.testTitle}
				<ol type="A" start="" class="olCss" name="single" >
			<input class="inputClass" type="radio" name="${test.testId}" value="A" /><li>${test.optionA}</li>
			<input class="inputClass" type="radio" name="${test.testId}" value="B" /><li >${test.optionB}</li>
			<c:if test="${test.testType=='S'}">
			<input class="inputClass" type="radio" name="${test.testId}" value="C" /><li >${test.optionC}</li>
			</c:if>
		</ol>

			</div>
			
		</c:forEach>
<input type="submit" value="提交" >
	</form>
</div>





</body>
</html>