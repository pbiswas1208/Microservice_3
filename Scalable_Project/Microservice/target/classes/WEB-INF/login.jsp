<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Page</title>
</head>
<body>
    <h2>Login Page</h2>
    <form action="/login" method="post">
      <c:if test ="${not empty error}">
        <div style ="color : red;"><h3>${error}</h3>
        </div>
         </c:if>
         <c:if test ="${not empty registrationSuccess}">
        <div style ="color : green;"><h3>${registrationSuccess}</h3>
        </div>
         </c:if>
         <c:if test ="${not empty registrationError}">
        <div style ="color : red;"><h3>${registrationError}</h3>
        </div>
         </c:if>
        <label for="username">UserName:</label>
        <input type="text" id="userName" name="userName"><br><br>
        
        <label for="password">Password:</label>
        <input type="password" id="password" name="password"><br><br>
        
        <input type="submit" value="Login"><br><br>
        <input type="button" value="Register" onclick="goToRegister()">
    </form>
    <script type="text/javascript">
     function goToRegister(){
    	 alert("going to register");
    	 window.location.href="/register";
     }
    </script>
</body>
</html>
