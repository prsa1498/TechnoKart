<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Page</title>
<link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
 <jsp:include page="adminheader.jsp" /> 
<!--<spring:url value="/showRetailer.lti" var="show">-->
<h1 align="center">Retailer's Details</h1>
<!--<c:url value="/deleteRetailer.lti" />-->
<table>
<tr>
   <th>Retailer's ID</th>
   <th>Retailer's Name</th>
   <th>Retailer's Email Address</th>
   <th>Delete Retailer</th>
</tr>
<c:forEach var="retailer"  items="${requestScope.rl}">
<tr>
<td><c:out value="${retailer.r_id}" /></td>
<td><c:out value="${retailer.r_name}"/></td>
<td><c:out value="${retailer.r_email}" /></td>
<td><a href="removeRetailer.lti?id=${retailer.r_id}" >Delete Retailer</a></td>
</tr>
</c:forEach>
</table>
<input type="button" class="button" value="Back" onclick="location.href='adminFirst.jsp'"/>
<!--</spring:url>-->

</body>
</html>