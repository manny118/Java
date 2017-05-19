package sheet3ControlFlow;

import java.util.Scanner;

public class Ex_3_12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

	//	double marks;
		System.out.println("Enter the first score");
		int score1 = sc.nextInt();
		System.out.println("Enter the second score");
		int score2 = sc.nextInt();
		System.out.println("Enter the third score");
		int score3 = sc.nextInt();

		Ex_3_12 dd = new Ex_3_12();
		int result = dd.calculateGrade(score1, score2, score3);
		System.out.println(result);
		// System.out.println(("The passScore is 50");
	}

	public int calculateGrade(int score1, int score2, int score3) {

		int passScore = 40;
		if (score1 >= passScore && score2 >= passScore && score3 >= passScore)
			System.out.println("Passed ALL THREE!");

		else if (score1 <= passScore && score2 >= passScore && score3 >= passScore
				|| score1 >= passScore && score2 <= passScore && score3 >= passScore
				|| score1 >= passScore && score2 >= passScore && score3 <= passScore) {
			double average = (score1 + score2 + score3) / 3.0;
			if (average >= 50)
				System.out.println("Passed two. Your average score is: " + average + "\n PASSED!");

			//using ternary/conditional operators
			
		//	String result = (average >= 50) ? "Pass" : "Fail" ;
		//	System.out.println(result);
			
			
		}

		else if (score1 <= passScore && score2 <= passScore && score3 >= passScore
				|| score1 >= passScore && score2 <= passScore && score3 <= passScore
				|| score1 <= passScore && score2 >= passScore && score3 <= passScore) {

			System.out.println("Failed TWO");
		}

		else {
			System.out.println("Failed ");
		}

		return passScore;
	}

}