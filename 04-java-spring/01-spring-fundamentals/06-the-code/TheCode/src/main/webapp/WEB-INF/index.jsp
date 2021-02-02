<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Code</title>
<link rel="stylesheet" href="ccs/main.css">
</head>
<body>
	<h3>What is the code?</h3>
	<form action="/attempt" method="post">
	<span><c:out value="${ error }"></c:out></span>
	<input type="text" name="guess" placeholder=""/>
	<button>Try Code!</button>
	</form>
</body>
</html>