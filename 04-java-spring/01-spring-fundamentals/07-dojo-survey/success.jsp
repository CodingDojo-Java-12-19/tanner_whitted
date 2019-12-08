<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User</title>
</head>
<body>

	<h2>Submitted Info</h2>
	<br>
	<br>
	<span> Name: <c:out value="${ name }"/> </span>
	<br>
	<span> Dojo Location: <c:out value="${ dojoLocation }"/> </span>
	<br>
	<span> Favorite Language: <c:out value="${ favoriteLanguage }"/> </span>
	<br>
	<span> Comment: <c:out value="${ comment }"/> </span>
	<br>
	<a href="/">back</a>

</body>
</html>