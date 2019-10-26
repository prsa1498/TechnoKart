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
<form action="newPass.lti" method="post">
Enter your email<br>
<input type="text" name="u_email" />
<button type="submit">Submit</button>
</form>
</body>
</html>