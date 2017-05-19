package Ex4Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Ex_4_4{

	


  public static void main(String[] args){
       
 
           
        Scanner sc = new Scanner(System.in);
        
        double[] num1 = new double[10];
       
        for(int i=0; i<num1.length; i++){
           System.out.printf("populate array1 element[%d] :", i);
           num1[i] = sc.nextDouble();
          
        }
      
        Ex_4_4 vv = new Ex_4_4();
        vv.calculateInflation(num1);
    
    } 
       
    public void calculateInflation(double[] num1 ){
      double  inflationRate[] = new double[10];
       
        for(int i =0; i<inflationRate.length; i++ ){
                 
            inflationRate[i] =  num1[i] * 1.04 ;
           
        }  
        System.out.println("\n \n");
        System.out.printf("%-10s%10s\n" , "oldPrice", "newPrice");
        for(int i =0; i<num1.length; i++ ){
      
        	System.out.printf("%-10.2f%-10.2f",num1[i], inflationRate[i]);
             System.out.println();
        }
            
   }

      
 }  