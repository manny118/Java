package ex5Classes;

public class carClass {

		
	private	String make;
	
	private	String model;
	private	double engineSize;
	
	public carClass(){
		
	}
	
	public carClass(String make, String model, double engineSize){
		
		this.make = make;
		this.model = model;
		this.engineSize = engineSize;
		
	}
	
	
	
	public String getMake(){
	//	make = "";
	//	System.out.println("Range");
		
		return make;
		
		}
	public String getModel(){
		
		return model;
	}
	public double getEngineSize(){
		return engineSize;
	}

	
	public void setMake(String make){
		this.make = make;
	//	System.out.println("This is a range rover");
	}
	
	public void setModel(String model){
		this.model = model;}
	
	public void setEngineSize(int engineSize){
		
		this.engineSize = engineSize;
	}
	

	public String toString(){
		
		return "The make of the car is: " + make + ", the model is: " + model + "and the engine size is: " +engineSize;
	}
	
	
	
}
