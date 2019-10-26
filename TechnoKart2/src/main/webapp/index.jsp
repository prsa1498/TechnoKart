<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<meta charset="UTF-8">
 
<title>TechnoKart</title>
 
<link rel="stylesheet" type="text/css" href="styles.css">
 
</head>
<body>
 
 
   <jsp:include page="header.jsp" />
   <jsp:include page="menu.jsp" /> 
   
 <!--  <img alt="abc" src="D:/Javaworkspace/Project/Images/Oneplus2.png" >
   <div class="top-left">90 Hz Display.<br>
Smooth Like Never Before.<br>
<h2>
OnePlus 7T</h2><br>
From ₹37,999</div>
  <button class="btn">Buy now</button></div> -->
  
  <div class="w3-content w3-section" style="max-width:500px">
  <img class="mySlides" src="./resources/images/alienware.jpg"   width="110%" height=400px>
  <img class="mySlides" src="./resources/images/Oneplus2.png" width="110%" height=400px>
  <img class="mySlides" src="./resources/images/speaker.jpg" width="110% "  height=400px>
</div>

<script>
var myIndex = 0;
carousel();

function carousel() {
  var i;
  var x = document.getElementsByClassName("mySlides");
  for (i = 0; i < x.length; i++) {
    x[i].style.display = "none";  
  }
  myIndex++;
  if (myIndex > x.length) {myIndex = 1}    
  x[myIndex-1].style.display = "block";  
  setTimeout(carousel, 2000); // Change image every 2 seconds
}
</script>
  <h1 align="center"><i>Featured Products</i></h1>
   <div class="page-title"> 
   <div class="row">
  <div class="column">
  <a href="product.jsp"><img alt="abc"style="width:100%" src="./resources/images/bose.jpg" class="image"/>
  </div><div class="column">
  <a href="product.jsp"><img alt="abc" style="width:100%" src="./resources/images/iphone.png" class="image"/>
</div>  </div>
   <jsp:include page="footer.jsp" />
 
</body>
</html>