package ex5Classes;

public class DogClass {

	
	
	
	private int breed;
	private String colour;
	private String ownersName;
	
	

	public static final int LABRADOR =1;
	public static final int GERMAN_SHEPHERD = 2;
	public static final int BULLDOG = 3;
	public static  final int ROTTWEILLER = 4;
	public static final int ALSATIAN = 5;
	public static final int POINTER = 6;


	public DogClass(){

	}
	public DogClass(int breed, String colour, String ownersName){
		this.breed = breed;
		this.colour = colour;
		this.ownersName = ownersName;
	}


	public void setBreed(int breed){

		if(breed >= 1 && breed <=6){
			this.breed = breed;

		}	
		else
		System.out.println("Invalid");
		
	}
	
	public void setColour(String colour){
		this.colour = colour;
	}
	
	public void setOwnerName(String ownersName){
		this.ownersName = ownersName;
	}
	
public int getBreed(){
		
		return breed;
	}
	public String getColour(){
		colour = "blue";
		System.out.println("The color is: " + colour);
		return colour;
	}
	public String getOwnersName(){
		ownersName = "Stephen";
		System.out.println("The owner is: " + ownersName);
		
		
		
		return ownersName;
	}
	
	
	public String getBreedToString(){
		
		switch(breed){
		case LABRADOR:
			return "LABRADOR";
		case ALSATIAN:
			return "ALSATIAN";
		case BULLDOG:
			return "BULLDOG";
		case GERMAN_SHEPHERD:
			return "GERMAN_SHEPHERD";
		case POINTER:
			return "POINTER";
		case ROTTWEILLER:
			return "ROTTWEILLER";
		default:
			System.out.println("Breed isn't set");
			
		}
	
		return null;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String toString(){
		
		return "The breed is " + getBreedToString() + ", it's " + colour + " and the owner is: "+ ownersName;
	}

	
	
}
