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
	<form action="SearchFlightServlet" method="post">
		<h3>Please Enter The Travel Details!!</h3><br>
			Date of Travel: <input name="date_travel" id="date_travel"><br>
			Source City: <input type="text" name="source_city" id="source_city"><br>
			Destination City: <input type="text" name="destination_city"
				id="destination_city"><br> Number of person: <input
				name="NoPerson" id="NoPerson"><br><br>

			<button>Search</button>
		
	</form></center>
</body>
</html>