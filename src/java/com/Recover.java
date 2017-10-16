/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import com.sun.mail.util.MailConnectException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class Recover {
    static String password,email;
    static Connection con=dow.getConnection();
   
    static PrintWriter pwm;
    public static void recoverPass(String username,PrintWriter pw){
        System.out.println("*************"+username);
        try {
            pwm=pw;
            Statement st=con.createStatement();
            Statement st1=con.createStatement();
            ResultSet rs=st.executeQuery("Select pass from login where username='"+username+"'");
            ResultSet ps=st1.executeQuery("select email from profile where username='"+username+"';");
            if(rs.next()){
                password=rs.getString("pass");
                password=Myenc.decrypt(password);
                ps.next();
                email=ps.getString("email");
               int i=Mail.send(email,"MY BOOK : Password recovery","Your password is :"+password+"");
                if(i==1) {
                    pw.write("sent");
                }
            }
            else{
                pw.write("NO SUCH USERNAME");
            }
        } catch (Exception ex) {
            Logger.getLogger(Recover.class.getName()).log(Level.SEVERE, null, ex);
            pwm.write("NOT SENT");
            ex.printStackTrace();
        }
    }
}
