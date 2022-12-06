<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Start Page</title>
</head>
<body>
<h1>Welcome to the EMP!</h1>

<h2>Type in your name to continue:</h2>

<form action="LoginServlet" method="post">
    Name: <input type="text" name="name">
    <input type="submit" value="Submit">
</form>
</body>
</html>