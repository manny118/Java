package ex12Inheritance;

enum Pizza{
	
	SMALL( 7.0 , "diameter")
	
	//MEDIUM(9) , LARGE(12), EXTRA_LARGE(15)
	
	private double price ;
	private double diameter;
	
	private Pizza(double price, String diameter){}
	
	public void setPrice(){}
	public double getPrice(){return price;}
	
	
	
	
}




public class PizzaClass {


	private Pizza myPizza;
	
	
	String[] toppings = new String[5];
	
	public PizzaClass(){
		
	}
	
	
	
	
	
	
	public void displayToppings(){}
	
	public void calculatePrice(){}
	
	public String toString(){return  null;}
	
	
	
	
	
	
	
}
