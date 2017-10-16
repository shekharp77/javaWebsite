<%-- 
    Document   : active
    Created on : 21 Aug, 2017, 1:46:39 PM
    Author     : user
--%>


<%@page import="com.LoginBean"%>
<%@page import="com.LoginDow"%>
<%@page import="com.ProfileBean"%>
<%@page import="java.util.List"%>
<%@page import="com.ProfileDow"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="jquery.min.js"></script>
        <script type="text/javascript" src="profile.js"></script>
        <script src="js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="css/bootstrap.min.css">
        <title>JSP Page</title>
        <style>
            .wrapper {
                text-align: center;
                top: 20%;
                right: 25%;
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
        
        
        
        
        
        
        
        
        <div class="container">
  <h2 class="text-center">CURRENT ACTIVE USERS</h2><br>
  <p></p>                                                                                      
  <div class="table-responsive">          
  <table class="table">
    <thead>
      <tr>
        <th>USERNAME</th>
        <th>FULL NAME</th>
        <th>GENDER</th>
        <th>AGE</th>
        <th>EMAIL</th>
        <th>ADDRESS</th>
      </tr>
      <%   
          try{
            String username,fullname,gender,email,address;
            int age;
            ProfileDow pd=new ProfileDow();
            ProfileBean pb=new ProfileBean();
            LoginBean ld=new LoginBean();
            LoginDow.allActivePtofile();
            List li=ld.getList();
            for(int i=0;i<li.size();i++){
                Object un=li.get(i);
                String user=un.toString();
                ProfileDow.showProfiles(user);
                username=pb.getUsername();
                fullname=pb.getFullname();
                gender=pb.getGender();
                age=pb.getAge();
                email=pb.getEmail();
                address=pb.getAddress();
      %>        
        <tr>
            <td><%=username%></td>
            <td><%=fullname%></td>
            <td><%=gender%></td>
            <td><%=age%></td>
            <td><%=email%></td>
            <td><%=address%></td>
        </tr>
                
                <%
            }
        }catch(Exception ex){
            ex.printStackTrace();
            System.out.println(ex);
        }
        %>
    </thead>
    <tbody>
      `
    </tbody>
  </table>
  </div>
</div>
    
   
    </body>
</html>
