<%@page import="java.util.Date"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>
<meta charset="UTF-8">
<title>My First JSP</title>
</head>

<%
String password123 = request.getParameter("password");

Date date = new Date();
%>

<body>

	<p>Welcome ${name}! Your password is ${password }</p>


	<p>
		Current date is
		<%=date%></p>

</body>

</html>