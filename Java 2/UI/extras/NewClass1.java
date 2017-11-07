/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex26.extras;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NewClass1 {
     
    public static void main(String[] args){
    
        
        
        try {
            
            
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost\\SD-12:1433;databaseName=USER","emmanuel" ,"manny" );
                
            
            
            Statement statement = conn.createStatement();
            
            
            ResultSet rs  = statement.executeQuery("select Username from myusers");
                    
            while(rs.next()){ 
            
                System.out.println(rs.getString("Username"));
                
            
                
            }
            
            
                
            
           
            
            
            
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(NewClass1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
        
        
        
        
        
        
    
    
    
    }
   
}
