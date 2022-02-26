<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="resservlet" method="post">
<label>Product Id</label>
<input name="Id" type="text" name="Id" placeholder="Product Id"><br><br>
<label>Product name</label>
<input name="name" type="text" name="name" placeholder="Product name"><br><br>
<label>Product price</label>
<input name="price" type="text" name="price" placeholder="Price"><br><br>
<label>Date</label>
<input name="date" type="text" name="date" placeholder="Date"><br><br>
<input type="submit" value="Submit">
</form>

</body>
</html>