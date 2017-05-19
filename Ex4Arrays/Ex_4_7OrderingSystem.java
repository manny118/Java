package Ex4Arrays;

import javax.swing.JOptionPane;

public class Ex_4_7OrderingSystem {

	public static void main(String[] args) {

		int[] refNums = { 1000, 1001, 1002, 1003, 1004 };
		String[] productNames = { "Keyboard", "Mouse", "Monitor", "Mouse mat", "Speaker", };
		double[] prices = { 49.99, 15.50, 124.99, 3.99, 23.50 };
		boolean refNumFound = false;
	//	Array.b
		int i = 0;
		for (; i < refNums.length; i++) {
			
		}
		
		int j = 0;
		System.out.printf("%-15s%-15s%s\n", "RefNo","ProductNames", "Prices");
		System.out.println();
		for (; j < refNums.length; j++) {
	//		System.out.print(refNums[j]);
			
			
			System.out.printf("%-15d%-15s%.2f", refNums[j], productNames[j], prices[j]);
			System.out.println();
	//		System.out.print("\t   " + productNames[j]);
	//		System.out.println(" \t" + prices[j]);

		}

		String userInput = JOptionPane.showInputDialog("Enter a reference number");

		int refno = Integer.parseInt(userInput);

		for (i = 0; i < refNums.length; i++) {
			
			
			//break;
		}
	
		
		for (i = 0; i < refNums.length; i++) {

		

			if (refno == refNums[i]) {
				refNumFound = true;
	JOptionPane.showMessageDialog(null, String.format("That is a %s and it costs €%.2f", productNames[i], prices[i]));

				String qty = JOptionPane.showInputDialog(null, "How many would you like to order?");

				int totalCost = Integer.parseInt(qty);

				JOptionPane.showMessageDialog(null,
						String.format("The total cost of your order will be: €%.2f", (totalCost * prices[i])));
				break;
		
			}
			

			
			
			
		}

		if(!refNumFound){
			JOptionPane.showMessageDialog(null, "Reference number not found");
		
			
		}
		
		
		
		

	}

}

