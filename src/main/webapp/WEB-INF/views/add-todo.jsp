
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>
<meta charset="UTF-8">
<title>Add Todo</title>

<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">


</head>


<body>

	<div class="container">

		<h1>Add a new todo!</h1>

		<form action="/add-todo" method="POST">

			<fieldset class="form-group">
				<label for="desc">Description: </label> <input type="text"
					class="form-control" required="required" name="desc" id="desc" />
			</fieldset>

			<input type="submit" class="btn btn-success" value="Add" />

		</form>

	</div>

	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>
</html>
