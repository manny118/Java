package Ex4Arrays;

public class Correct3 {

	public static void main(String[] args) {

		String[] names = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		String[] heading = { "M", "T", "W", "T", "F", "S", "S" };

		int[] startingDayOfEachMonth = { 6, 2, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 };

		int[][] daysInTheMonths = {

				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28,
						29, 30, 31 },
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27,
						28 },
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28,
						29, 30, 31 },
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28,
						29, 30 },
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28,
						29, 30, 31 },
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28,
						29, 30 },
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28,
						29, 30, 31 },
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28,
						29, 30, 31 },
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28,
						29, 30 },
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28,
						29, 30, 31 },
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28,
						29, 30 },
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28,
						29, 30, 31 },

		};
		
		
		///////trying to print the spaces

		for (int i = 0; i < daysInTheMonths.length; i++) {

				System.out.print("\n \n");

				System.out.printf(names[i] + " \n");

				for (int j = 0; j < heading.length; j++) {

					System.out.print(heading[j] + "       ");

	
				}				

				System.out.println("\n");

			
				
				for (int k = 0; k < daysInTheMonths[i].length; k++) {

					
					for(int y=0; y<startingDayOfEachMonth.length; y++){
					//System.out.println();
					//System.out.print(startingDayOfEachMonth[y]);
				
						//if()
							
							
					}			
			
					
					
					
					System.out.print(daysInTheMonths[i][k]);
					System.out.printf("\t");

					
					
					if (k == 6 || k == 13 || k == 20 || k == 27) {

						System.out.print("\n" );

					}

					
					
					
				
				}

				
			
		}
		
			
			
	
		
		
		
		
		

	}

}
