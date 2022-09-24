/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TechQuizApp.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class DBConnection {
    private static Connection conn;
     static
     {
       try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","onlineexam","student");
            JOptionPane.showMessageDialog(null, "Connected successfully to the DB");
            
        }
        
        catch(Exception ex)
        {
          JOptionPane.showMessageDialog(null,"Cannot dbutil Connected Successfully to the db");
          ex.printStackTrace();
          System.exit(1);
        }   
     }
     
      public static Connection getConnection()
      {
       return conn;
      }   
      
      public static void closeConnection()
      {
          try
           {   
               conn.close();
               JOptionPane.showMessageDialog(null,"Disconnected Sucessfully");
           }  
          
          catch(SQLException ex)
          {
             JOptionPane.showMessageDialog(null,"Cannot close Connection to the db");
             ex.printStackTrace();            
          }
      }   
    
}
