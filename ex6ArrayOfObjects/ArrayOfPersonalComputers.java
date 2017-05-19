package ex6ArrayOfObjects;

public class ArrayOfPersonalComputers {

	public static void main(String[] args) {

		
		PersonalComputer pc1 = new PersonalComputer();
		PersonalComputer pc2 = new PersonalComputer();
		PersonalComputer pc3 = new PersonalComputer();
		
		
		PersonalComputer[] myPC = new PersonalComputer[3];
		myPC[0] = pc1;
		myPC[1] = pc2;
		myPC[2] = pc3;
		
		
		
		
		pc1.setRAM(4);
		pc1.setOperatingSystem(32);
		pc1.setMonitorSize(14);
		pc1.setHardDrive(2.5);
		
		pc2.setRAM(8);
		pc2.setOperatingSystem(64);
		pc2.setMonitorSize(22);
		pc2.setHardDrive(3.5);
		
		pc3.setRAM(4);
		pc3.setOperatingSystem(32);
		pc3.setMonitorSize(22);
		pc3.setHardDrive(2.5);
		

		
		ArrayOfPersonalComputers acc = new ArrayOfPersonalComputers();
		acc.printArray(myPC);
		
		
	}

	
	public void printArray(Object[] pc){
		
		for(int i =0; i<pc.length; i++){
			
		}
		
		for(int j=0; j<pc.length; j++){
			System.out.println(pc[j]);
		}
		
		
	}
	
	
	
	
	
}
