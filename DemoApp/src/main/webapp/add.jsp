<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
	<!-- DIRECTIVE TAG 
		For importing packages
	-->
	<%@page import="java.util.List, java.util.ArrayList" %>

	<!-- DECLARATION TAG
	If you want to declare something outside the service() method.
	 -->
	<%!
		int sum = 0;
		List<Integer> ls;
	%>
	
    <!--SCRIPTLET  TAG-->
    <!-- All content goes inside service() method of servlet  
    	 You can access request and response object here.
    -->
	<%
	 	ls = new ArrayList<>();
		int a = Integer.parseInt(request.getParameter("a"));
		int b = Integer.parseInt(request.getParameter("b"));
		sum = a+b;
		out.println("Sum is " + sum);
		ls.add(1);
		int div = 2/0;
	%>
	
	<!--  EXPRESSION TAG -->
	<!-- Used to print something on page equivalent to out.Println() -->
	
	<%= "<br/>List is " + ls %>
	
	<%= "JSP page included in he current page is " + session.getAttribute("name") %>
</body>
</html>