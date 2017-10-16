/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 *
 * @author user
 */
public class ProfileDow {
    private static java.sql.Connection con=dow.getConnection();
    private static String username,fullname,email,gender,address;
    public int age;
    
    // Profile data of a User
    public static void showProfiles(String user) throws SQLException{
        ProfileBean pb=new ProfileBean();
        System.out.println("^^^^^^^^^^^^^^^^^"+user);
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from profile where username='"+user+"';");
        rs.next();
        pb.setUsername(rs.getString("username"));
        pb.setFullname(rs.getString("fullname"));
        pb.setEmail(rs.getString("email"));
        pb.setGender(rs.getString("gender"));
        pb.setAddress(rs.getString("address"));
        pb.setAge(rs.getInt("age"));
    }
    // Updating Profile data
    public static void updateData(String username,String column,String data,PrintWriter pw){
        
        try {
            if(!"".equals(data)){
            Statement st=con.createStatement();
            if(column.equals("age")) {
                st.executeUpdate("update profile set "+column+" ="+data+" where username ='"+username+"';");
            }
            else{
                st.executeUpdate("update profile set "+column+" ='"+data+"' where username ='"+username+"';");
            }
            pw.write("changed");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProfileDow.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    // Inseting data in profile
    public void mySetup(PrintWriter pw){
        PreparedStatement ps;
        ProfileBean pb=new ProfileBean();
                    username=pb.getUsername();
                    email=pb.getEmail();
                    age=pb.getAge();
                    address=pb.getAddress();
                    gender=pb.getGender();
                    fullname=pb.getFullname();
                    System.out.println(fullname+";;;;;;;;;;");
        try{
            ps=con.prepareStatement("insert into profile values(?,?,?,?,?,?);");
            ps.setString(1, username);
            ps.setString(2, fullname);
            ps.setString(3, email);
            ps.setString(4, gender);
            ps.setString(5, address);
            ps.setInt(6, age);
            ps.executeUpdate();
            Statement st=con.createStatement();
            st.executeUpdate("update login set status = 1 where username='"+username+"';");
    }catch(SQLException ex){
        System.out.println(ex);
    }
    }
}
