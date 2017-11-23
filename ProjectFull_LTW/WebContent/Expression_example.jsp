<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Expression Language Demo - Input</title>
</head>
<body>

<h1>JSP Expression Language Demo - Input</h1>

<form name="employeeForm" action="EmployeeServlet" method="get">
	<p>
		Please enter the following information:
	</p>
	
	<label>Employee ID:</label>
	<input type="text" name="employeeID"/><br />
	<lable>First Name:</lable>
	<input type="text" name="firstName"/><br />
	
	<lable>Last Name:</lable>
	<input type="text" name="lastName"/><br />
	
	<lable>Hourly Rate:</lable>
	<input type="text" name="hourlyRate"/><br />
	
	<lable>Hours Worked:</lable>
	<input type="text" name="hoursWorked"/><br />
	
	<input type="submit" name="submit" value="Go!"/><br />
</form>
	
</body>
</html>