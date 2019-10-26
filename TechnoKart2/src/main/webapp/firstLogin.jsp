<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 
<title>Login</title>
 
<link rel="stylesheet" type="text/css" href="styles.css">
 
</head>
<body>
 
 
   <jsp:include page="header.jsp" />
   <jsp:include page="menu.jsp" />
 

   <div class="login-container">
   <div  align="center">
 <h2 align="center">Login</h2>
       <h3>Enter username and password</h3>
       <br>
       <form method="post" action="login.lti">
           <table>
               <tr>
                   <td>Email Address *</td>
                   <td><input name="u_email" required/></td>
               </tr>
 
               <tr>
                   <td>Password *</td>
                   <td><input type="password" name="u_pass" required/></td>
               </tr>
           </table>
           <button type="submit" class="button">Sign in</button>
</form>
     <p align="center">  Forgot password? <a href="forgotPassword.jsp">Click here</a></p><br>
       
       Don't have an account? <a href="signUp.jsp">Sign Up</a><br><br>
       
   Are you a <a href="retailerLogin.jsp">Retailer</a>?
Or an <a href="adminLogin.jsp">Admin</a>?
       <span class="error-message">${error }</span>
 
   </div>
 
 </div>
   <jsp:include page="footer.jsp" />
</body>
</html>