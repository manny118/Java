package ex5Classes;

public class PersonalComputer {

	private int RAM;
	private double hardDrive;
	private int operatingSystem;
	private int monitorSize;
//	private double COST;

	public static final int RAM_4_GB = 4;
	public static final int RAM_8_GB = 8;
	public static final int RAM_16_GB = 16;

	public static final double HARD_DRIVE_2_5 = 2.5d;
	public static final double HARD_DRIVE_3_5 = 3.5d;

	public static final int OPERATING_SYSTEM_32_BIT = 32;
	public static final int OPERATING_SYSTEM_64_BIT = 64;

	public static final int MONITOR_SIZE_14_INCHES = 14;
	public static final int MONITOR_SIZE_22_INCHES = 22;
	

	public PersonalComputer() {
	
			
	}

	public PersonalComputer(int RAM, double hardDrive, int operatingSystem, int monitorSize) {
	
			
		setRAM(RAM);
		setHardDrive(hardDrive);
		setOperatingSystem(operatingSystem);
		setMonitorSize(monitorSize);

			}

	
	
	public void setRAM(int RAM) {

		if (RAM == 4) {

			this.RAM = RAM_4_GB;
		} 
		else if (RAM == 8) {

			this.RAM = RAM_8_GB;
		}
		else if (RAM == 16) {
			this.RAM = RAM_16_GB;
		} 
		else{
			
			System.out.println("RAM size is unavialable");
		}
		
		
		//this.RAM = RAM;
	}

	public void setHardDrive(double hardDrive) {
	//this.hardDrive = hardDrive;
	if (hardDrive == 2.5) {

		this.hardDrive = HARD_DRIVE_2_5;
	} 
	else if (hardDrive == 3.5) {
		this.hardDrive = HARD_DRIVE_3_5;
	} 
	
	else{
		System.out.println("HARD_DRIVE size is unavialable");
	}
		
	
	
	
	}
	

	public void setOperatingSystem(int operatingSystem) {
		if (operatingSystem == 32) {

			this.operatingSystem = OPERATING_SYSTEM_32_BIT;
		}
		else if (operatingSystem == 64) {
			this.operatingSystem = OPERATING_SYSTEM_64_BIT;
		}
		else{
			System.out.println("OPERATING_SYSTEM size is unavialable");
		}
		
		//this.operatingSystem = operatingSystem;
		
	}

	public void setMonitorSize(int monitorSize) {

		if (monitorSize == 14) {

			this.monitorSize = MONITOR_SIZE_14_INCHES;
		}
		else if (monitorSize == 22) {
			monitorSize = MONITOR_SIZE_22_INCHES;
		}
		else{
			this.monitorSize = 0;
			System.out.println("MONITOR_SIZE size is unavialable");
		}
		//
		
	}

	public int getRAM() {

		return RAM;
	}

	public double getHardDrive() {
		return hardDrive;
	}

	public int getOperatingSystem() {
		return operatingSystem;
	}

	public int getMonitorSize() {
		return monitorSize;
	}

	public double getCost() {

		double total = RAM * hardDrive * operatingSystem * monitorSize;
		
		
		return total;

	}

	public String toString() {

		return String.format("The RAM is %d with an hardDrive of %.2f, an operating system of %d and  a monitor size %d is a total of %.2f", RAM, hardDrive, operatingSystem,monitorSize, getCost() );
				
			
//
	
	}

}
