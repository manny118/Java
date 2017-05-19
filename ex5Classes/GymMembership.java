package ex5Classes;
/*
 * AUTHOR: EMMANUEL AKINRINTOYO
 * DATE: 12/05/2017
 * */
public class GymMembership {

	
	private String name;
	private int membershipNumber;
	private double membershipCost;
	private int paymentFrequency;
	static  int  membershipNo = 9897;
	
	public static final int PAY_AS_YOU_GO = 1; 
	public static final int MONTHLY = 2; 
	public static final int YEARLY= 3; 
	
	
	
	public GymMembership(){	
		membershipNumber =		membershipNo++;
		
	paymentFrequency = MONTHLY;
	
	
	//membershipNumber++;
	
	}
	
	
	public GymMembership(int paymentFrequency, String name){	
		this();
		this.name = name;
		this.paymentFrequency = paymentFrequency;
		//membershipNo;
	}
		
	
	public String getName(){
		
		return name;
	
	}
	
	
	public int getMembershipNumber(){	
		
		return membershipNumber;
	}
		
	public double getMembershipCost(){
		return membershipCost;
	}
	
	public int getPaymentFrequency(){
		
		return paymentFrequency;
	}
	
	public void setName(String name){
		this.name = name;
	}

	
	/*public void setMembershipNumber(int membershipNumber){
		this.membershipNumber = membershipNumber;
	}*/
	public void  setMembershipCost( double membershipCost){
		this.membershipCost = membershipCost;
	}
	public void setPaymentFrequency( int paymentFrequency){
		
		switch(paymentFrequency){
		
		case MONTHLY:
		case PAY_AS_YOU_GO:
		case YEARLY:
			this.paymentFrequency = paymentFrequency;
		break;
		
		default:
			System.out.println("Invalid payment frequency");
		this.paymentFrequency = paymentFrequency;
		break;
		
		
	}
}
	
	
	public double calculateCost(){
		double yearly = 350;
		switch(paymentFrequency){
		case YEARLY:
			membershipCost = yearly / 12;
		case PAY_AS_YOU_GO:
			membershipCost = yearly / 50;
		
		default:
			membershipCost = yearly;
		
		}
		
		return membershipCost;
	}
	
	
	
	public String getPaymentFrequencyAsString(){
		
		switch(paymentFrequency){
		case YEARLY:
			return "Yearly";
		case PAY_AS_YOU_GO:
			return "Pay as you go";
		default:
			return "Monthly";
		
		}
		
	}
	
	
	public String toString(){
		return "Name: " + name 
				+"\nPayment frequency: " 
				+ getPaymentFrequencyAsString() 			
			+ 	String.format("\n Cost is: %.2f", calculateCost())				 
				+ "\nMembershipNO: " 
				+ membershipNumber  ;
		
	}
	
	
	
	
}
