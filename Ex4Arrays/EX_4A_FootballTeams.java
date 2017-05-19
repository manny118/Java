package Ex4Arrays;

import java.util.Arrays;

public class EX_4A_FootballTeams {

	public static void main(String[] args) {


		String[][] names = {
				
				{"Man utd", "Rashford","Martial","Griezmann" },
				
				{"Man city","Sane","Sterling", "Gabriel",}
				
		};
		
		for(int i=0; i<names.length; i++){
			
		
			
			for(int j=1; j<names[i].length; j++){
				
				
			//	for(int k=0; k<names.length; k++){
				System.out.print(names[i][j] + " ");
			
				
			
			
			}
			
			System.out.println( "" );
			
			
		}
		
		
		
		
		
		
		
		
	}

}
