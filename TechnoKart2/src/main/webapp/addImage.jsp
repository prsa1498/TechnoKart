<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
<jsp:include page="adminheader.jsp" /> 
<form action="addImg.lti" method="post" modelAttribute="uploadForm" enctype="multipart/form-data">
<h1>Enter the Image file</h1> <br>
<input type="file" name="files[0]" size=50 /><br><br>
<input type="submit" value="Upload" class="button" />
</form>
  <jsp:include page="footer.jsp" />
</body>
</html>