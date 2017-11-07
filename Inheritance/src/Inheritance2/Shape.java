package ex10Inheritance;


enum Colors{
	
	RED, 
	GREEN, 
	BLUE, 
	YELLOW, 
	BLACK, 
	PINK, 
	ORANGE, 
	WHITE, 
	GREY
	
}



public class Shape {

	
	
	
	private Colors myColour;
	
public Shape(){}
	
	
	
	public Shape(Colors myColour){
		
		this.myColour = myColour;
		
	}
	
	
	public void setMyColor(Colors  myColour){
		this.myColour = myColour;
		
		
		
	}
	
	public Colors getMyColour(){
		return myColour;
	}
	
	
	
	public void draw(){
		
		System.out.println(("Drawing a Shape"));
	}



	////
	@Override
	public String toString() {
		return "Shape myColour=" + myColour + " ";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
