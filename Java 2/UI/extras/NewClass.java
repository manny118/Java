

package ex26.extras;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class NewClass {
    
    
    
    
    
    public static void main(String[] args){
    
    
    
        String url  =  "jdbc:sqlserver://localhost:1433/USER";
    
        try {
            
            Connection conn = DriverManager.getConnection(url);
        
            Statement stmt = conn.createStatement();
        
            ResultSet rs = stmt.executeQuery("Select * from userlogin");
        
            
            
            while(rs.next()){
            
                
                System.out.println(rs.getString(1));
                
            }
        
        
        } catch (SQLException ex) {
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    
    
    
    }
    
    
    
    
    
    
    
}
