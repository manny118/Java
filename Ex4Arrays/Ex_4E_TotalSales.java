package Ex4Arrays;

public class Ex_4E_TotalSales {

	public static void main(String[] args) {
	
		int eachProductTotal = 0;
		
		//there are four salespersons
		int[] salesPerson = { 1, 2, 3, 4 };
		
		
		int salePerson1Total = 0, salePerson2Total = 0, salePerson3Total = 0, salePerson4Total = 0,
				salesPersonsTotal = 0;
		
		
		//each salesperson sells five products each
		int[] product = { 1, 2, 3, 4, 5 };
		
		
		//this array 
		int[][] sales = {

				{ 100, 200, 120, 150 }, //the total for product one for each salesperson
				
				{ 200, 230, 420, 390 }, 
				
				
				{ 80, 346, 150, 890 }, 
				
				{ 425, 280, 50, 90 },
				
				{ 120, 232, 87, 67 } };

		
		
		
		
		System.out.println("The sales slip: \n");
		System.out.printf("%-15s%-15s%s", "SalesPerson#", "Product#", "Total€ \n");
		System.out.printf("%-15s%-15s%2$s", "----", "-------");
		System.out.println();
		
		int s=0;//	

		int dd = 0;
			
		//this prints out the first part of the question
		for(int d=0; d<salesPerson.length;d++){
				
				System.out.println();
				
				for( s=0; s<product.length;s++){
					
					System.out.printf("%-16d", salesPerson[d]);
					
					System.out.printf("%-15d", product[s]);
					System.out.printf("%5d", sales[s][d]);
				
					System.out.println();
				
				
				}	
			
			}	
		
			
		
		System.out.println("\n\n");
		
		
		
		
		
		
		
		///second part
		
		
		System.out.printf("\n\n\n%12d%12d%12d%12d%12s", 1, 2, 3, 4, "Total");
		System.out.printf("\n%s", "-------------------------------------------------------------");
		int i = 0;
		for (; i < sales.length; i++) {

			System.out.println();

			
			//for (int k = 0; k < product.length; k++) {     //break;	//}
				System.out.print(product[i]);
				
		
			
			for (int j = 0; j < sales[i].length; j++) {
		
				eachProductTotal += sales[i][j];
				System.out.printf("%12d", sales[i][j]);

			}
	
			System.out.println("       " + eachProductTotal);

			eachProductTotal = 0;

		}
		
		///this forloop takes the each salesperson total and adds it up
		for (int p = 0; p < sales.length; p++) {

			salePerson1Total += sales[p][0];
			salePerson2Total += sales[p][1];
			salePerson3Total += sales[p][2];
			salePerson4Total += sales[p][3];
			salesPersonsTotal = salePerson1Total + salePerson2Total + salePerson3Total + salePerson4Total;
		}

		System.out.println("-------------------------------------------------------------");
		System.out.printf("%s%8d%12d%12d%12d%10d", "Totals", salePerson1Total, salePerson2Total, salePerson3Total,
				salePerson4Total, salesPersonsTotal);
		
		

	}
}
