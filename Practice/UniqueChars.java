//A program that checks if the characters in a string are unique
public class UniqueCharacters {
    public static void main(String[] args) {
    
        uniqueChars("sayhelloworld");
        
    }
    
    public static void uniqueChars(String word){
        
        char[] c = word.toCharArray();
        int counter = 0;
        char newC;
        boolean isUnique = true;
        
        for(int i=0; i<c.length; i++){
            
             newC= c[i];
            
            for(int j=i+1;j<c.length;j++){
                
                if(newC == c[j]){
                    System.out.print("Not unique chars ");
                    isUnique = false;
                    return;
                }
            }
        }
        
        if(isUnique)
            System.out.println("Unique chars");
        
    }
    
}
