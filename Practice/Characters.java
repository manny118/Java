public class DiffChars {
    
    public static void main(String[] args){
        
        boolean oneAway = oneAway("pale", "pae");
        System.out.println(oneAway);

    } 
    
    static boolean isDiffChar(String word){
        // 'n', 'a', 'm', 'e'
        char[] letters = word.toCharArray();
        
        for(int i=0; i<letters.length; i++){
            
            for(int j=i+1; j<letters.length; j++){
                
                if(letters[i] == letters[j]){
                    
                    System.out.println("Similar letters");
                    return true;
                }                
            }            
        }                 
        return false;
    }
    
    static boolean isPermutation(String word1, String word2){
        char[] c1 = word1.toCharArray();
        char[] c2 = word2.toCharArray();
        int counter = 0; 
        
        for(int i=0; i<c1.length; i++){
            
            if((c1.length == c2.length)){
                
                for(int j=c2.length-1; j>=0; j--){
                
                    if( (c1[i] == c2[j])){
                        System.out.println(counter);
                    counter++;
                    }
                }
            }
        }   
        
        if(counter == c1.length){
                    
            System.out.println("Perm");
                
        }
        
        return false ;
    }    
    
    
    static boolean sameWordOpp(String word1, String word2){
        
        char[] one = word1.toCharArray();
        char[] two = word2.toCharArray();
        int counter = 0;
        
        if(one.length == two.length){
            
            for(int i=0; i<one.length; i++){
            
                for(int j=two.length-1; j>=0; j--){
                    
                    if(one[i] == two[j]){
                        counter++;
                    }                    
                }
            }    
            if(counter == one.length){
                System.out.println("P");
            }
        }
            
        return false;
    }
    
    static boolean oneAway(String word, String edit){
        
        int counter = 0;
        char[] one = word.toCharArray();
        char[] two = edit.toCharArray();
        
        if(word.length() != edit.length() + 1){                        
            return false;
        }
        
        else{
            for(int i=0; i<one.length; i++){
                
                for(int j=two.length-1; j>=0; j--){
                    if(one[i] == two[j]){
                    counter++;
                        System.out.println(counter);
                    }
                    
                }
            }            
        }
        return true;
    }
     
}