package ex6ArrayOfObjects;

public class carClass {

	private String make;

	private String model;
	private double engineSize;

	public carClass() {

	}

	public carClass(String make, String model, double engineSize) {

		this.make = make;
		this.model = model;
		this.engineSize = engineSize;

	}

	public String getMake() {
		// make = "";
		// System.out.println("Range");

		return make;

	}

	public String getModel() {

		return model;
	}

	public double getEngineSize() {
		return engineSize;
	}

	public void setMake(String make) {

		switch (make) {
		case "Audi":
		case "Ford":
		case "Honda":
		case "BMW":
		case "Kia":
		case "Mercedes":
		case "Rolls Royce":
			this.make = make;
			break;
		default:
			System.out.println("It's unavailable");
		}

	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setEngineSize(double engineSize) {

		if(engineSize >= 1 && engineSize<= 2.3){
		
		this.engineSize = engineSize;}
		else{
			System.out.println("engineSize is not available");
		}
		
		
	}

	public String toString() {

		return "The make of the car is: " + make + ", the model is: " + model + "and the engine size is: " + engineSize;
	}

}
