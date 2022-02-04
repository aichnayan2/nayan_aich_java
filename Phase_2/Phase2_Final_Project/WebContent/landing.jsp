<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
  if (request.getParameter("error") != null)
          out.println("<b>Your session has expired or is invalid.</b><br>");
%>
<center>
	<form action="LandingServlet" method="post">
		<h2>Welcome to Login Page!!!</h2>
  		Name: <input type="text" name="username" id="username" ><br><br>
  		Password: <input type="password" name="password" id="password"><br><br>
  		<button>Login</button><br><br>
  		<a href="admin.jsp">Admin Login</a>
	</form>
	</center>
</body>
</html>