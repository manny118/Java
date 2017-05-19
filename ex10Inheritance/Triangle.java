package ex10Inheritance;

public class Triangle extends Shape{

	
	public Triangle(Colors myColour){
		
		super(myColour);
		draw();
		
	}
	
	
	
	@Override
	public void draw(){
		
		System.out.println(("Drawing a Triangle...."));
	
	}
	
	
	
	public String toString(){
		
		return "Colour: " + getMyColour();
	}
	
	
	
	
	
	
}
