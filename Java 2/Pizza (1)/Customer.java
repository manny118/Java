package ex29;
public class Customer {
    
   private int id;
   private String name;
   private String address;
   private String phoneNumber;
   
   private Customer(){
   super();
   }
   
   Customer(String name, String address, String phoneNumber){
     //  this.id = id;int id,
       this.name = name;
       this.address = address;
       this.phoneNumber = phoneNumber;
   }
   
   public void setID(int id){
   this.id = id;
   }
   
   public int getID(){
   return id;
   }
    
   public void setName(String name){
   this.name = name;
   }
    
   public String getName(){
   return name;
   }
   
   public void setAddress(String address){
    this.address = address ;  
   }
   
   public String getAddress(){
   return address;
   }
   
   public void setPhoneNumber(String phoneNumber){
   this.phoneNumber = phoneNumber;
   }
   
   public String getPhoneNumber(){
   return phoneNumber;
   }
   
   public String toString(){
   
   return  "ID: " + getID() + "name: " + getName() + "Address: " + getAddress() + "Phone number: " + getPhoneNumber();
   }
   
}
