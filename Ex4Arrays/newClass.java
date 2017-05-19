package Ex4Arrays;

import javax.swing.JOptionPane;

public class newClass {

	public static void main(String[] args) {

		int[] refNums = { 1000, 1001, 1002, 1003, 1004 };
		String[] productNames = { "Keyboard", "Mouse", "Monitor", "Mouse mat", "Speaker", };
		double[] prices = { 49.99, 15.50, 124.99, 3.99, 23.50 };

		int i = 0;
		for (; i < refNums.length; i++) {

		}

		int j = 0;

		for (; j < refNums.length; j++) {
			System.out.print(refNums[j]);
			System.out.print("\t   " + productNames[j]);
			System.out.println(" \t" + prices[j]);

		}

		String userInput = JOptionPane.showInputDialog("Enter a reference number");

		int refno = Integer.parseInt(userInput);

		
			
			
//	if(refno == refNums[i])	{
		// qty ;	
for( i=0; i<refNums.length;i++){			
		
//	String	qty = JOptionPane.showInputDialog(null, "How many would you like to order?");
			
//	int totalCost = Integer.parseInt(qty);
	
	if(refno == refNums[i] )	{
		
		JOptionPane.showMessageDialog(null,"yass");

	//		JOptionPane.showMessageDialog(null,
		//				String.format("The total cost of your order will be: %.2f", (totalCost * prices[i])));
			//	break;
				
			//	continue;
	
	}		
	else{
				
				
		JOptionPane.showMessageDialog(null,"unavailable");
				break;
	}
			
			
			
}		

			
			
			
			
			
			
			
			
			
			
			
	}
}
