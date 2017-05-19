package ex7Classes;

public class Employee {

	private String name;
	private int age;
	private int salary;
	private int no_Of_Sick_Days;
	private int employeeNumber;
	public static int noOfEmployees;

	public Employee() {

		noOfEmployees++;
	}

	public Employee(String name) {

		this();
		setName(name);
	

	}

	public Employee(String name, int age, int salary, int no_Of_Sick_Days, int employeeNumber) {

		this();	
		setName(name);
		setAge(age);
		setSalary(salary);
		setNoOfSickDays(no_Of_Sick_Days);
		setEmployeeNumber(employeeNumber);
		//this(String);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSalary(int salary) {
		this.salary = salary;

	}

	public void setNoOfSickDays(int no_Of_Sick_Days) {
		this.no_Of_Sick_Days = no_Of_Sick_Days;

	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;

	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getSalary() {
		return salary;
	}

	public int getNoOfSickDays() {
		return no_Of_Sick_Days;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public double increaseSalary(double salary, double percentageIncrease){
		
		salary = salary * percentageIncrease;
		return salary;
	}
	
	
	public String toString() {
		return String.format("EmployeeNo: %d \n Name: %s \n Age: %d \n Number of sick days: %d \n Salary: %d",
				employeeNumber, name, age, no_Of_Sick_Days, salary);
		// return "The name of the employee is:" + name + "and he/she is " + age
		// + ". He was sick for" + no_Of_Sick_Days ;

	}

}
