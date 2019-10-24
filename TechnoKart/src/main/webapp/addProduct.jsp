<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<title>Add Product Details</title>
 <script type="text/javascript">
function alertSubmit(){
alert("Product's Details has been added successfully!!");
} 
</script>  
</head>
<body>
<h1 align="center">Add Product</h1>
<form method="post" action= "addProduct.lti" enctype="multipart/form-data"  >
<table>
<tr>
    <td>Product's Name</td>
    <td><input type="text" name="p_name"/></td></tr>
<tr>
     <td>Product's Brand</td>
     <td><input type="text" name="p_brand"/></td></tr>
<tr>
     <td>Product Description</td>
     <td><input type="textarea" name="p_details"/></td></tr>   
 <tr>
     <td>Product's Price</td>
     <td><input type="number" name="p_price"/></td></tr>   
<tr>
     <td>Product's category</td>
     <td><select name="p_category">
     <option name="p_category">Mobile</option>
     <option name="p_category">Headphones</option>
     </select></td></tr>   
<tr>
     <td><input type="file" name="p_img"  /></td></tr>                                 
<tr>
     <td><button type="submit">Submit</button></td>
     <td><input type="button" value="Back" onclick="location.href='firstpage.jsp'"/></td></tr>
</table>
</form>
</body>
</html>