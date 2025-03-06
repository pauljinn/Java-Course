<%@page import="java.util.random.RandomGeneratorFactory"%>
<%@page import="java.util.random.RandomGenerator"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" import="java.util.Random"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Header</title>
</head>
<body>
	<%! 
		Random random = new Random();
	%>
	
	<%= 
		"<h" + (random.nextInt(5)  + 1) + ">" + "Header" + "</h"+ (random.nextInt(5)  + 1) + "/>" 
	%>
	
	<%
		pageContext.setAttribute("name", "header", PageContext.SESSION_SCOPE);
	%>
</body>
</html>