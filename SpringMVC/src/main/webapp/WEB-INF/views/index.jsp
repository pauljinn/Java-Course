<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Alien</title>
</head>
<body>
	
	<form action="addAlien">
	<h1>Welcome ${name }</h1>
	<br/>
		<label for="id">Enter ID</label> <input type="number"
			name="id" /> <br /> <br /> <label for="name">Enter
			name</label> <input type="string" name="name" /> <br /><br/> <input
			type="submit" value="addAlien" />
	</form>
</body>
</html>