
public class MainForPizza {

	public static void main(String[] args) {


		
		
		
		

		String[] toppings ={"Cheese", "cHOCOLATE"};
		
		Pizza pp = new Pizza(toppings, PizzaSize.EXTRA_LARGE);
		
		
		Pizza[] newpizza = {pp};
		
		
		Customer customer1 = new Customer("Yeat", "Dublin", "0973246", newpizza, toppings, PizzaSize.SMALL);
		
		
		System.out.println(customer1);
		
		customer1.displayToppings();
		customer1.calculatePrice();
		
		
		
		
		
		Customer customer2 = new Customer("Emma", "USA", "08623242322", newpizza, toppings, PizzaSize.MEDIUM);
		
		System.out.println(customer2);
		customer2.displayToppings();
		customer2.calculatePrice();
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
}
