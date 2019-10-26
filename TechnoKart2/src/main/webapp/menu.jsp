<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>    
 
<div class="menu-container">
  
   <a href="index.jsp">Home</a>
   |
   <a href="${contextPath}/showProd.lti">
      Product List
   </a>
   |
   <a href="firstLogin.jsp">
   Sign In</a>
   <%-- <security:authorize  access="hasAnyRole('ROLE_MANAGER','ROLE_EMPLOYEE')">
     <a href="orderList.jsp">
         Order List
     </a>
     |
   </security:authorize>
   <c:if test="${pageContext.request.userPrincipal.name == null}">
            <a href="login.jsp">Login</a>
        </c:if>
   <!-- <security:authorize  access="hasRole('ROLE_MANAGER')">
         <a href="product.jsp">
                        Create Product
         </a> -->
         |
   </security:authorize> --%>
  
</div>