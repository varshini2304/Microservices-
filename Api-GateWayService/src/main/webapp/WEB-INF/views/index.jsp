<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Page to All</title>
</head>
<body>
<h1><a href="http://localhost:9203/user-service/greet">User Service</a></h1>
<h1><a href="http://localhost:9201/product-service/greet">Product Service</a></h1>
<h1><a href="http://localhost:9202/billing-service/greet">Billing Service</a></h1>
<form action="/register" method="post">
<label>FirstName</label>
<input type="text" name="firstname" placeholder="First Name"/><br/>
<label>LastName</label>
<input type="text" name="lastname" placeholder="Last Name"/><br/>
<label>Age</label>
<input type="number" name="age" placeholder="Age"/><br/>
<label>Email</label>
<input type="email" name="email" placeholder="Email"/><br/>
<label>Gender</label>
<input type="text" name="gender" placeholder="Gender"/><br/>
<input type="submit"/>
</form>







</body>
</html>