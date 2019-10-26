<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 
<title>Login</title>
 
<link rel="stylesheet" type="text/css" href="styles.css">
 
</head>
<body>
 
 
   <jsp:include page="adminheader.jsp" />
   <jsp:include page="menu.jsp" />
 
 
 
 
   <div class="login-container">
   <div  align="center">
 <h2 align="center">Retailer Login Page</h2>
       <h3>Enter Details</h3>
       <br>
     <%--   <!-- /login?error=true -->
      <c:if test="${param.error == 'true'}">
           <div style="color: red; margin: 10px 0px;">

         
          </div>
       </c:if> --%>
 
       <form method="POST"   action="retLogin.lti" >
           <table>
               <tr>
                   <td>Enter your Email:</td>
                   <td> <input type="text"  name="r_email" id="Email" autocomplete="on"  reqiured /></td>
               </tr>
 
               <tr>
                   <td>Enter your password </td>
                   <td><input type="password"  name="r_pass" id="Password" placeholder="minimum 6 characters" reqiured/></td>
               </tr>
           </table>
           
                  <button type="submit" class="button"> Sign in</button>
       </form></div>
  <p align="center">Reset password?  <a href="rPassReset.jsp">Reset password</a></p>
 </div>
 
   <jsp:include page="footer.jsp" />
 
</body>
</html>