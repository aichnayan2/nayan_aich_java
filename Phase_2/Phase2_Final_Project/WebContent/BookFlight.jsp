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
	
		<form action="BookFlightServlet" method="post"><center>
		<h3>Personal Details for Booking!!</h3>
  		Email/User Name : <input type="text" name="email" id="email"><br>
  		Full Name: <input type="text" name="name" id="name" ><br>
  		Address: <input type="text" name="address" id="address"><br>
  		Age: <input type="text" name="age" id="age" ><br>
  		Mobile: <input type="text" name="mobile" id="mobile"><br>
  		ID: <input type="text" name="ID" id="ID"><br>
  		Country: <input type="text" name="country" id="country"><br><br>
  		<a>  
    		<button>Review</button>  
  		</a>
  		</center>
</form>
</body>
</html>