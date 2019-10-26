<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="view" class="com.lti.controller.MainController" scope="page"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Page</title>
<link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body> <jsp:include page="adminheader.jsp" /> 
<jsp:include page="adminmenu.jsp" /> 
<h2><marquee>Welcome !</marquee></h2>
 <img class="logo" alt="logo" src="./resources/images/admin.png" height="300" width="300" align ="middle">
<!-- <a href="addRetailer.jsp"><br>
<input type="button" value="Add Retailer" />
 -->
 <br><br>
<a href="addRetailer.jsp"><button type="submit" value="Add Retailer" class="button" align="middle">Add Retailer</button></a>
<!-- </a> --><br><br>
<a href="${contextPath}/showRetailer.lti"><button type="submit" method="post" class="button" align="middle">Show Retailers info</button></a>

<!-- <form action="showRetailer.lti" method="post"> -->

<!-- <button type="submit">Show Retailers Info</button> -->
  <jsp:include page="footer.jsp" />
</body>
</html>