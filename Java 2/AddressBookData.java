
public class AddressBookData {
    
       
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;  
    
    
    private static int idcounter = 100;
    
    
    public AddressBookData(){}
    
    
     public AddressBookData(String lastName){}
    
    public AddressBookData(int id , String firstName, String lastName, String email, 
            String phoneNumber){
        
        this.id = id;
        this.firstName   = firstName;
        this.lastName  = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
   
    
    
    public AddressBookData( String firstName, String lastName, String email, 
            String phoneNumber){
        
        this.id = id;
        this.firstName   = firstName;
        this.lastName  = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
   
    public void setID(int id){
    this.id = id;
    }
    
    public int getID(){
    return id;
    }
    
    public void setFirstName(String firstName){
    this.firstName  = firstName;
   
    
    }
    
    public String getFirstName(){
    return firstName;
    }
     
    public void setLastName( String lastName){
    this.lastName = lastName;      
    }
    
    public String getLastName(){
    return lastName;
    }
     
    public void setEmail(String email){
    this.email =  email;
    }
    
    public String getEmail(){
    return email;
    }
    
    public void setPhoneNumber(String phoneNumber){
    this.phoneNumber = phoneNumber;}
    
    
    public String getPhoneNumber(){
    return phoneNumber;
    }
    
    public String toString(){
       
    return String.format("\nID: %d \nFirstName: %s \nLastName: %s "
            + "\nEmail: %s \nPhoneNumber: %s", id, firstName, lastName,
            email, phoneNumber);
        
    }  
    
    
    
    
    
    
}
