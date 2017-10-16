package com;



import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import org.apache.commons.io.IOUtils;

@WebServlet(urlPatterns = {"/servlet"})
@MultipartConfig(maxFileSize = 10*1024*1024,maxRequestSize = 20*1024*1024,fileSizeThreshold = 5*1024*1024)
public class servlet extends HttpServlet {
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        PrintWriter pw=response.getWriter();
        HttpSession sh=request.getSession();
   
       try{
            switch (request.getParameter("type")) {
                case "signup":
                    LoginBean lb=new LoginBean();
                    lb.setUsername(request.getParameter("username"));
                    lb.setPassord(request.getParameter("password"));
                    sh.setAttribute("name", request.getParameter("username"));
                    LoginDow ld=new LoginDow();
                    ld.mySignup(pw);
                    break;
                case "setup":
                    ProfileBean pb=new ProfileBean();
                    System.out.println(request.getParameter("fullname")+"*************");
                    pb.setFullname(request.getParameter("fullname"));
                    pb.setEmail(request.getParameter("email"));
                    pb.setAge(Integer.parseInt(request.getParameter("age")));
                    pb.setAddress(request.getParameter("add"));
                    pb.setGender(request.getParameter("gen"));
                    pb.setUsername((String) sh.getAttribute("name"));
//                    Part filepart =  request.getPart("file");
//                    InputStream image=filepart.getInputStream();
//                    InputStream is;
//                    byte[] bytes = IOUtils.toByteArray(image);
//                    FileOutputStream fout=new FileOutputStream("ProfileImages/image.jpg");
//                    fout.write(bytes);
//                    fout.close();
                    ProfileDow pd=new ProfileDow();
                    pd.mySetup(pw);
                    sh.setAttribute("fullname",request.getParameter("fullname"));
                    pw.write("signinsc");
                    break;
                case "logout":
                    LoginDow.myLogout((String) sh.getAttribute("name"));
                    sh.invalidate();
                    break;
                case "login":
                    LoginDow Ld=new LoginDow();
                    LoginBean Lb=new LoginBean();
                    Lb.setUsername(request.getParameter("user"));
                    Lb.setPassord(request.getParameter("pass"));
                    Ld.myLogin(pw);
                    sh.setAttribute("name",request.getParameter("user"));
                    break;
                case "username":
                    LoginDow.check(request.getParameter("username"), pw);
                    break;
                case "email":
                    
                    Recover.recoverPass(request.getParameter("username"),pw);
                    break;
                case "update":
                    
                    ProfileDow.updateData((String) sh.getAttribute("name"), request.getParameter("subject"),request.getParameter("data"), pw);
                    break;
                case "change":
                    LoginDow.changePassword((String) sh.getAttribute("name"), request.getParameter("oldpassword"), request.getParameter("newpassword"), pw);
                    break;
                default:
                    pw.write("Request Unknown");
                    break;
            }
                } catch (Exception ex) {
                   ex.printStackTrace();
                }
    }
}



