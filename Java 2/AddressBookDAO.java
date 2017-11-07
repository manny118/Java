
import java.util.ArrayList;



public interface AddressBookDAO {
    
    
    public ArrayList<AddressBookData> getAllEntries();
  
    public ArrayList<AddressBookData> searchByLastName(String lastName);
     
    public boolean insert(String firstName, String lastName, String email, 
            String phoneNumber);
    
    public boolean update(int id, String firstName, String lastName, String email, 
            String phoneNumber);
     
     public boolean delete(int id);
}
