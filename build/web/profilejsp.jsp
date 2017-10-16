<%-- 
    Document   : profilejsp
    Created on : 21 Aug, 2017, 2:17:06 AM
    Author     : user
--%>

<%@page import="com.ProfileBean"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="com.ProfileDow"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="build/main.css" rel="stylesheet">
	<meta name="viewport" content="width=device-width, initial-scale=1">
        
<!--   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
   <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>-->
  
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <script  src="jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script  src="profile.js"></script>
        
        <style>
            .wrapper {
                text-align: center;
                top: 20%;
                right: 25%;
            }
            .button {
                position: absolute;
                top: 100%;
            }
            .btd{
                background-color: #39bc35;
                color: #fff5f5;
                position: unset;
            }
            .button{
                    background-color:#000000;
                    border:1px solid #660000;
                    border-radius:5px;
                    color:#fff;
                    margin-right:10px;
                    padding:10px 10px 10px 10px;
                    text-decoration: none;
                    font-family: cursive;
                    }
                        
                    .jumbotron {
                        padding-right: 30%;
                        padding-left: 30%;
                        margin-right: auto;
                        margin-left: auto;
                        align-items: center;
                        padding-top: 200px;
                        margin-top: 5%;
                        margin-bottom: 3%;
                        background-color: rgba(193, 193, 193, 0.32);
                    }
                    label {
                        display: inline-block;
                        max-width: 100%;
                        margin-bottom: 5px;
                        color: white;
                        font-size: x-large;
                        font-style: inherit;
                    }
                    body{
                        background-image: url("images//mainmenu3.jpg");
                        background-size: 100% auto ;
                    }
                    footer{
                        background-color: black;
                    }
        </style>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-dark fixed-top">
    <a class="navbar-brand" href="#" style="color:#00ffb7"><h2>IOT Crew</h2></a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
        <li class="nav-item active">
          <a class="nav-link w" href="home.jsp" style="color:white">Home</a>
      </li>
      <li class="nav-item active">
          <a class="nav-link w" href="profilejsp.jsp" style="color:white">Profile</a>
      </li>
      <li class="nav-item active">
        <a class="nav-link  w" href="active.jsp" style="color:white">Active users</a>
      </li>
 
      
    </ul>
      <ul class="nav navbar-nav navbar-right">
          <li class="nav-item active"><a class="nav-link  w" href="password.html" style="color:white">Change Password</a></li>&nbsp;
      <li><button type="button" class="btn btn-danger" id="logout">Log Out</button></li>
      
    </ul>
  </div>
</nav>
        
        
        
        <%  
                String username,fullname,gender,email,address;
                int age;
                PrintWriter pr=response.getWriter();
                HttpSession sh=request.getSession();  
                ProfileDow.showProfiles((String)sh.getAttribute("name"));
                ProfileBean pb=new ProfileBean();
                username=pb.getUsername();
                fullname=pb.getFullname();
                gender=pb.getGender();
                email=pb.getEmail();
                address=pb.getAddress();
                age=pb.getAge();
%>
        
        
    <div class="jumbotron">
       
        
       
        
        
        
         
        
<div class="input-group ">
    
    <label class="input-group " style="">
        <%=username%>
    </label>

</div>
<div class="input-group">
   
    <label class="input-group " style="">
        <%=fullname%>
    </label>
    <button class="btn btn-secondary btd " id="name">Change</button>
    <div id="fnchange"></div>
</div>
<div class="input-group">
    <label class="input-group " style="">
        <%=gender%>
    </label>
    <button class="btn btn-secondary btd " id="gender">Change</button>
    <div id="genchange"></div>
</div>
<div class="input-group">
    <label class="input-group " style="">
        <%=age%>
    </label>
    <button class="btn btn-secondary btd" id="age">Change</button>
        <div id="agechange"></div>
</div>
<div class="input-group">
    <label class="input-group " style="">
        <%=email%>
    </label>
    <button class="btn btn-secondary btd " id="email">Change</button>
    <div id="emachange"></div>
</div>
<div class="input-group">
    <label class="input-group " style="">
        <%=  address%>
    </label>
    <button class="btn btn-secondary btd" id="address">Change</button>
    <div id="addchange"></div>
</div>    
<br>

</div> 
    </body>
</html>

