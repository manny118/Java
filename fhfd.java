import java.util.Calendar;
import java.util.GregorianCalendar;

public class fhfd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int Year, Month;
	
		       // Assign starting values
		
		       Year = 2010;
		 
		       Month = 0;
		 
		       // Call method to print the month for the values
		 
		       printCalendar(Year, Month);
		 
		    }
		 
		  
		 
		    public static void printCalendar(int year, int month) {
		 
		       // Declare variables
		 
		       int leap_year;
		 
		       int dayOfWeek=1;
		 
		       String space = "   ";
		 
		
		       String[] monthName = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		 
		       int[] calDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
		       Calendar cal = new GregorianCalendar(year, month, 1);
		
		       System.out.println("Year: " + year + space + "Month: " + monthName[month] + "\n");
		 
		       System.out.println("S   M   T   W   T   F   S\n");
		       // Following loop will find out where to print the first day of the month
		 
		       // dayCounter represents current day of the month and dayOfWeek represents the day of the
		 
		       // week where 1 is Sunday
		 
		       for (int dayCounter=1; dayCounter <= calDays[month]; dayCounter++) {
		 
		          if (dayCounter > 9) {

		             // This controls the printing of the spaces between the days so it's pretty
		 
		             space = "  ";
		 
		          }
		 
		          // This if will find out print out spaces until the day the first of the
		 
		          // month falls on
		
		          if (dayCounter == 1) {
		
		             while (dayOfWeek != cal.get(Calendar.DAY_OF_WEEK)) {
	
		                System.out.print(space + " ");
		
		                dayOfWeek++;
		
		             }
	
		             // Now we have found the right place to print the first day of the month
		
		             System.out.print(dayCounter + space);
	
		             dayOfWeek++;
	
		          } else {
		
		             if (dayOfWeek == 8) {
		
		                System.out.print("\n" + dayCounter + space);
		
		                dayOfWeek=2;
		 
		             } else {
		 		                // this prints out the current day number and increments j
	
		                System.out.print(dayCounter + space);

		                dayOfWeek++;
		
		             }
		
		          }
		
		       }
	
		       System.out.println("\n");

	}

}
