

package ex26.extras;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class NewConnection {
    //MSSQLSERVER
    //SQLEXPRESS
    
    public static void main(String[] args){
    
     String url1  = "jdbc:odbc:Driver={SQL Server}; SERVER=SD-12 \\MSSQLSERVER;  Database=TSQL2012";
                  
        String url = "jdbc:odbc:Manny_DB";
                
        try {
            
            Connection conn = DriverManager.getConnection(url1);
            
        } catch (SQLException ex) {
            Logger.getLogger(NewConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    //    
        ///PrintReader pw = new PrintWriter();
        
        
        
        
    //    BufferedReader br = new BufferedReader();
        
        
        
    }
    
}
