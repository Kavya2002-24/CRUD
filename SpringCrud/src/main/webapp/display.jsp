<%@page import="Spring_Dto.Spring_Dto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
<% List<Spring_Dto> l = (List<Spring_Dto>) request.getAttribute("obj");%>
     <form action="Update.jsp">
<table border="2px">
<tr style="color:blue">
<th>Email</th>
<th>Password</th>
<th>country</th>
<th>gender</th>
<th>mobile</th>
<th>name</th>
<th>delete</th>
<th>edit</th>
</tr>

<% for(Spring_Dto s:l)
	{
	%>
	<tr>
	<td><%=s.getEmail()%></td>
	<td><%=s.getPassword()%></td>
	<td><%=s.getCountry()%></td>
	<td><%=s.getGender()%></td>
	<td><%=s.getMobile()%></td>
	<td><%=s.getName()%></td>    
    <td><button><a  href="did?email=<%=s.getEmail()%>">delete</a></button></td>
     <td><button><a href="Update.jsp?email=<%=s.getEmail() %>&&pass=<%=s.getPassword()%>&&name=<%=s.getName() %>&&mobile=<%=s.getMobile() %>&&country=<%=s.getCountry()%>&&gen=<%=s.getGender()%>">edit</a></button>

     

   </tr>
    <% } %>
    
   </table>
  </form>
</body>
</html>