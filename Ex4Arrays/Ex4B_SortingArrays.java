package Ex4Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex4B_SortingArrays {
Scanner sc;
	public static void main(String[] args) {
	//	
		
		int randonNumbers[] = new int[50];
		
		
		Random ran = new Random();

		for (int i = 0; i < randonNumbers.length; i++) {
			int num = ran.nextInt(100) + 1;
			randonNumbers[i] = num;

		}

		for (int i = 0; i < randonNumbers.length; i++) {
			// System.out.println(Arrays.toString(randonNumbers));
			System.out.println(randonNumbers[i]);

		}

		Scanner sc =new Scanner (System.in); ;
		
		int num1 = 0  ;//sc.nextInt();
		
		System.out.println();
		
		System.out.println(randonNumbers.length + "is the length of the array\n");
		
		Ex4B_SortingArrays nn = new Ex4B_SortingArrays();
		
		 nn.findLargestElement(randonNumbers);
		 
		 nn.findSmallestElement(randonNumbers);
		 
		
		 nn.printArray(randonNumbers);
		 nn.sortArray(randonNumbers);
		nn.searchArray(randonNumbers, num1);
	
	}

	//

	public void findLargestElement(int[] myArray) {

		int largest = myArray[0];
	
		for (int find: myArray) {
			
			if (  find >  largest) {
				
				
				largest = find;
				
			} 
		
		}
		System.out.println(largest + "is the largest");
	
	
	}
		

	public void findSmallestElement(int[] myArray) {

		int smallest = myArray[0];

		for (int find : myArray) {

			if (find < smallest) {
				smallest = find;

			}

		}
		System.out.println();
		 System.out.println(smallest + " is the smallest\n");

	}

	public void printArray(int[] myArray) {
		int i;
		//for (i = 0; i < myArray.length; i++) {	}

	
		for (i = 0; i < myArray.length; i++) {

			
			System.out.printf(Arrays.toString(myArray));
			break;
		}

	}


	public void sortArray(int[] myArray) {
		int temp = 0;


		
		System.out.println("\n\nSorting the array we get: ");
		for (int i = 0; i < myArray.length; i++) {

			for (int j = i + 1; j < myArray.length; j++) {

				if (myArray[i] > myArray[j]) {

					temp = myArray[i];
					myArray[i] = myArray[j];
					myArray[j] = temp;

				}

			}
//	
		System.out.printf(  myArray[i] + " ");	

		}
		
	}
	
	public void searchArray(int[] myArray, int num){
	
		System.out.println("\n\nTo search the array enter a no: ");
		
		sc = new Scanner (System.in);
		
		int counter =0;
		
		 num = sc.nextInt();
		 
		int i=0;
		for(  ; i<myArray.length;i++){
		
			counter++;
			if( myArray[i]==num ){
				
				System.out.printf(num + " was found in the %dth position", counter);
			
				break;
			}
			
		
		}
	
		
		
	}
	
	
	
	
	

}
