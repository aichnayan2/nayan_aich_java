<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action=ChangePasswordServlet method=post>
		<center>
		<h3>Change Password Portal..</h3> <br> <br>
			<label for=username>Email </label> <input type="email" name=username
				id=username /><br> <label for=password>New Password </label> <input type="password" name=password id=password /><br>
			<br> <input type=submit value=submit /> <input type=reset /><br><br>
			<a href="adminWelcome.jsp">Click to cancel...</a>
		</center>
	</form>

</body>
</html>