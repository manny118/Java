//Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
class Solution {
    public List<String> letterCombinations(String digits) {
        
        List<String> comb = new ArrayList<>();
        
        int num[] = new int[]{2,3,4,5,6,7,8,9};
        char[][] ch = new char[][]{
            {'a', 'b', 'c'},  
            {'d', 'e', 'f'}, 
            {'g', 'h', 'i'}, 
            {'j', 'k', 'l'},
            {'m', 'n', 'o'},
            {'p', 'q', 'r', 's'},
            {'t', 'u', 'v'},
            { 'w', 'x', 'y', 'z'},
        };
        
        char s1, s2, s3,s4;
        int a1, a2, a3, ind1, ind2, ind3,ind4,a4;
        
        if(digits.length() != 0){
            s1 = digits.charAt(0);
            a1 = Character.getNumericValue(s1);
            ind1 = returnIndex(a1);
            
            System.out.println(ind1);
            
            if(digits.length() == 1){
                for(int i=0; i<ch[ind1].length; i++){
                    String lete = ch[ind1][i] + "";
                    comb.add(lete);
                }
            }
            
            
            if(digits.length() >=2){
                
               
                s2 = digits.charAt(1);
                a2 = Character.getNumericValue(s2);                
                ind2 = returnIndex(a2);
                System.out.println(ind2);
                
                char cc1[] = ch[ind1];
                char cc2[] = ch[ind2];
                
                if(digits.length() == 2){
                    for(int i=0; i<cc1.length; i++){

                        for(int j=0; j<cc2.length; j++){

                            String lete = cc1[i] + "" + cc2[j] ;
                            comb.add(lete);
            
                        }

                    } 
                }
             
                if(digits.length() >=3){
                
                    s3 = digits.charAt(2);
                    a3 = Character.getNumericValue(s3);               
                    ind3 = returnIndex(a3);
                    System.out.println(ind3);
                              
                    char cc3[] = ch[ind3];
                    
                    if(digits.length() == 3){
                        for(int i=0; i<cc1.length; i++){

                            for(int j=0; j<cc2.length; j++){
                        
                                for(int k=0; k<cc3.length; k++){
                    
                                    String lete = cc1[i] + "" + cc2[j] + cc3[k];
                                    comb.add(lete);
             
                                }
                            }
                        }
                    }
                    if(digits.length() == 4){
                    s4= digits.charAt(3);
                    a4= Character.getNumericValue(s4);               
                    ind4= returnIndex(a4);
                    System.out.println(ind4);
                              
                    char cc4[] = ch[ind4];
                    
                    
                    
                    for(int i=0; i<cc1.length; i++){

                            for(int j=0; j<cc2.length; j++){
                        
                                for(int k=0; k<cc3.length; k++){
                                    
                                    for(int l=0; l<cc4.length; l++){
                                        String lete = cc1[i] + "" + cc2[j] + cc3[k] + cc4[l];
                                        comb.add(lete);
                                    }
                                    
             
                                }
                            }
                        }
                    
                }
                    
                    
                }
                
                
                
        
            }
            
            
            
        }
        
        return comb;
    }
    
    
    public static int returnIndex(int a){
        int val = 0;
        switch(a){
          case 2:
            val = 0;
            break;
          case 3:
            val = 1;
            break;
          case 4:
            val = 2;
            break;
          case 5:
            val = 3;
            break;
          case 6:
            val = 4;
            break;
          case 7:
            val = 5;
            break;
          case 8:
            val = 6;
            break;
          case 9:
            val = 7;
            break;
        }
    return val;
  }

    
    
}