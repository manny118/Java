
package ex29;

public class MyPizza {
    
enum PizzaName{

    INDIAN_APACHE, 
    MEXICAN_PEPPER_VOLCANO,
    ALL_DAY_BREAKFAST,
    BACON_APACHE,
    BUFFALO,
    CAJUN_APACHE,
    CHICKEN_APACHE,
    GERORIMO,
    HOT_APACHE,
    SITTING_BULL,
    TEXAS_BEEF_FIESTA,
    TOMAHAWK,
    VEGETARIAN,
    WIGMAMMER,
    MAKE_YOUR_OWN
    ;

}
    
    
enum PizzaSize{
    PERSONAL(2), 
    SMALL(4),
    MEDIUM(5.60),
    LARGE(2.3);

    private double price;
    
    private PizzaSize(double price){
    this.price   = price;
    
    }
    
    public void setPrice(){
    this.price = price;
    }
    
    public double getPrice(double price){
    this.price = price;
    return price;
    }
    
}
    
enum PizzaBase{
    REGULAR,
    APACHE_RISING,
    THIN

}
 
enum ExtraToppings{
    TOMATOES,
    ONION,
    PEPPERONI,
    HAM,
    SAUSAGE,
    BACON,
    CHICKEN,
    PINEAPPLE,
    MUSHROOMS,
    JAPALENOS,
    SWEETCORN,
    GREEN_PEPPERS,
    EXTRA_CHEESE,
    SALAMI
}

enum Sauce{
ORIGINAL,
BBQ_SAUCE,
NO_SAUCE,
CURRY_SAUCE
}
    
    





    
    
    
    
    
    
    
    
}
