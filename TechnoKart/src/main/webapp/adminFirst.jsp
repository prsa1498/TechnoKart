<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Page</title>
</head>
<body>
<h1 align="center">Retailer's Details</h1>
<table border=1 align="center">
<tr>
   <td>Retailer's ID</td>
   <td>Retailer's Name</td>
   <td>Edit Product</td>
   <td>Notification to verify</td>
   <td>Delete Retailer</td>
</tr>
<tr>
<td></td>
<td></td>
<td><button>Add Product</button><button>Delete Product</button></td>
<td><button>Verify</button></td>
<td><button>Delete</button></td>
</tr>
</table>
<button align="center" onclick="location.href='addRetailer.jsp'" type="button">Add Retailer</button>
</body>
</html>