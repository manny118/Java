
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DatabaseManager implements AddressBookDAO{

    @Override
    public ArrayList<AddressBookData> getAllEntries() {
        
         ArrayList<AddressBookData> listOfData = new ArrayList<>();
        String url = "jdbc:sqlserver://localhost;integratedSecurity=true;databaseName=AddressBook";
        
        try( Connection conn = DriverManager.getConnection(url) ){
            String sql = "select * from AddressBookEntries";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
            
                int id = rs.getInt("id");
                String firstname= rs.getString("firstname");
                String lastname = rs.getString("lastname");
                String email = rs.getString("email");
                String phoneNumber = rs.getString("phoneNumber");
                
                AddressBookData data = new AddressBookData(id, firstname, lastname, email, phoneNumber);
                listOfData.add(data);
            }
            return listOfData;
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog( null, "Unable to connect");
        }
        
        return listOfData;
    }

    @Override
    public ArrayList<AddressBookData> searchByLastName(String lastName) {
         
        ArrayList<AddressBookData> listOfData = new ArrayList<>();
        String url = "jdbc:sqlserver://localhost;integratedSecurity=true;databaseName=AddressBook";
        
        try( Connection conn = DriverManager.getConnection(url) ){
            String sql = "select * from AddressBookEntries where lastname = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, lastName);
            
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
            
              int id = rs.getInt("id");
              String firstname = rs.getString("firstname");
              String lastname = rs.getString("lastname");
              String email = rs.getString("email");
              String phonenumber = rs.getString("phoneNumber");
              
              AddressBookData data = new AddressBookData(id, firstname, lastName, email, phonenumber);
               
              listOfData.add(data);
            
            }
        }
        catch(SQLException e){
        e.printStackTrace();
        }
        return listOfData;
    }

    @Override
    public boolean insert(String firstName, String lastName, String email, String phoneNumber) {
        
            String sql = "Insert into AddressBookEntries Values(?, ?, ?, ?)";
             String url = "jdbc:sqlserver://localhost;integratedSecurity=true;databaseName=AddressBook";
            
            try(Connection conn = DriverManager.getConnection(url)){
                
                PreparedStatement stmt   = conn.prepareStatement(sql);
                stmt.setString(1, firstName);
                stmt.setString(2, lastName);
                stmt.setString(3, email);
                stmt.setString(4, phoneNumber);
                
                int rowcount = stmt.executeUpdate();
                return rowcount == 1; 
                
            }
            catch(SQLException e){
                e.printStackTrace();
                return false;
            }
    }

    @Override
    public boolean update(int id, String firstName, String lastName, String email, String phoneNumber) {
       
        String sql = "update AddressBookEntries SET firstname = ?, lastname =?, email = ?, phoneNumber = ? where id = ?";
         String url = "jdbc:sqlserver://localhost;integratedSecurity=true;databaseName=AddressBook";
       
        try(Connection conn = DriverManager.getConnection(url)){
        
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, firstName);
            stmt.setString(2, lastName);
            stmt.setString(3, email);
            stmt.setString(4, phoneNumber);
            stmt.setString(5, Integer.toString(id));
            
            int rowcount = stmt.executeUpdate();
           
            return rowcount == 1;
        }
        catch(SQLException e){
        
        e.printStackTrace();
         return false;
        }
        
    }

    @Override
    public boolean delete(int id) {
        
         String url = "jdbc:sqlserver://localhost;integratedSecurity=true;databaseName=AddressBook";
      
        String sql = "Delete from AddressBookEntries where id = ?";
        try(Connection conn = DriverManager.getConnection(url)){
        
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            
            int rowcount = stmt.executeUpdate();
            return rowcount == 1;
            
        }
        catch(SQLException e){
        e.printStackTrace();
        return false;
        }
    }
}
