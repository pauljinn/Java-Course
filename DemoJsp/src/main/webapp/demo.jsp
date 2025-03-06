<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Demo</title>
</head>
<body>
	<%
		out.println(request.getAttribute("label"));
	%>
	
	<!-- Expression Language (EL) 
	Equivalent of above code-->
	${label}
	
	<!-- JSP Standard Tag Library (JSTL) -->
	<c:out value="${label}"/>
	<c:out value="${student.rollNo}"/>
	<br/>
	<!-- SQL JSTL -->
	<sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/user" user="root" password="1234"/>
	<sql:query var="res" dataSource="${db}">select * from student</sql:query>
	<c:forEach items="${res.rows}" var="student">
		<c:out value="${student.rollno}"></c:out> : <c:out value="${student.marks}"></c:out> : <c:out value="${student.name}"></c:out>
		<br/>
	</c:forEach>
</body>
</html>