package sheet3ControlFlow;
import java.util.Scanner;
public class Ex_3_11{

	public static void main(String[] args){
			
	//	double totalCost = sc.nextDouble();totalCost, double totalCost	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the unit price");
		int unitPrice = sc.nextInt();
		
		String refNo = "abc" ;
		System.out.println("Enter the qty");
		double qtyOrdered  = sc.nextDouble();
		
		
		
		Ex_3_11 df = new Ex_3_11();
		double result = df.calculateTotalCost( refNo, unitPrice,  qtyOrdered);
		
		System.out.printf("The totalCost is: €%.2f " , result);
		
	
	}
	
	public double calculateTotalCost(String refNo, double unitPrice, double  qtyOrdered){
	//	int order = 100;
	//	float remainder = 0.75f;
		double cost ;
		if(qtyOrdered <= 100){
			 cost = unitPrice * qtyOrdered ;
		}
		else{
			
		 cost = ((qtyOrdered - 100) * 0.75) + (100*unitPrice);
		
		}
		return cost;
	}
	
	
}
//€€€€€€