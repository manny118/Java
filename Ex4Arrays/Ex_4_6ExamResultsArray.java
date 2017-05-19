package Ex4Arrays;

import java.util.Arrays;

public class Ex_4_6ExamResultsArray {

	public static void main(String[] args) {

		int[] examResult1 = { 29, 5, 97 };
		int[] examResult2 = { 99, 5, 97 };
		int[] examResult3 = { 29, 75, 97 };
		
		
	
		for (int i = 0; i < examResult1.length; i++) {}
		for (int i = 0; i < examResult2.length; i++) {}
		for (int i = 0; i < examResult3.length; i++) {}

		Ex_4_6ExamResultsArray ss = new Ex_4_6ExamResultsArray();
		String myAnswer = ss.calculateResult(examResult1);
		System.out.println("The first one: " + myAnswer);

		String myAnswer1 = ss.calculateResult(examResult2);
		System.out.println("The second one: " + myAnswer1);
		
		String myAnswer3 = ss.calculateResult(examResult3);
		System.out.println("The third one: " + myAnswer3);
	
	}

	public String calculateResult(int[] result) {
		boolean rr = false;
		int[] theResult = new int[3];
	
		for (int i = 0; i < theResult.length; i++) {
			
			if (result[i] > 50) {
				
				System.out.println("pass");
				
				
			} else
				System.out.println("Fail");

		}

		return null;
	}

}
