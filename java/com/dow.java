/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class dow {
    private static Connection con;
    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(dow.class.getName()).log(Level.SEVERE, null, ex);
        }
            String id="root";
            String pwd="12345678";
            String url="jdbc:mysql://localhost:3306/javaproject";
            
        try {
            con = DriverManager.getConnection(url,id,pwd);
        } catch (SQLException ex) {
            Logger.getLogger(dow.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            Statement st = con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(dow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static Connection getConnection(){
            return con;
        }
}
