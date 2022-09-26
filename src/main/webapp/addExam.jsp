<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加试题</title>
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
<form name="addExamform" action="addExamServlet" method=get>
		<h1 align="center">请输入试题</h1>
		<div class="form-item">
			<label>试题类型</label> 
			<input type="radio" name="type" value="S" >单选题
			<input type="radio" name="type" value="TF" >判断题 
		</div>
		<div class="form-item">
			<label>题目 </label> <input type="text" name="title">
		</div>
		<div class="form-item">
			<label>选项A</label> <input type="text" name="A">
		</div>
		<div class="form-item">
			<label>选项B</label> <input type="text" name="B">
		</div>
		<div class="form-item">
			<label>选项C</label> <input type="text" name="C">
		</div>
		<div class="form-item">
			<label>试题类型</label> 
			<input type="radio" name="answer" value="A" >A
			<input type="radio" name="answer" value="B" >B
			<input type="radio" name="answer" value="C" >C 
			
		</div>
		
		<div class="form-item">
			<input type="submit"  value="添加">
		</div>
	</form>

</body>
</html>