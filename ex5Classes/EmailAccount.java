package ex5Classes;

public class EmailAccount {
	
	
	
	private String emailAddress;
	private String password;
	private int maxStorageLimit;
	
	
	public static final int maxStorageLimit_100_GB = 100;
	public static final int maxStorageLimit_500_GB = 500;
	public static final int maxStorageLimit_1000_GB = 1000;
	
	
	public EmailAccount(){
		maxStorageLimit = 100;
		
	}
	
	
	
	public EmailAccount(String emailAddress, String password, int maxStorageLimit){
		
		this();
		setPassword(password);
		setMaxStorageLimit(maxStorageLimit);
		setEmailAddress(emailAddress);
		maxStorageLimit = 100;
		

	}
	
	public void setPassword(String password) {
		
		
		if(password.length() <= 20){
			this.password = password;
		}
		else{
			
			System.out.println("Password must be 20 characters or less");
		}
		
		
		
	}
	
	
	public String getPassword() {
	
		
		
		
		return password;
	}





	public void setMaxStorageLimit(int maxStorageLimit) {
		
		
		
		switch(maxStorageLimit){
		
		case maxStorageLimit_1000_GB:
		case maxStorageLimit_100_GB:
		case maxStorageLimit_500_GB:
			this.maxStorageLimit = maxStorageLimit;
			break;
		default:
			System.out.println("Storage size is unavailable");
		break;
		}
		
		
		
		
	}

	
	public int getMaxStorageLimit() {
		
		
		
		
		return maxStorageLimit;
	}

	
	
	public void setEmailAddress(String emailAddress) {
		
		
		if(emailAddress.contains("@") && emailAddress.contains(".") ){
			
			if(emailAddress.indexOf('@') < emailAddress.lastIndexOf('.')){
				this.emailAddress = emailAddress;
			}
			
		}
		
		
	/*	else
		{
		System.out.println("Emailaddress is invalid");	
			
		}*/
		
	/*	for(int i=0; i<emailAddress.length(); i++){
			if(emailAddress.indexOf("@") < emailAddress.indexOf(".")){
				this.emailAddress = emailAddress;
			}
			
			
		}
		*/
		
		
		
		
		
	}

	
	public String getEmailAddress(){
		
		return emailAddress;
	}
	
	
	@Override
	public String toString(){
		return "EmailAddress: " +emailAddress + "\nPassword: "+ password  +  "\nMaxStorageLimit: " + maxStorageLimit;
	}
	


}
