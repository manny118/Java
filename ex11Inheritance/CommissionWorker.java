package ex11Inheritance;

public class CommissionWorker extends Employee {

	private double salary;
	private double commission;
	private int qtyOfItemsSold;

	
	public CommissionWorker(String firstName, String lastName, double salary, double commission, int qtyOfItemsSold) {
		super(firstName, lastName);
		this.commission = commission;
		this.salary = salary;
		this.qtyOfItemsSold = qtyOfItemsSold;
		
		
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setQtyOfItems(int qtyOfItemsSold) {
		this.qtyOfItemsSold = qtyOfItemsSold;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	public double getCommission() {
		return commission;
	}

	public int qtyOfItemsSold() {
		return qtyOfItemsSold;
	}

	@Override
	public String toString() {
		return "CommissionWorker [salary=" + salary + ", commission=" + commission + ", qtyOfItemsSold="
				+ qtyOfItemsSold + "]";
	}

	public double getSalary() {
		return salary;
	}

}
