<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ninja Gold</title>
</head>
<body>
	<h1>Ninja Gold</h1>
	<h3>Your Gold: <c:out value="${totalGold}"/></h3>

	<c:forEach items="${myBuildings}" var="building">
	<div class="building">
	<h3><c:out value="${building.getName()}" /></h3>
	<p>(earns <c:if test="${building.getCanLose()}"> / Loses</c:if><c:out value="${building.getMin()}" />- <c:out value="${building.getMax()}" /> gold)</p>
	<form method="post" action="/getGold">
	<input type="hidden" name="building" value="<c:out value="${building.getName()}" />">
	<button>Find Gold!</button>
	</form>
	</div>
	</c:forEach>

	<h3>Activities:</h3>
	<div class="activities">

	<c:forEach var="activity" items="${activityLog }">


	<p class='${activity.contains("lost")? "red":"green"}'><c:out value="${activity}"/></p>
	</c:forEach>
	</div>
</body>
</html>