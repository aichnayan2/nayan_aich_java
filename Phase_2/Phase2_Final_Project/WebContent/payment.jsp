<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page import="java.util.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		@SuppressWarnings("unchecked")
		List<String[]> flights = (List<String[]>) session.getAttribute("flights");
		if (flights != null) {
	%>
	<center>
		<h2>Your Payment have done successfully</h2>
		<h3>Thank You</h3>
		<table>
		
			<tr>
				<th>Flight No</th>
				<th>Airline Name</th>
				<th>Price</th>
				<th>Travel Date</th>
				
			</tr>

		<%
			for (String[] flight : flights) {
		%>
			<tr>
				<td><%=flight[0]%></td>
				<td><%=flight[1]%></td>
				<td><%=flight[2]%></td>
				<td><%=flight[3]%></td>
			</tr>
		
		</table>
		<br><br>
		<a href="home.jsp">Go to Home Page</a>
		
		<%
			}
		%>
		<%
			} else {
		%>
		<h1>Payment Failed!!!</h1>
		<%
			}
		%>
	</center>
</body>
</html>