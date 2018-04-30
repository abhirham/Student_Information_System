/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author Abhirham
 */
public class sqlconn {
    static Connection conn=null;
    
    public static Connection connectUoW() throws SQLException{
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String conurl = "jdbc:sqlserver://localhost:1433;databasename=Windsor University;user=admin;password=password";
            conn = DriverManager.getConnection(conurl);
            System.out.println("connected to Windsor");
            return conn;
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
    }
    
    public static Connection connectUoT() throws SQLException{
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String conurl = "jdbc:sqlserver://localhost:1433;databasename=Toronto University;user=admin;password=password";
            conn = DriverManager.getConnection(conurl);
            System.out.println("connected to toronto");
            return conn;
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
    }
}
