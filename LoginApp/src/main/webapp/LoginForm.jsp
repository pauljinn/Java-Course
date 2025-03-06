<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<form method="get" action="Login">
		<table>
			<tr>
				<td>Username</td>
				<td><input type="text" name="username" value="${userName}"/></td>
			</tr>
			<c:if test="${not empty userNameError}">
				<tr>
					<td></td>
					<td>${userNameError}</td>
				</tr>
			</c:if>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" /></td>
			</tr>
			<c:if test="${not empty passwordError}">
				<tr>
					<td></td>
					<td>${passwordError}</td>
				</tr>
			</c:if>
			<tr>
				<td><input type="submit" value="login" /></td>
			</tr>
		</table>
	</form>
</body>
</html>