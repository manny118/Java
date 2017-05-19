package Ex4Arrays;

import java.util.Scanner;

public class Ex_4B_NamesAndAddresses {

	public static void main(String[] args) {

		String[][] namesAndAddresses = {

				{ "Joe Murphy", "12 Main Street ", "Finglas ", "Dublin 11 " },
				{ "Mary Jones ", "36 Amiens Street ", "Dublin 1", " " },
				{ "Pat Flynn", "26 South Main Street", "Wexford ", "Co. Wexford" } };

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name");
		String name = sc.nextLine();
		sc.close();
		boolean isFound = false;

		for (int i = 0; i < namesAndAddresses.length; i++) {

			if (namesAndAddresses[i][0].equalsIgnoreCase(name)) {
				isFound = true;
				System.out.println("Address for: " + namesAndAddresses[i][0]);

				for (int j = 0; j < namesAndAddresses[i].length; j++) {

					System.out.print(namesAndAddresses[i][j] + " ");
				}

				//
				break;
			}

		//	System.out.println("	inside the loop");
		}

		if (!isFound) {
			System.out.println("Not found");
		}

	}

}
