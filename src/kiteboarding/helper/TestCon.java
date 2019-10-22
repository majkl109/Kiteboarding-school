/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiteboarding.helper;

import java.sql.DriverManager;
import java.sql.Connection;


public class TestCon {
    
    public static void main(String[] args) {
        
        String jdbcUrl = "jdbc:mysql://127.0.0.1:3306/?user=root";
        String user = "root";
        String pass = "";
       
        try {
            System.out.println("Connecting to database : " + jdbcUrl);
            
            Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);
            
            System.out.println("Connection succesfull!");
            
          
        }
        catch (Exception exc) {
            exc.printStackTrace();
        }
    }
    
}
