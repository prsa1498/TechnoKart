<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<style>
    body
    {
            display: flex;
            flex-direction: column;
            align-content: center;
            align-items: center;
            padding: 4%;
    }
    .class1{
            background-color:rgb(240,240,240);
            display: flex;
            flex-direction: column;
            align-content: center;
            align-items: center;
            width: 20vw;
            height: 55vh;
            border:1px solid rgba(15, 1, 1, 0.397);
            border-radius: 5px;
            font-family: Arial;
            font-size: 85%;
            padding: 1.5%;
            margin: auto;
    }
    .class2 img{
            display: flex;
            flex-direction: column;
            align-content: center;
            align-items: center;
            width: 15vw;
            height: 25vh;
            padding: 1.5%;
    }

    input[type="text" ]{
        padding:1.5%;
        width: 98%;
        margin:5%;
        margin-top: 1%;
        border-radius: 2px;
    }
    input[type="password" ]{
        padding:1.5%;
        margin: 5%;
        width: 98%;
        margin-top: 1%;
        border-radius: 2px;
    }

    input[type="submit" ]{
        margin: 5%;
        margin-bottom: 5%;
    }
    input:focus{
        border-radius:2px;
    
        outline:none;
        box-shadow: 0 2px 4px 0 rgb(128,128,128), 0 3px 10px 0 rgb(128,128,128);
    } 
    .text{
        margin:3%;
        font-size: 150%;
        font-family:Lucida Sans Unicode;
        
    }
    
       span{
        align-self: flex-start;
        padding:1%;
    }
</style>
</head>
<body>
        <div class="class2">
            <img src="amazon-logo.jpg">
        </div>
        <div class="class1">
        <form method="post" action="signup.lti">
        <div class="text">CREATE NEW ACCOUNT</div>
        <span> Your name </span>
        <input type="text"  name="u_name"  id="Name"  >
        <span>Phone number</span>
        <input type="text"  name="u_mob" id="Number" >
        <span>Email</span> 
        <input type="text"  name="u_email" id="Email"  >
        <span>Create password </span>
        <input type="password"  name="u_pass" id="Password" placeholder="minimum 6 characters">
        <span>Address</span> 
        <input type="text"  name="u_add" id="Add"  >
        <button type="submit">Sign Up</button>
         </form>
        <hr size="2" width="50%" noshade style=" color:#000000" align="center" />
        <span>Already have an account? 
                <a href="http://127.0.0.1:5500/signin.html">Sign in</a>
        </span>
                
        </div>
</body>
</html>