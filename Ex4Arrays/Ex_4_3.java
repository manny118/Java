package Ex4Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_4_3 {
/*	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] num1 = new int[8];
		int[] num2 = new int[8];

		for (int i = 0; i < num1.length; i++) {
			System.out.printf("populate array1 element[%d] :", i);
			num1[i] = sc.nextInt();

		}
		for (int i = 0; i < num1.length; i++) {

			System.out.printf("populate array2 element[%d] : ", i);
			num2[i] = sc.nextInt();

		}

		Ex_4_3 vv = new Ex_4_3();
		vv.calculateSum(num1, num2);

	}

	public void calculateSum(int[] num1, int[] num2) {

		int[] sum = new int[8];
		for (int i = 0; i < sum.length; i++) {

			sum[i] = num1[i] + num2[i];
			// System.out.println(Arrays.toString(sum));

			System.out.printf("The value of sum[%d] is %d \n", i, sum[i]);
		}

	}
*/
	
	public static void main(String[] args) {
		int[] array1 = {2, 4, 6, 8, 10, 12, 14 , 16};
		int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8};
	
		
		Ex_4_3 ss = new Ex_4_3();
		
		ss.sumOfArrays(array1, array2);
		
	}
	public void sumOfArrays(int[] array1, int[] array2){
		System.out.println("Array1\t\tArray2\t\tSum");
		System.out.printf("%-12s%-12s%s\n", array1, array2);
		for(int i=0; i<array1.length; i++){
			System.out.println();
			System.out.printf("%d%d%d", array1[i] , array2[i] , (array1[i] + array1[i]));
			
		}
//	public void printMyArray(int[] myArray){}
	
		
	//	for(int i=0; i<myArray.length;i++){}
			
		
		
	
			
			//	
		
		
	}
	
	
	
}