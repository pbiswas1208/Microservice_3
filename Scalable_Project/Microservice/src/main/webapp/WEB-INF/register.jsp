<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Page</title>
</head>
<body>
    <h2>Registration Page</h2>
    <form action="/set-user" method="post">
        <label for="username">UserName:</label>
        <input type="text" id="userName" name="userName"><br><br>
        
        <label for="password">Password:</label>
        <input type="password" id="password" name="password"><br><br>
        
        <label for="password">Re-enter Password:</label>
        <input type="password" id="password" name="password1"><br><br>
        
        <input type="submit" value="Register"><br><br>

    </form>
</body>
</html>
