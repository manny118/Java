package ex8Classes;

public class BankAccountMain {

	public static void main(String[] args) {


		
/*		BankAccount bb1 = new BankAccount();
		
		bb1.setAccountNumber(122);
		bb1.addInterestPercentage(4);
		
		System.out.println(bb1);
		
		System.out.println();
		*/
		BankAccount bb2 = new BankAccount();
		
		
		BankAccount bb3 = new BankAccount();
		
		BankAccount bb4 = new BankAccount();
		
		bb4.depositMoney(40_000);
		
		
		
		System.out.println(bb4);
	//	System.out.println(BankAccount.countNoOfAccounts);
	//	System.out.println("The balance is: ");
		
/*		 bb4.checkBalance();
		 
		 bb4.withdrawMoney(2_000);
		 
		 
		 
		 bb4.depositMoney(3000 );
		 bb4.depositMoney(5000 );
		bb4.withdrawMoney(47000);
	
	*/
	
		
		
		
		
		bb4.withdrawAllMoney();
		
		bb4.depositMoney(100);
		bb4.withdrawMoney(10);		
		bb4.withdrawMoney(100);
		
		
		bb4.checkBalance();
		bb4.withdrawAllMoney();
		bb4.checkBalance();
		bb4.depositMoney(1000);
		
		bb4.addInterestPercentage(10);
		
		BankAccount bb5 = new BankAccount();
		
		
	
	}

}
