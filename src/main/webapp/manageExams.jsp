<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>试题管理</title>
<link rel="stylesheet" href="UserTable.css">

</head>
<body>
<form name="ExamsForm" method=get> 
		<div align="center">
			<input id="but1" onclick='location.href=("addExam.jsp")'
				type="button" value="添加试题">
		</div>
		<table align="center"><tr>
				<td>序号</td>
				<td>题目</td>
				<td colspan="3">选项</td>
				<td>答案</td>
				<td colspan="2">操作选择</td>
			</tr>
			<c:forEach items="${exams}" var="exam" varStatus="status">
				<tr>
					<td>${ status.index + 1}</td>
					<td>${exam.testTitle}</td>
					<td>${exam.optionA}</td>
					<td>${exam.optionB}</td>
					<td>${exam.optionC}</td>
					<td>${exam.testAnswer}</td>
					<td><input type="button" id="but3"  value="删除"
					onclick='location.href=("DeleteExamServlet?testId=${exam.testId}")'></td>
					<td><input type="button" id="button4" value="编辑"
					onclick='location.href=("EidtExam.jsp?&testId=${exam.testId}&testTitle=${exam.testTitle}&optionA=${exam.optionA}&optionB=${exam.optionB}&optionC=${exam.optionC}&testAnswer=${exam.testAnswer}")'>
					</td>	</tr>
			</c:forEach>
		</table><br>
		
	</form>



</body>
</html>