<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
	rel="stylesheet" 
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" 
	crossorigin="anonymous">
<title>Products and Categories</title>
</head>
<body>
	<div class="container">
		<nav>
			<h3><a href="/">Products</a> | <a href="/categories">Categories</a></h3>
		</nav>
		<h2>${ product.name }</h2>
		<p>${ product.description }</p>
		<h3>Categories</h3>
		<ul>
		<c:forEach items="${ product.categories }" var="cat">
			<li>${ cat.name }</li>			
		</c:forEach>
		</ul>
		<h3>Add Category</h3>
		<form:form action="/associations/products" method="POST" modelAttribute="association">
			<form:input type="hidden" path="product" value="${ product.id }"/>
			<div class="form-group">
		        <form:label path="category">Song Title</form:label>
		        <form:errors path="category"/>
		        <form:select class="form-control" path="category">
		        <c:forEach items="${ notInCategories }" var="nonCat">
		        	<option value=${ nonCat.id }>${ nonCat.name }</option>
		        </c:forEach>
		        </form:select>
		    </div>
		    <button class="btn btn-primary">Add</button>
		</form:form>
	</div>
</body>
</html>