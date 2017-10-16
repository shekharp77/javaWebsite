<%-- 
    Document   : home
    Created on : 21 Aug, 2017, 11:09:12 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="build/main.css" rel="stylesheet">
	<meta name="viewport" content="width=device-width, initial-scale=1">
        <script type="text/javascript" src="jquery.min.js"></script>
        <script type="text/javascript" src="profile.js"></script>
        <script type="text/javascript" src="home.js"></script>
        <script src="js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="css/bootstrap.min.css">
        <style>
            .good{
                background-color: #18e025;
            }
            .bad{
                background-color: #fb1100;
            }
            .wrapper {
                text-align: center;
                top: 20%;
                right: 25%;
            }
            .jumbotron {
                padding-top: 30px;
                padding-bottom: 30px;
                margin-bottom: 30px;
                padding-left: 30px;
                padding-right: 30px;
                color: inherit;
                background-color: rgba(92, 243, 95, 0.27);
            }
            footer{
                        background-color: black;
                    }
                    body{
                            background-image: url("images//mainmenu3.jpg");
                            background-size: 100% auto ;
                    }
        </style>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-dark">
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
      <li><button type="button" class="btn btn-danger" id="logout">Log Out</button></li>
    </ul>
  </div>
</nav>
        
        
        
        <div class="jumbotron">
            
            <hr class="my-4">
                <p>It uses utility classes for typography and spacing to space content out within the larger container.</p>
            <p class="lead">
                GOOD<button class="btn good badge badge-secondary" id="good">10</button>
                BAD<button class="btn bad badge badge-secondary" id="bad" >4</button>
            </p>
        </div>
        
       
    </body>
</html>
