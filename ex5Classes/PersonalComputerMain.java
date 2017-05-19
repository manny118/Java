package ex5Classes;

import java.util.Scanner;

public class PersonalComputerMain {

	public static void main(String[] args) {
		
	//	Scanner sc = new Scanner(System.in);
	//	int userInput = sc.nextInt();
		
	//	PersonalComputer pc2  =new PersonalComputer();
		
	//	PersonalComputer pc3  =new PersonalComputer(RAM_4_GB, HARD_DRIVE_3_5, OPERATING_SYSTEM_32_BIT, MONITOR_SIZE_14_INCHES);

	

		
		PersonalComputer pc1  = new PersonalComputer();
		
		pc1.setRAM(4);
		pc1.setOperatingSystem(32);
		
		pc1.setHardDrive(2.5);
		pc1.setMonitorSize(14);
			
		
		
		

		
			//System.out.printf("\n%d%f%d%d", pc1.getRAM() , pc1.getOperatingSystem()  ,  pc1.getHardDrive()   ,pc1.getMonitorSize() , pc1.getCost() );
	//
		//
	
		System.out.print(pc1);		
	
		
	
		
System.out.println("\n\n\n");
			
		PersonalComputer pc6  = new PersonalComputer(4, 3.5, 32, 14);
		
		System.out.println(pc6);
		
		
		
		
	}

}
