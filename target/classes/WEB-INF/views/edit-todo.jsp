<%@page import="java.util.Date"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>
<meta charset="UTF-8">
<title>Edit Todo</title>
</head>


<body>

	<p>Add a new todo!</p>

	<form action="/add-todo" method="POST">

		<div>
			<label for="desc">Description: </label> <input type="text"
				name="desc" id="desc" />
		</div>

		<input type="submit" value="Add" />

	</form>



</body>

</html>