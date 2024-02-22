<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body><h1>Enter employee details</h1>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>  

	<h1>
		Emp Form
		<spring:form action="submitEmp" method="post" modelAttribute="emp">
			<spring:input path="empno" /> 
			
			<spring:input path="name" />
			<spring:errors path="name"/>
			
			<spring:input path="salary" />
			<spring:errors path="salary"/>
			
			<br> <input type="submit" />
		</spring:form>
	</h1>
<!-- <form action = "submitEmp" method = "post"> -->
<!-- 		Enter Employee number : <input type = "number" name = "empno" /> -->
<!-- 		Enter name : <input type = "text" name = "name" /> -->
<!-- 		Enter salary : <input type = "number" name = "salary" /> -->
<!-- 		<input type = "submit" /> -->
<!-- 	</form> -->
</body>
</html>