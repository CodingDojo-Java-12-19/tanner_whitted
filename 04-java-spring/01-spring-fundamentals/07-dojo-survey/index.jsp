<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo Survey</title>
</head>
<body>

	<h1>Dojo Survey</h1>

	<form action="/survey" method ="post">
		<input type="text" name="name" placeholder="name"/>
		<br>
		<input type="text" name="dojoLocation" placeholder="Dojo Location"/>
		<br>
		<input type="text" name="favoriteLanguage" placeholder="Favorite Language"/>
		<br>
		<input type="text" name="comment" placeholder="Comments (optional)"/>
		<br>
		<button>Submit</button>
	</form>

</body>
</html>