<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring MVC demo</title>
</head>
<body>
	<h3>Put your name</h3>
	<form action="/spring-mvc/processForm" method="get">
		<input name="name" placeholder="give your name">
		<button type="submit">Enter</button>
	</form>
</body>
</html>