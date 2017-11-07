
package ex27;

public class Person {
    
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;  
    
    public Person(){}
    
    public Person(int id, String firstName, String lastName, String email, String phoneNumber){
        this.id = id;
        this.firstName   = firstName;
        this.lastName  = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
   
    public void setID(){
    this.id = id;
    }
    
    public int getID(){
    return id;
    }
    
    public void setFirstName(){
    this.firstName  = firstName;
    
   // String regex = "[]";
    
    
    }
    
    public String getFirstName(){
    return firstName;
    }
     
    public void setLastName(){
    this.lastName = lastName;      
    }
    
    public String getLastName(){
    return lastName;
    }
     
    public void setEmail(){
    this.email =  email;
    }
    
    public String getEmail(){
    return email;
    }
    
    public void setPhoneNumber(){
    this.phoneNumber = phoneNumber;}
    
    
    public String getPhoneNumber(){
    return phoneNumber;
    }
    
    public String toString(){
       
    return String.format("ID: %d \nFirstName: %s \nLastName: %s \nEmail: %s \nPhoneNumber: %s", id, firstName, lastName, email, phoneNumber);
        
    }
    
    
    
    
}
