<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%-- 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> --%>
 
<div class="header-container">
 <img class="logo" alt="logo" src="./resources/images/LOGO.png" height="60" width="200">
 
    <input  class= "header-bar" list="search" name="searchbar" placeholder="Search....">
    <datalist id="search">
    <option value="Mobiles">
    <option value="Cameras">
    <option value="Pendrives">
    <option value="Speakers">
    </datalist>
 
    <div class="header-bar">
        <%-- <c:if test="${pageContext.request.userPrincipal.name != null}">
        Hello
           <a href="accountInfo.jsp">
                ${pageContext.request.userPrincipal.name} </a>
         &nbsp;|&nbsp;
           <a href="logout.jsp">Logout</a>
 
        </c:if> --%>
        <%-- <c:if test="${pageContext.request.userPrincipal.name == null}">
            <a href="login.jsp">Login</a>
        </c:if> --%>
    </div>
</div>