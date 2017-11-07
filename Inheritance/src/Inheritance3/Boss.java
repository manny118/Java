package ex11Inheritance;

public class Boss  extends Employee {

	
	
	
	
	private double weeklySalary;
	
	
	public Boss(String firstName, String lastName, double weeklySalary) {
		super(firstName, lastName);
		
		
		this.weeklySalary  =weeklySalary;
	}

	
	public void setWeeklySalary(double weeklySalary){
		this.weeklySalary = weeklySalary ;
	}


	@Override
	public String toString() {
		return "Boss [weeklySalary=" + weeklySalary + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
