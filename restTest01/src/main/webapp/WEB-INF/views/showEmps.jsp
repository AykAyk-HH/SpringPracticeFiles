<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="com.expleo.webSpringDataJpa.entity.Emp"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
All employees are : ${itr}<hr>
<table border = "1">
        <thead>
            <tr>
                <th style="width:33%">ID</th>
                <th style="width:33%">Name</th>
                <th style="width:50%">Salary</th>
                <!-- Add more columns as needed -->
            </tr>
        </thead>
        <tbody>
<%
Iterable<Emp> itr = (Iterable<Emp>)request.getAttribute("itr");
for(Emp emp: itr){
	%>
	<tr>
        <td><%=emp.getEmpno() %></td>
        <td><%=emp.getName() %></td>
        <td><%=emp.getSalary() %></td>
        <!-- Add more columns as needed -->
    </tr>
	<%
	
}        
%>
 
 
        </tbody>
    </table>
</body>
</html>