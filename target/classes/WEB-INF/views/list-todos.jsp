<%@page import="java.util.Date"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>


<body>

	<p>Hi ${userName }!</p>

	<p>
		<a href="/add-todo" class="button">Add a New Todo</a>
	</p>

	<p>Your todo list is as follows:</p>
	<p>${todoListForUser}</p>

</body>

</html>