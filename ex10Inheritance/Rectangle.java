package ex10Inheritance;




public class Rectangle extends Shape{

	private double height;
	private double width;
	private double area;

	//super( myColour);Colors myColour
	public Rectangle(){
		super();
	}
	
	
	public Rectangle(Colors myColour, double height, double width ){
		//this();
		
		super( myColour);
		this.height = height;
		this.width =  width;
		draw();
	}
	
	
	public void setHeight(double height) {
	this.height = height;
	}

	public void setWidth(double width) {
	this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	
	public double getArea(){
		double area = height * width;
		return area;
	}


	
	@Override
	public void draw(){
		
		System.out.println(("Drawing a Rectangle......"));
	}
	
	
	public String toString() {
		return "Width: " + width + "\nHeight: " + height +  "\nArea: "+ getArea() + "\nColour: " + getMyColour();

	}

}
