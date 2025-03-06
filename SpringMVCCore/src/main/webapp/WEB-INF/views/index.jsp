<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Save Student</title>
</head>
<body>
	<h1>Save Student Details</h1>
	<form action="save" method="post">
		<table>
			<tr>
				<td>Enter roll no</td>
				<td><input type="number" name="rollNo"/></td>
			</tr>
			<tr>
				<td>Enter name</td>
				<td><input type="text" name="name"/></td>
			</tr>
			<tr>
				<td>Enter marks</td>
				<td><input type="number" name="marks"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="Save"/></td>
			</tr>
		</table>
	</form>
	
	<br/>
	<br/>
	
	<h1>Update Student Details</h1>
	<form action="update" method="post">
		<table>
			<tr>
				<td>Enter roll no</td>
				<td><input type="number" name="rollNo"/></td>
			</tr>
			<tr>
				<td>Enter name</td>
				<td><input type="text" name="name"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="Update"/></td>
			</tr>
		</table>
	</form>
</body>
</html>