<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"
import="java.util.*,com.lti.entity.*"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<%-- <c:set var="prod" value="${requestScope.pl}"/> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="view" class="com.lti.controller.MainController" scope="page"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Page</title>
<link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
<%
String contextPath = "D:\\ProjectGladiator\\TechnoKart2\\src\\main\\webapp\\resources\\images\\";
String link="";
%>
<%List<ProductEntity> productList = (List<ProductEntity>)session.getAttribute("product"); %> 
<div class="row" style="padding:0px 30px; margin-bottom: 20px">
		<%for(int i=0;i<(productList.size());i++) { %>
		<% link = contextPath + productList.get(i).getImagetolink();%>
		<%out.println("link"+link); %>
		<a href="showRetailer.lti?id=<%=productList.get(i).getP_id() %>">
			<img src="<%=link %>" alt="Product"/> 
			</a>
				<p>
					<a href="showRetailer?id=<%=productList.get(i).getP_id() %>"><b><%=productList.get(i).getP_name() %></b></a>
				</p>
				<p>
				Price - <%= productList.get(i).getP_price()%>
			</p>
			<p>
			Details - <%=productList.get(i).getP_details() %>
		</div>
		<%} %>
		</div>
		<%-- <table>
<c:forEach var="prod"  items="${requestScope.pl}">
<tr><c:out value="${prod.imagetolink }"/></tr>
<tr><c:out value="${prod.p_name}" /></tr>
<tr><c:out value="${prod.p_brand}" /></tr>
<tr><c:out value="${prod.p_price}" /></tr>
<tr><c:out value="${prod.p_details}" /></tr>
</c:forEach>
 </table> --%>
</body>
</html>