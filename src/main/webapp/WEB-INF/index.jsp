<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<form method="POST" action="/survey">
    <label>Your name:<input type="text" name="name"></label>
    <label>Dojo Location:<input type="text" name="location"></label>
    <label>Favorite Language:<input type="text" name="language"></label>
    <textarea name="comments"></textarea>
    <button type="submit">Submit</button>
</form>
</body>
</html>