package sheet3ControlFlow;

public class Ex_3_15 {

	public static void main(String[] args) {

		int[] num = { 3, 5, 6, 7, 12 };
		
		int largest = 0;
		int i = 0;
		for ( ;i < num.length; i++) {
			largest = num[i];
			if (num[i] > largest)
				largest = num[i];

		}

		System.out.printf("the largest is %d and it's position is %d", largest, i);
	}

}
