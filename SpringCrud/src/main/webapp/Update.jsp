<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<body>
<form action="update" >

<input type="text" name="name" value="<%=request.getParameter("name")%>"><br>
<input type="number" name="mobile" value="<%=request.getParameter("mobile")%>"><br>
<input type="hidden" name="email" value="<%=request.getParameter("email")%>"><br>
<input type="password" name="password" value="<%=request.getParameter("pass")%>"><br>
 male:<input type="radio" name="gender" value="male"><br>
female:<input type="radio" name="gender" value="female"><br>

<input type="checkbox" name="cb">Accept terms&conditions<br>

<select name="country">
<option>India</option>
<option>Germany</option>
<option>RASHYA</option>
<option>USA</option>
</select><br>

<button>update</button>
<button>cancel</button>
</body>
</body>
</html>