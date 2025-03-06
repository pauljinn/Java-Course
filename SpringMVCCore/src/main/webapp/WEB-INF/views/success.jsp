<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>Roll No</th>
				<th>Name</th>
				<th>Marks</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="student" items="${students}">
				<tr>
					<td>${student.rollNo}</td>
					<td>${student.marks}</td>
					<td>${student.name}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>