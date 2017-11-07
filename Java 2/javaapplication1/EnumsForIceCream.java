/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

/**
 *
 * @author dsd12
 */
public class EnumsForIceCream {
 
enum IceCreamChoice{
CONE(1.50), SUNDAE(1.90),BANANA_SPLIT(2.50);

private double price;

private IceCreamChoice(double price){
this.price = price;
}

public double getPice(){
return price;}

public void setPrice(){

}

}
enum Toppings{

FLAKE(0.20), SPRINKLES(0.20), SYRUP(0.20);

private double pricePerToppings;

private Toppings(double pricePerToppings){

this.pricePerToppings = pricePerToppings;
}

public double getPricePerToppings(){
return pricePerToppings;
}

public void setPricePerToppings(){

}

}

enum IceCreamFlavour{
CHOCOLATE, VANILLA, STRAWBERRY

}
 



}
