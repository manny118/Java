/**
 * 
 */
package ex9Inheritance;

/**
 * @author : Emmanuel Akinrintoyo Date: 17/05/2017
 *
 */

enum TableType{
	round,
	square,
	retangular
}



public class Table extends Furniture {

	
	
	private boolean isExpandable;
	private String shape;

	public Table() {
	}

	public Table(ColorType myColor, MaterialType myMaterial, boolean isExpandable, String shape) {

		this.isExpandable = isExpandable;
		this.shape = shape;

	}

	public void setIsExpandable(boolean isExpandable) {
		this.isExpandable = isExpandable;
	}

	public void setShape(String shape) {

		this.shape = shape;
	}

	public boolean getIsExpandable() {
		return isExpandable;
	}

	public String getShape() {
		return shape;
	}

	public String toString() {
		return isExpandable + shape + getMyMaterial() + getMyColor();
	}

}
