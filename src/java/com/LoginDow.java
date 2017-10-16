
package com;

import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginDow {
    private String username,password,status;
    static java.sql.Connection con=dow.getConnection();
    // Change Password
    public static void changePassword(String username,String oldpass,String newpass,PrintWriter pw){
        try {
            Statement st=con.createStatement();
            Statement ui=con.createStatement();
            ResultSet rs=st.executeQuery("Select pass from login where username='"+username+"'");
            rs.next();
            String password=rs.getString("pass");
            password=Myenc.decrypt(password);
            if(password.equals(oldpass) && !"".equals(newpass)){
                newpass=Myenc.encrypt(newpass);
                ui.executeUpdate("update login set pass='"+newpass+"' where username='"+username+"'");
                pw.write("changed");
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginDow.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    // Checking Username
    public static void check(String username,PrintWriter pw){
        try {
            System.out.println(username);
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select username from login where username='"+username+"';");
            if(rs.next()){
                pw.write("not");
            }
            else{
                pw.write("Available");
            }
                    } catch (SQLException ex) {
            Logger.getLogger(LoginDow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Login a user
    public void myLogin(PrintWriter pw){
        LoginBean lb=new LoginBean();
        username=lb.getUsernme();
        password=lb.getPassword();
        try {
            System.out.print("************"+username+password);
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from login where username='"+username+"';");
            if(rs.next()){
                if(Myenc.decrypt(rs.getString(2)).equals(password)){
                    if(rs.getInt(3)==0){
                        pw.write("WELCOME");
                        st.executeUpdate("update login set status=1 where username='"+username+"';");
                    }
                    else{
                        pw.write("Already Login");
                    }
                }
                else{
                    pw.write("WRONG PASSWORD");
                }
            }
            else{
                pw.write("NO SUCH USERNAME");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    // Logout a user
    public static void myLogout(String username){
        try {
            Statement st=con.createStatement();
            st.executeUpdate("Update login set status=0 where username ='"+username+"'");
        } catch (SQLException ex) {
            Logger.getLogger(LoginDow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Signup a user
    public void mySignup(PrintWriter pw){
        LoginBean lb=new LoginBean();
        password=lb.getPassword();
        username=lb.getUsernme();
        password=Myenc.encrypt(password);
        PreparedStatement ps;
        try{
            if(!"".equals(username)&&!"".equals("password")){
            ps=con.prepareStatement("insert into login values(?,?,0);");
            ps.setString(1, username);
            ps.setString(2, password);
            ps.executeUpdate();
            pw.write("SIGNUP SUCCESS");
            }
    }catch(SQLException ex){
        System.out.println(ex);
    }
    }
    // List of all active users
    public static void allActivePtofile(){
        List li=new ArrayList();
        LoginBean pb=new LoginBean();
        try {
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select username from login where status=1;");
            while(rs.next()){
                li.add(rs.getString("username"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
        pb.setList(li);
    } 
}
