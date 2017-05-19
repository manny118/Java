package Ex4Arrays;

public class Ex_4_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] nums  = {3, 5, 52 , 65 ,34, 356, 34, 23, 23, 54};
		 
		
		Ex_4_7 ss = new Ex_4_7();
		ss.printLargestAndSmallest(nums);
		
		
		
			
	}	
		
		
		
		public void printLargestAndSmallest(int[] nums){
			
			
			
			int largest = nums[0];
			
			for(int n : nums){
				
				if( n > largest){
					largest = n;
					
					
				}
				
			}
	
			
			System.out.println(largest);
			
			
			int smallest  = nums[0];
			
			for(int nn : nums){
				
				if(nn<smallest){
					
					smallest = nn;
				}
				
			
				
			}
			System.out.println(smallest);
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


}
