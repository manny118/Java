package ex5Classes;

public class GymMembershipMain {

	public static void main(String[] args) {
		
		GymMembership gymMembership = new GymMembership();
		gymMembership.setMembershipCost(23452);
	//	gymMembership.setMembershipNumber(122220);
	//	gymMembership.setPaymentFrequency("MONTHLY");
		//gymMembership.membershipNo();
		
		
		System.out.println("The details: "+ gymMembership.getMembershipCost()+ " "+gymMembership.getMembershipNumber()+ " "+gymMembership.getPaymentFrequency()+ " "+ gymMembership.membershipNo);
		
	
	//	if/(){	}
			// gymMembership.membershipNo++;
			
	//System.out.println( gymMembership.membershipNo);
		
		GymMembership gymMembership1 = new GymMembership();
		gymMembership1.setMembershipCost(52);
	//	gymMembership1.setMembershipNumber(12222);
	//	gymMembership1.setPaymentFrequency("YEARLY");
		gymMembership1.setName("Ammy");
		//gymMembership.membershipNo();
		System.out.println("------------");
		
System.out.println(gymMembership1);
		System.out.println("The details: "+ gymMembership1.getMembershipCost()+ " "+gymMembership1.getMembershipNumber()+ " "+gymMembership1.getPaymentFrequency()+ " "+ gymMembership1.membershipNo);
		
		
		System.out.println("------------");
		
		GymMembership gg = new GymMembership(GymMembership.YEARLY, "maANNY");
		
		System.out.println(gg);
		
	
	}

}
