<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Expression Language Demo - Output</title>
</head>
<body>
	<h1>Expression Language Demo - Output</h1>
	
	<hr/>
	<h2>Using the Employee Bean</h2>
	<!-- using hourly employee bean -->
	
	Employee ID: ${employee.employeeID}<br/>
	Employee Name: ${session.employee.firstName} ${session.employee.lastName} <br/>
	Hourly Rate: ${employee["hourlyRate"] }<br/>
	
	<hr/>
	<h2>Using the Map</h2>
	<!-- getting Map values -->
	Table of Tax Rates:
	<table border=1>
		<tr>
			<td>
				Trí
			</td>
			<td>
				${taxRates.Trí}
			</td>
		</tr>
		
		<tr>
			<td>
				Triều
			</td>
			<td>
				${taxRates.Triều}
			</td>
		</tr>
		
		<tr>
			<td>
				Phúc
			</td>
			<td>
				${taxRates.Phúc}
			</td>
		</tr>
	</table>
	
	<hr/>
	<h2>Using the EL operations</h2>
	<!-- some EL operation examples -->
	
	<h3>A temperature calculation:</h3>
	<p>
		3C = ${(9.0/5.0)*3.0 + 32.0} F
	</p>
	
	<h3>An Expression language if-statement:</h3>
	10 is an ${10 mod 2 == 0 ? "even" : "odd"} number.
	
	<hr/>
	<h2>Using the implicit objects</h2>
	<!-- some EL implicit objects examples -->
	<h3>Check to see if the hoursWorked field is empty:</h3>
	${empty param.hoursWorked}
	
	<h3>Check combined with EL if statement:</h3>
	${empty param.hourWorked ? "Please enter hours worked." : "Thanks for entering hours worked." }
	
	<h3>Using param and math operation:</h3>
	Employee Compensation: ${employee.hourlyRate * param.hoursWorked}
	
	<h3>Using header to get host information:</h3>
	${header["host"]}
	
	<hr/>
</body>
</html>