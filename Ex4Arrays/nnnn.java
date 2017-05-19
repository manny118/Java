package Ex4Arrays;

public class nnnn {

	public static void main(String[] args) {


		
		

		
		
		String[] names = {"January", "February", "March", "April", "May", "June","July","August","September", "October","November","December"};	
			
		String[] heading = {"M", "T", "W", "T", "F", "S", "S"};	
		
		int[]
				startingDayOfEachMonth = {6, 2, 2, 5 , 0 , 3, 5, 1 , 4, 6, 2, 4};
		
		
		int [ ][] daysInTheMonths = {
				
				{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31} ,



		};
			
			
		

		for(int j=0; j<names.length; j++){
		
			System.out.println( names[j] );	
	
			
			
		//	{	;	}
			
			
			
			for(int i=0; i<daysInTheMonths[j].length; i++){	
				
				
		
				for(int k=0; k<heading.length; k++){
					
					
					
					
					
				}
				System.out.printf(heading[i] + "\t" ); 
	System.out.println(daysInTheMonths[j][i]);	
				
			
			
			}
			
			
			
		
			
			
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
