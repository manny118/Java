package sheet3ControlFlow;

import java.util.Scanner;

public class Ex8RandomNumberOfInputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scanner = new Scanner(System.in);
		int num = 0;
		int total = 0;
		int counter = 0;
		do{
		
			
			 System.out.println("Please typr an integer: ");
			 total  = total + num; 
			 num = scanner.nextInt();
			 counter++;
			
			
		}
		
		
		while(num != -1);

		
		System.out.println("the tota is: " + total);
		System.out.println("the average is: " + (double)total /counter);
		
		
		
		scanner.close();	
	}

}
