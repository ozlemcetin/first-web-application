
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>
<meta charset="UTF-8">
<title>Login</title>
</head>


<body>

	<p>${errorMessage}</p>

	<!-- action="/login.do" -->
	<!-- action="/spring-mvc/login" -->
	<form action="/login" method="POST">

		<div>
			<label for="userName">Enter your name:</label> <input type="text"
				id="userName" name="userName">
		</div>
		<div>
			<label for="userPassword">Password:</label> <input type="password"
				id="userPassword" name="userPassword">
		</div>
		<div>
			<input type="submit" value="Login">
		</div>

	</form>

</body>

</html>