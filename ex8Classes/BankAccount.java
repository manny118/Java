package ex8Classes;

public class BankAccount {

	private String name;

	private String address;


	private int accountNumber;


	private double balance;

	public final static double currentInterestRate = 1.05;

	static int countNoOfAccounts;

	static int accountNo = 1000031;







	public BankAccount(){

		countNoOfAccounts++;
		accountNo++;
	}


	public BankAccount(String name, String address, int accountNumber){
		this();
		this.name = name;
		this.address = address;
		this.accountNumber = accountNumber;
		
	}


	public void setName(String name){
		this.name = name;
	}


	public void setAddress(String address){
		this.address = address;
	}


	public void setAccountNumber(int accountNumber){


		this.accountNumber = accountNumber;
	}


	public void setBalance(double balance){
		
		
		this.balance = balance;

	}


	public String getName(){
		
		return name;
		
	}
	
	
	public String getAddress(){
		
		return address;
		
	}
	
	public int getAccountNumber (){
		
		return accountNumber;
		
	}
	
	public double getBalance(){
	
		return balance;
		
	}






	public void depositMoney(int deposit){

		if(deposit > 0){
			balance += deposit;
			System.out.println("Your new balance is: " + balance);
		}
		else{
			System.out.println("You cannot deposit" + deposit);
		}


	}


	public void withdrawMoney(int withdraw){

		if(balance <= 0){



			System.out.println("You cannot make any withdrawals! Your balance is: " + balance);
			withdraw = 0;

		}

		else if(withdraw > balance){
			System.out.println("\nSorry, you can only withdraw " + balance);	


		}

		else {

			balance = balance - withdraw;
			System.out.println("\nYour new balance is: " + balance);
		}

	}



	public void checkBalance(){

		System.out.println("\nYour balance is: " + balance);

	}



	public void withdrawAllMoney(){
	
		System.out.println("\nYou have withdrawn "+ balance);
		balance = 0;
		System.out.println("You new balance is: "  + balance);
	}

	public void addInterestPercentage(int interest){

		balance  +=  ( interest * 0.01 * balance)     ;
	
		System.out.printf("%.2f", balance);
		
	}






	public String toString(){
		return "Name: " + name + "\nAddress: " + address +  "\nAcctNO: " + accountNo + "\nBalance: " + balance;}








	
	
}
