import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListManager implements AddressBookDAO{
   
    private ArrayList<AddressBookData> listOfData = new ArrayList<AddressBookData>();
    
    public void populateAddressBookList(){
    
        AddressBookData addressBook1 = new AddressBookData("Matt", "Joy", 
                "mattfly@yahoo.com", "0864506453");
        
        AddressBookData addressBook2 = new AddressBookData("Will", "Joy", 
                "will@yahoo.com", "0978495343");
        
         
        AddressBookData addressBook3 = new AddressBookData("Henry", "Thiery", 
                "henryth@mymail.com", "0784085639");
        
         AddressBookData addressBook4 = new AddressBookData("Mary", "Highy", 
                 "highy@gmail.com", "08905730542");
        
     
         AddressBookData addressBook5 = new AddressBookData("Success", "Victory", 
                 "blessed@yahoo.com", "09847573054");
        
         
         AddressBookData[] arrayOfData = {addressBook1, addressBook2, 
             addressBook3, addressBook4, addressBook5};
         
         
         listOfData.addAll(Arrays.asList(arrayOfData));
    
    }
    
    
    
    public ArrayList<AddressBookData> getAllAddressBookEntries(){
    
    
        
        return listOfData;
    }
    
    public ArrayList<AddressBookData> searchByLastName(String lastname){
    
       /// ArrayList<AddressBookData> listtt = new ArrayList<>():
        ArrayList< AddressBookData > list = new ArrayList<>();
        
        for(AddressBookData data: list){  
            
            if(data.getLastName().equals(lastname)){
            list.add(data);
            
            }
            
        
        }
        
    
    return list;
    } 

    @Override
    public ArrayList<AddressBookData> getAllEntries() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean insert(String firstName, String lastName, String email, String phoneNumber) {
     
        AddressBookData data = new AddressBookData(firstName, lastName, email, phoneNumber);
        return listOfData.add(data);
    
    }
  
    @Override
    public boolean update(int id, String firstName, String lastName, String email, String phoneNumber) {
      return true;
    
    }

    @Override
    public boolean delete(int id) {
      
      //  for(
                
        Iterator<AddressBookData> i  = listOfData.iterator();
                
        while(i.hasNext()){
                
            AddressBookData data  = i.next();
                
            if(data.getID()  == id){
               
                i.remove();
                
                return true;
                
                }
                 
         }
        
        return false;
    
    }

    
    
    
}
