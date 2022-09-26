<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>编辑试题</title>

<style>
<%
	request.setCharacterEncoding("utf-8"); 

	String testId = request.getParameter("testId");
	String testTitle = request.getParameter("testTitle");	
	String optionA = request.getParameter("optionA");
	String optionB = request.getParameter("optionB");
	String optionC = request.getParameter("optionC");
	String testAnswer = request.getParameter("testAnswer");
	
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

<form name="editExamForm" action="EditExamServlet" method=get>
		<h1 align="center">请编辑试题</h1>
		<div class="form-item">
			<label>题库序号</label> <input type="text" name="testId" value=<%=testId%>>
		</div>
		<div class="form-item">
			<label>题目</label> <input type="text" name="testTitle" value=<%=testTitle%>>
		</div>
		<div class="form-item">
			<label>选项A</label> <input type="text" name="optionA" value=<%=optionA%>>
		</div>
		<div class="form-item">
			<label>选项B </label> <input type="text" name="optionB" value=<%=optionB%>>
		</div>
		<div class="form-item">
			<label>选项C </label> <input type="text" name="optionC" value=<%=optionC%>>
		</div>
		<div class="form-item">
			<label>答案</label> <input type="text" name="testAnswer" value=<%=testAnswer%>>
		</div>
		<div class="form-item">
			<input type="submit" value="修改">
		</div>
	</form>


</body>
</html>