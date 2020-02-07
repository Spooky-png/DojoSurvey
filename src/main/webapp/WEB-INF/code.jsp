<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>The Secret</title>
</head>
<body>
<h3>Submitted Info:</h3>
<p>Name: <c:out value="${name}"/></p>
<p>Dojo Location: <c:out value="${location}"/></p>
<p>Favorite Language: <c:out value="${language}"/></p>
<p>Comments: <c:out value="${comments}"/></p>

</body>
</html>