
public class NewClass {
    
    public static void main(){
    
      
    
      
               
    }
     public float parseFloat( String s ){
     float f = 0.0f;      // 1
     try{
          f = Float.valueOf( s ).floatValue();    // 2
          return f ;      // 3
     }
     catch(NumberFormatException nfe){
        f = Float.NaN ;    // 4
       return f;     // 5
     }
     finally {
         return f;     // 6
     }
   //  return f ;    // 7

     }
     
     
     
}
class A{
   A() {  print();   }
   void print() { System.out.println("A"); }
}
class B extends A{
   int i =   4;
   public static void main(String[] args){
      A a = new B();
      a.print();
   }
   void print() { System.out.println(i); }
}