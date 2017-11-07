
enum PizzaSize {

	SMALL(7), MEDIUM(9), LARGE(12), EXTRA_LARGE(15);

	private int diameter;

	private PizzaSize(int diameter) {
		this.diameter = diameter;

	}

	public void setDiameter() {

	}

	public double getDiameter() {
		return diameter;
	}

	
}



public class Pizza {


	private PizzaSize myPizzaSize;

	private double price;

	public static final double SMALL_SIZE_TOPPINGS = 1.00;
	public static final double MEDIUM_SIZE_TOPPINGS = 1.20;
	public static final double LARGE_SIZE_TOPPINGS = 1.50;
	public static final double EXTRA_LARGE_SIZE_TOPPINGS = 2.00;

	private String[] toppings ;

	public Pizza() {
	}

	public Pizza(String[] toppings, PizzaSize myPizzaSize) {
		this.toppings = toppings;
		this.myPizzaSize = myPizzaSize;
		setPrice(price);
	}

	public String[] getToppings() {

		return toppings;
	}

	public void setToppings(String[] toppings) {

		this.toppings = toppings;		
	}

	public void setPrice(double price) {
		
	this.price = price;
		
		
	}
	public double getPrice() {
		return price;
		
	}

	public PizzaSize getMyPizzaSize() {
		return myPizzaSize;
	}

	public void setMyPizzaSize(PizzaSize myPizzaSize) {
		this.myPizzaSize = myPizzaSize;
	}
	
	 public void displayToppings() {
		 
		 System.out.println("\nToppings:");
		 for(int i=0; i<toppings.length;i++){
			 System.out.println( toppings[i]);
		 }
		 
		 
	 }
	 
	 public double calculatePrice() {
		 
		 return price;
	 }
	 
	 
	 
	public String toString() {
		return " " + getMyPizzaSize() + calculatePrice() ;
	}
	
	
	
}
	
	
	
	