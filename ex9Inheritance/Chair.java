package ex9Inheritance;
//* @author : Emmanuel Akinrintoyo
//* Date: 17/05/2017


enum ChairType{
STOOL,
ARMCHAIR, 
DININGCHAIR
}

public class Chair extends Furniture {

	
	
	private ChairType myChairType;

	private boolean gasLift;

	
	public Chair(){}
	
	
	public Chair(ColorType myColor, MaterialType myMaterial, ChairType myChairType){
		super( myMaterial , myColor );
		
		
		this.myChairType = myChairType;
		
	}
	
	
	/*public Chair(boolean gasLift, String chairType){
		this.gasLift = gasLift;
		this.chairType =chairType;
	}public void setChairType(String chairType){
		
		this.chairType = chairType;
	}
	*/
	
	public void setName(boolean gasLift){
		this.gasLift = gasLift;
	}
	
	public boolean getGasLift(){return gasLift;}
	//public String getChairType(){return chairType;}
	
	public String toString(){
	
		return 	String.format("The  is chair type %s  and the gas lift is %s ", myChairType , gasLift ) + "Material: " + getMyMaterial() + "Color: " + getMyColor();
		
				
	}
}
