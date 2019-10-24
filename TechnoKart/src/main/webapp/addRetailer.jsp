<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Retailer</title>
<!-- <script type="text/javascript">
function alertSubmit(){
alert("Retailer's Details has been added successfully!!");
} 
</script> --> 
</head>
<body>
<h1 align="center">Add Retailer</h1>
<form method="post" action="addRetailer.lti">
<table>
<tr>
    <td>Retailer's Name</td>
    <td><input type="text" name="r_name"/></td></tr>
<tr>
     <td>Retailer's Email</td>
     <td><input type="text" name="r_email"/></td></tr>
<tr>
     <td>Retailer's Default Password</td>
     <td><input type="password" name="r_pass"/></td></tr>           
<tr>
     <td><button type="submit">Submit</button></td>
     <td><input type="button" value="Back" onclick="location.href='adminFirst.jsp'"/></tr>
</table>
</form>
</body>
</html>