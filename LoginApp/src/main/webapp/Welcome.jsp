<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>
	<%
		//Preventing the back button to coming back to this page on logout.
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); //Http 1.1
		response.setHeader("Pragma", "no-cache"); //Http 1.0
		response.setHeader("Expires", "0"); //Proxy server
	%>
	<c:if test="${empty userName}">
		<%
			response.sendRedirect("LoginForm.jsp");
		%>
	</c:if>

	Welcome ${userName}

	<br />
	<form method="get" action="Logout">
		<input type="submit" value="logout" />
	</form>

</body>
</html>