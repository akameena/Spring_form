<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
		.error {color:red}
	</style>
</head>
<body>
	hello...
	
	<!--  when form is loded spring mvc will call employee.getfname() and employee.getlname -->
	 <form:form action="process" modelAttribute="employee">
		First Name:<form:input path="fname"/> 
				   <form:errors path ="fname" cssClass="error" />
		<br>	<!-- fname and lname is same as employee field -->							
		<br>
		Last Name: <form:input path="lname"/>  <!--model attribute employee 
												 is same as Employee object created in java class as name employee --> 
		
		<br>
		<br>
		Age: <form:input path="age"/>
		<form:errors path ="age" cssClass="error" />
		
		
		<br>
		<br>
		Post Code: <form:input path="postalcode"/>
		<form:errors path ="postalcode" cssClass="error" />
		<br>
		<br>
		Gmailid:<form:input path="gmailid"/>
		<form:errors path ="gmailid" cssClass="error" />
		<br>
		<br>
		Field: <form:select path="field">
			<%-- <form:option value="Jaba" label="Java"/>
			<form:option value="python" label="Python"/>
			<form:option value="c++" label="C++"/> --%>
			<form:options items="${employee.fieldList}"/> <!--  here items show collection of data-->
			
		</form:select>
		<input type = "submit" value="submit">
	</form:form> 
</body>
</html>