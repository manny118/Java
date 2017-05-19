package Ex4Arrays;

public class total3 {




public static void main(String[] args) {
	
	int[] salesPerson = { 1, 2, 3, 4 };

	int[] product = { 1, 2, 3, 4, 5 };
	int[][] sales = {

			{ 100, 200, 120, 150 }, { 200, 230, 420, 390 }, { 80, 346, 150, 890 }, { 425, 280, 50, 90 },
			{ 120, 232, 87, 67 } };

	

	System.out.println("The sales slip: \n");
	System.out.printf("%-15s%-15s%s", "SalesPerson#", "Product#", "Total€ \n");
	System.out.printf("%-15s%-15s%2$s", "----", "-------");
	System.out.println();
	
	int s=0;//	

	int dd = 0;
		
	
	for(int d=0; d<salesPerson.length;d++){
			
			System.out.println();
			
			for( s=0; s<product.length;s++){
				
				System.out.printf("%-16d", salesPerson[d]);
				
				System.out.printf("%-15d", product[s]);
				System.out.printf("%5d", sales[s][d]);
			
				System.out.println();
			
			
			}	
		
		}	
	


	
	
	
	
	
		
		
		
		

		
	
	
}








}
































/*
	public static void main(String[] args) {
		// int total[] = new int[15];
	//	int array[] = {1, 2, 3};
		int[] salesPerson = { 1, 2, 3, 4 };
		int[] product = { 1, 2, 3, 4, 5 };
		int[][] sales = {

				{ 100, 200, 120, 150, 310 }, { 200, 230, 420, 390, 120 }, { 80, 346, 150, 890, 410 },
				{ 425, 280, 50, 90, 300 } };

		int[][] sales = {

				{ 100, 200, 120, 150 }, { 200, 230, 420, 390 }, { 80, 346, 150, 890 }, { 425, 280, 50, 90 },
				{ 120, 232, 87, 67 } };

		System.out.println("The sales slip: \n");
		System.out.printf("%-15s%-15s%s", "SalesPerson#", "Product#", "Total€ \n");
		System.out.printf("%-15s%-15s%2$s", "----", "-------");
		System.out.println();
		int salesPerPerson = 0;
		int salesPerProduct = 0;
		int eachSale = 0;
		int i = 0;
		int j=0;
		int g = 0;

		for (; i < sales.length; i++) {
			//
			for (j = 0; j < sales[i].length; j++) {

				System.out.printf("%-10d", salesPerson[i]);

				System.out.printf("%8d", product[j]);

				System.out.printf("%15d", sales[i][j]);
				System.out.println();

			}

			// System.out.println(salesPerPerson);
	
		}
		if(i==0){
			System.out.printf("%15d", sales[i][j]);
			
		}
		
		
		////////////////////////
		///////////////////////////////////////////////
		/////////// / //////////

		// System.out.printf();
		System.out.printf("\n\n\n%10d%10d%10d %10d %10s", 1, 2, 3, 4, "Total");
		System.out.printf("\n%s", "-----------------------------------------------------");

	
		
		
		
		System.out.println();
	//	System.out.printf("\n%-10d\n%-10d\n%-10d\n%-10d\n%-10d", 1, 2, 3, 4, 5);
		int k = 0;//System.out.printf("\n%d\n%d\n%d\n%d\n%d", 1, 2, 3, 4, 5);
		int w=0;
		for (w=0; w < product.length; w++) {
			
			
		System.out.println(product[w] + " ");
	
			}
		for (k = 0; k < sales.length; k++) {

			for (j = 0; j < sales[k].length; j++) {

				salesPerPerson += sales[k][j]; //// works fine
				salesPerProduct += sales[k][j];
				eachSale = sales[k][j];
				if (k == 0 || k == 1 || k == 2 || k == 3)	 {System.out.printf("%50d", salesPerPerson);System.out.println(); }salesPerPerson = 0;	 }

				if (j == 0) {
					System.out.printf("\n%5d", salesPerProduct);
					}
				salesPerProduct = 0;
				
				System.out.printf("%15d", product[w]);
				if(k==0){
				
				System.out.printf("%15d",sales[k][j]);
					
				}
			//	System.out.println(eachSale);
				
				
				
			}

		}
//	 System.out.printf("\n%s", "-----------------------------------------------------");


	//}
*/

