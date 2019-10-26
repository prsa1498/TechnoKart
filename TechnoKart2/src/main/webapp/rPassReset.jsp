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
<div align="center">
<div class="signup">
<fieldset>
<form method="post" action="rReset.lti">

<h1>Change Password</h1>
  <table >
               <tr>
<td>Current password:</td>
                   <td> <input type="password"  name="old_pass" id="r_pass" /></td>
               </tr>
               
               <tr>
                   <td>New password:</td>
                   <td><input type="password"  name="new_pass" id="r_pass" /></td>
               </tr>
           <tr>
                   <td>&nbsp;</td>
                   <td><button type="submit" class="button">Reset</button></td>
               </tr>
           </table>
           </form>
           By creating an account,you agree to Technocart's Conditions of Use and Privacy Notice.<br>
<br>
</fieldset>
   <jsp:include page="footer.jsp" />
</body>
</html>