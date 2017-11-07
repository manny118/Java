package ex9Inheritance;
//* @author : Emmanuel Akinrintoyo

//* Date: 17/05/2017

enum BedSize {
	single, doubleSize, bunk
}

public class Bed extends Furniture {

	
	private BedSize bedSize;
	
	private boolean hasHeadBoard;

	public Bed() {
		super();
	}

	public Bed(ColorType myColor, MaterialType myMaterial, BedSize bedSize, boolean headBoard) {
		super( myMaterial , myColor );
		
		this.hasHeadBoard = headBoard;
		this.bedSize = bedSize;
	}

	
	private void setBedSize(BedSize bedSize){
		this.bedSize = bedSize;
		
	}
	private BedSize getBedSize(){
		
		return bedSize;
	}
	
/*	
	public void setBedSize(String bedSize) {
		this.bedSize = bedSize;
	}
	public String getBedSize() {
		return bedSize;
	}

	*/
	
	
	public void setHeadBoard(boolean hasHeadBoard) {
		this.hasHeadBoard = hasHeadBoard;
	}


	public boolean getHeadBoard() {
		
		return hasHeadBoard;
	
	}

	public String toString() {

		return  " " + bedSize + hasHeadBoard + getMyMaterial() + getMyColor();

	}

}
