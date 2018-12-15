<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	hello...
	<!--  when form is loded spring mvc will call employee.getfname() and employee.getlname -->
	 <form:form action="process" modelAttribute="employee">
		First Name:<form:input path="fname"/> 
		<br>	<!-- fname and lname is same as employee field -->							
		<br>
		Last Name: <form:input path="lname"/>  <!--model attribute employee 
												 is same as Employee object created in java class as name employee --> 
		
		<br>
		<br>
		<input type = "submit" value="submit">
	</form:form> 
</body>
</html>