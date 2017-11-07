
import java.util.function.Predicate;



public class Lambdas implements Secret{
    
    


    public String magic(double df) {
      
      return "" + df;  
    }
    
     public static void main(String[] args){
    
        //magic( d  -> {   return "hey";  }   ) ;
        
        Predicate<Integer> pp = new Predicte();
    }
}
@FunctionalInterface
interface Secret{
    
    String magic(double d);

}





