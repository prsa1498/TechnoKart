<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
<jsp:include page="adminheader.jsp" />
<h1 align="center">Change Password</h1>
<form action="uReset.lti" method="post">
<table  align="center">
<tr>
   <td>Current password</td>
   <td><input type="password"  name="old_pass" id="u_pass" /></td>
   </tr>
<tr>
   <td>New password</td>
   <td><input type="password"  name="new_pass" id="u_pass" /></td>
   </tr>
   <tr>
   <td><button type="submit" class="button">Reset</button></td>
   </tr>
   </table>
   </form>
      <jsp:include page="footer.jsp" />
   </body>
</html>