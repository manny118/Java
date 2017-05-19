package ex7Classes;

public class EmployeeMain {

	public static void main(String[] args) {
		
		
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		Employee employee3 = new Employee();
		Employee employee4 = new Employee("James Yell"); 
		
		
		Employee employee5 = new Employee("Matt Saw", 23, 12000, 12, 12223);
		
		
		employee1.setEmployeeNumber(12223);
		employee1.setAge(33);
		employee1.setName("Isaac Newton");
		employee1.setSalary(30000);
		employee1.setNoOfSickDays(10);

		employee3.setEmployeeNumber(12227);
		employee3.setAge(33);
		employee3.setName("Flynn Martial");
		employee3.setSalary(56000);
		employee3.setNoOfSickDays(90);
	//	employee3.increaseSalary(50000, 1.04);
		
		
		System.out.println();
		
		System.out.println("\n " + employee1);
		
		System.out.println(" \n " +employee2);
		
		System.out.println(" \n " +employee3);
		
		System.out.println(" \n " +employee4);
		
		System.out.println();
		
		System.out.println(employee5);
		
		
		System.out.println("\n\nThe number of employees is: " +Employee.noOfEmployees);
		
		
		
	}

}
