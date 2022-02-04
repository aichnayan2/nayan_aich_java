<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page import="java.util.*"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flight Details</title>
</head>
<body>
	<%
		@SuppressWarnings("unchecked")
		List<String[]> flights = (List<String[]>) session.getAttribute("flights");
		if (flights != null) {
	%><center>
	<h1>Available Flights</h1>
</center>
	<center>
		<table border="1">
			<tr>
				<th>Flight No</th>
				<th>Airline Name</th>
				<th>Price</th>
				<th>Travel Date</th>
				<th>Available Seats</th>
				<th>Book</th>
			</tr>
			<%
				for (String[] flight : flights) {
			%>

			<tr>
				<td><%=flight[0]%></td>
				<td><%=flight[1]%></td>
				<td><%=flight[2]%></td>
				<td><%=flight[3]%></td>
				<td><%=flight[4]%></td>
				<td><a href=BookFlight.jsp>Click to Book</a></td>
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




<%--
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>


<%
String source_city = request.getParameter("source_city");

String destination_city = request.getParameter("destination_city");

String driverName = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String dbName = "flyme";
String userId = "root";
String password = "root";

try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<h2 align="center"><font><strong>Retrieve data from database in jsp</strong></font></h2>
<table align="center" cellpadding="5" cellspacing="5" border="1">
<tr>

</tr>
<tr bgcolor="#A52A2A">
<td><b>flight_no</b></td>
<td><b>airline name</b></td>
<!-- <td><b>source_city</b></td>
<td><b>destination_city</b></td> -->
<td><b>price</b></td> 
</tr>
<%
try{ 
connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
statement=connection.createStatement();
String sql ="SELECT flight_no, airline_name, price FROM flight_details  ";

resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr bgcolor="#DEB887">

<td><%=resultSet.getString("flight_no") %></td>
<td><%=resultSet.getString("airline_name") %></td>

<td><%=resultSet.getString("price") %></td>

</tr>

<% 
}

} catch (Exception e) {
e.printStackTrace();
}
%>
</table>

--%>