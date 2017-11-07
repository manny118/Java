public class Customer extends Pizza {

	private String name;
	private String address;
	private String phoneNumber;
	
	
	private Pizza[] pizza;

	public Customer(){
		super();
		
	}
	
	public Customer(String name, String address,String phoneNumber, Pizza [] pizza, String[] toppings, PizzaSize myPizzaSize){

		super(toppings, myPizzaSize);
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.pizza = pizza;

	}
	

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public Pizza [] getPizza() {
		return pizza;
	}


	public void setPizza(Pizza [] pizza) {
		this.pizza = pizza;
	}


	public double getTotalCost() {
	
		
		
		return 0;
		
	
	}

	
	@Override
	public String toString() {
		
		
		return  "\nCUSTOMER \nName: " + name + "\nAddress: " + address + ""
				+ "\nPhoneNumber: " + phoneNumber
			 + "\nPizzaSize: " + getMyPizzaSize() + "\nTotal cost: "	+ getTotalCost()  ;
	
	
	
	
	}
	
	
}
