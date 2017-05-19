package sheet3ControlFlow;
public class Ex_3_13 {
   public static void main(String[] args){
	
		Ex_3_13 myClass = new Ex_3_13();
     
        int num = myClass.diceGame();
        System.out.println(num);

	//	int myResult = myClass.totalTwoDice();
	//	System.out.println(myResult);
		
		
    }
   

//////QUESTION 14   
	public int diceGame()
    {
		int points	;
	
		int dice3 = (int)(Math.random()*6) + 1;
	
			
		int dice2 = (int)(Math.random()*6) + 1;

		if(dice3 == 6 || dice2 == 6)
                    points = dice3 + dice2;
		
		else if(dice3 == 3 || dice2 == 3)
			points = (dice3 * dice2) + 10;
		
		else if(dice3 == 3 && dice2 == 3)
			points = (dice3 * dice2) + 20;
		
		else if(dice3 == 5 || dice2 == 5)
			points = (dice3 * dice2)- 4;
		
		else if(dice3 == 5 && dice2 == 5)
			points = (dice3 * dice2)- 8;
		
		else
                    points = dice3 * dice2;

	return points;
    } 
	
	
	
	
	/////////QUESTION 13
	public int totalTwoDice(){
		
		int dice1 = (int)(Math.random() * 6) + 1;
		
		int dice2 = (int)(Math.random()*6) + 1;
		
		int total = dice1 + dice2;
	
	
	return total;

	}
	
	
	
	
}
