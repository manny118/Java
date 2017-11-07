package ex9Inheritance;
//* @author : Emmanuel Akinrintoyo
//* Date: 17/05/2017

 enum MaterialType{
	WOOD,
	PLASTIC
}

 enum ColorType{
	RED, 
	GREEN,
	YELLOW
}


public class Furniture {
	
	private MaterialType myMaterial;
	private ColorType myColor;
	
	
/*	private String color;
	private String materialType;

	private static final int WOOD = 1;
	private static final int PLASTIC = 2;
	
	*/
	
	public Furniture(){
		

	}
		
	/*public Furniture(String color,String matrerialType ){
		//this();
		
	}
	*/
	////this is for the enum
	public Furniture(MaterialType myMaterial, ColorType myColor){
		this.myMaterial = myMaterial;
		this.myColor = myColor;
			
		}
	
	public void setMyMaterial(MaterialType myMaterial){
		
		this.myMaterial = myMaterial;
		
	}
	public void setMyColor(ColorType myColor){
		
		this.myColor = myColor;
	}
	
	
	
	public MaterialType getMyMaterial(){
		return myMaterial; 
	}
	
	
	public ColorType getMyColor(){
		return myColor;
	}
	
	

	/*
	
	public void setColor(String color){
		this.color = color;
	}
	
	public void setMaterialType(String materialType){
		this.materialType = materialType;
	}
	
	
	public String getColor(){return color;}
	public String getMaterialType(){return materialType;}
	*/
/*	public String getMaterialAsString(){
		
		switch(materialType){
		case WOOD:
			
		}
		
	}
	*/
	
	
	
	public String toString(){
		return "Color:" + myColor + "MyMaterial: " + myMaterial;
	}
	
	
	
	
	
	
}
