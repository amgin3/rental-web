<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Yahooooo!!! From JSP</title>
</head>
<body>
<%-- <% --%>
<!-- System.out.println(request.getParameter("name")); -->
<!-- java.util.Date date = new java.util.Date(); -->
<!-- Date date = new Date(); -->
<%-- %> --%>
<%-- <div>Current date is <%=date%></div> --%>
My first JSP. My name is ${name} and my password ${password}
<form action="/login.do" method="POST">
<p><font color="red">${errorMessage}</font></p>
Enter your name <input type="text" name="name"> <br>
Enter your password <input type="password" name="password"> <br>
<input type="submit" value="Login">
</form>
</body>
</html>