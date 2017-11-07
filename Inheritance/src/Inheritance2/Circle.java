package ex10Inheritance;

public class Circle extends Shape{

	
	private int radius;
	
	
	
	public Circle(Colors myColour, int radius){
		super(myColour);
		this.radius = radius;
		draw();	
	}
		
	
	public void setRadius(int radius){
		this.radius = radius;
	}
	
	public int getRadius(){return radius;}
	
	
	
	
	@Override
	public void draw(){
		
		System.out.println(("Drawing a Circle...."));
	}
	
	

	
	public String toString(){
		
		return "Radius: " + radius + "\nColour: " + getMyColour() ;
	}
	
	
	
	
}
