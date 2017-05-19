package Ex4Arrays;

public class Ex_4D_Calendar {

	public static void main(String[] args) {

		String[] names = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		String[] heading = { "M", "T", "W", "T", "F", "S", "S" };
	//	int startingDay = 6;int printSpaces = startingDay;
		
		
		int[] startingDayOfEachMonth = { 6, 2, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 };

		int spaces;
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

		for (int i = 0; i < daysInTheMonths.length; i++) {

			System.out.print("\n \n");

			System.out.printf(names[i] + " \n");

			for (int j = 0; j < heading.length; j++) {

				System.out.print(heading[j] + "       ");

	
			}				

			spaces=startingDayOfEachMonth[i];
			
			
			System.out.println("\n");

			
			for(int h=0; h<spaces;h++)
			{
				System.out.printf("\t");
			}
			
			for (int k = 0; k < daysInTheMonths[i].length; k++) {

				
				System.out.print(daysInTheMonths[i][k] + "\t");
				
				/*if(spaces==6){System.out.println();spaces=0;}*/
						
				if(k+spaces==6  || k+ spaces== 13 || k+spaces==20 || k+spaces==27 || k+spaces==34  ){
			
				System.out.println("\n");
				}
				
				
				
			
				
				
				
			
			}
					
			
					
					
						
		
			
		}
		
			
			
	
		
		
	
		
		

	}


}
