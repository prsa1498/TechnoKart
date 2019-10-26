<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
<jsp:include page="adminheader.jsp" />
<div align="center">


<div class="signup">
<form method="post" action="signup.lti">
<fieldset>
<h1>Signup</h1>
  <table >
               <tr>
<td>Your name:</td>
                   <td> <input type="text"  name="u_name"  id="Name" required ></td>
               </tr>
               
               <tr>
                   <td>Phone number:</td>
                   <td><input type="text"  name="u_mob" id="Number" required pattern="[0-9]{10}" title="Must contain 10 numbers" ></td>
               </tr>
                  <tr>
                   <td>Email:</td>
                   <td><input type="email"  name="u_email" id="Email" required ></td>
               </tr>
                 <tr>
                   <td>Create password:</td>
                   <td><input type="password"  name="u_pass" id="Password" 
                   placeholder="minimum 6 characters" 
                   required pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
                    title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters"></td>
               </tr>
                 <tr>
                   <td>Address:</td>
                   <td><input type="text"  name="u_add" id="Add" required ></td>
               </tr>                          
           </table>
           </form>
           <button class="button">Create your Account</button>
<div align="center">
          <br> By creating an account,you agree to Technocart's Conditions of Use and Privacy Notice.<br></div>

          <hr size="1" width="100%" noshade style=" color:#000000" align="center" /><br>
Already have an account? <a href="firstLogin.jsp">Log in</a>
<br>

</fieldset>
</div>

<script type="text/javascript">
myInput.onfocus = function() {
	  document.getElementById("message").style.display = "block"; }
myInput.onblur = function() {
	  document.getElementById("message").style.display = "none"; }
	  
myInput.onfocus = function() {
	  document.getElementById("phoneMessage").style.display = "block"; }
myInput.onblur = function() {
	  document.getElementById("phoneMessage").style.display = "none"; }
	  
<div id="phoneMessage" >
<h3>Phone must contain the following:</h3>
<p id="number" class="invalid">A <b>number</b></p>
</div>
	  
<div id="message">
<h3>Password must contain the following:</h3>
<p id="letter" class="invalid">A <b>lowercase</b> letter</p>
<p id="capital" class="invalid">A <b>capital (uppercase)</b> letter</p>
<p id="number" class="invalid">A <b>number</b></p>
<p id="length" class="invalid">Minimum <b>8 characters</b></p>
</div>

var myInput = document.getElementById("u_pass");
var letter = document.getElementById("letter");
var capital = document.getElementById("capital");
var number = document.getElementById("number");
var length = document.getElementById("length");
myInput.onkeyup = function() {
	  // Validate lowercase letters
	  var lowerCaseLetters = /[a-z]/g;
	  if(myInput.value.match(lowerCaseLetters)) {  
	    letter.classList.remove("invalid");
	    letter.classList.add("valid");
	  } else {
	    letter.classList.remove("valid");
	    letter.classList.add("invalid");
	  }
	  
	  // Validate capital letters
	  var upperCaseLetters = /[A-Z]/g;
	  if(myInput.value.match(upperCaseLetters)) {  
	    capital.classList.remove("invalid");
	    capital.classList.add("valid");
	  } else {
	    capital.classList.remove("valid");
	    capital.classList.add("invalid");
	  }

	  // Validate numbers
	  var numbers = /[0-9]/g;
	  if(myInput.value.match(numbers)) {  
	    number.classList.remove("invalid");
	    number.classList.add("valid");
	  } else {
	    number.classList.remove("valid");
	    number.classList.add("invalid");
	  }
	  
	  // Validate length
	  if(myInput.value.length >= 8) {
	    length.classList.remove("invalid");
	    length.classList.add("valid");
	  } else {
	    length.classList.remove("valid");
	    length.classList.add("invalid");
	  }
	}
</script>
<br>
<br>
</div>
   <jsp:include page="footer.jsp" />
</body>
</html>