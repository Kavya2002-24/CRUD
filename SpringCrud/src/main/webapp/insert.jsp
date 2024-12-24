<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="insert" method="post">

<input type="text" name="name" placeholder="enter name"><br>
<input type="number" name="mobile" placeholder="enter phnumber"><br>
<input type="email" name="email" placeholder="enter email"><br>
<input type="password" name="password" placeholder="enter password"><br>
 male:<input type="radio" name="gender" value="male"><br>
female:<input type="radio" name="gender" value="female"><br>

<input type="checkbox" name="cb">Accept terms&conditions<br>

<select name="country">
<option>India</option>
<option>Germany</option>
<option>RASHYA</option>
<option>USA</option>
</select><br>

<button>submit</button>
<button>cancel</button>
</form>


</body>
</html>