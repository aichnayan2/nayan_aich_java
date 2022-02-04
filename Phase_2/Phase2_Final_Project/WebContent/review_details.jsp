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
		<h1>Payment Page</h1>
	</center>
	<center>
		<table border="1">
			<tr>
				<th>Flight No</th>
				<th>Airline Name</th>
				<th>Price</th>
				<th>Travel Date</th>
				<th>Payment</th>
			</tr>
			<%
				for (String[] flight : flights) {
			%>

			<tr>
				<td><%=flight[0]%></td>
				<td><%=flight[1]%></td>
				<td><%=flight[2]%></td>
				<td><%=flight[3]%></td>
				<td><a href=payment.jsp>Click to Make Payment</a></td>
			</tr>
		</table>
	</center>

	<%
		}
	%>


	<%
		} else {
	%>
	<h1>There are no available flights</h1>
	<%
		}
	%>
</body>
</html>