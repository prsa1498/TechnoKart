<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="styles.css">

<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp" />
	<form method="post" action="forPass.lti">
		<tr>
			<td>Enter your address</td>
			<td><input type="text" name="u_add" id="u_add"></td>
		</tr>
		<tr>
			<td>Enter your new password</td>
			<td><input type="text" name="u_pass" id="u_pass"></td>
		</tr>
		<tr>
			<td>Re-enter the password</td>
			<td><input type="text" name="u_pass1" id="u_pass1"></td>
		</tr>
		<tr>
			<td><button type="submit">Submit</button></td>
		</tr>

	</form>
</body>
</html>