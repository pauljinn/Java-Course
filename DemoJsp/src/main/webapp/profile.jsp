<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <%
  	Class.forName("com.mysql.cj.jdbc.Driver");
  	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root", "1234");
    Statement st = con.createStatement();
  	
  	ResultSet res = st.executeQuery("select * from student order by rollno desc limit 1");
  	res.next();
  	out.println(res.getInt(1) + " " + res.getDouble(2) + " " + res.getString(3)); 
  %>
</body>
</html>