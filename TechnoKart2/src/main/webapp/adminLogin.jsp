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
 
 
   <jsp:include page="header.jsp" />
   <jsp:include page="menu.jsp" />
 
 
 
 
   <div class="login-container">
   <div  align="center">
 <h2 align="center">Admin Login</h2>
       <h3>Enter Details</h3>
       <br>
 
       <form method="post" action="adminLogin.lti">
           <table>
               <tr>
                   <td>Enter your Email</td>
                   <td><input type="text"  name="a_email" id="Email" autocomplete="on" reqiured /></td>
               </tr>
 
               <tr>
                   <td>Enter your password</td>
                   <td> <input type="password"  name="a_pass" id="Password" placeholder="minimum 6 characters" reqiured/></td>
               </tr>
</table>
                    <button type="submit" class="button" align="center">Sign in</button> 
           
       </form>
  <p align="center">Forgot password?  <a href="aPassReset.jsp">Reset password</a></p>
 
   </div>
 </div>
 
   <jsp:include page="footer.jsp" />
 
</body>
</html>