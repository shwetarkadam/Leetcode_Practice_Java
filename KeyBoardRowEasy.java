
import java.util.*;
class Solution {
     HashMap<String,Integer> map=new HashMap<String,Integer>();
    Solution(){
        map.put("qwertyuiopQWERTYUIOP",0);
        map.put("asdfghjklASDFGHJKL",1);
        map.put("zxcvbnmZXCVBNM",2);
    }
    public String[] findWords(String[] words) {
       
        List<String>result=new ArrayList<String>();
        boolean res=true;
       for(String word:words){
          if(check(word))
            result.add(word);
        }
        return result.toArray(new String[0]);
    }
    
    public boolean check(String word){
        int setRow=checkKey(word.charAt(0)); //set the row and check if the same row is being used in later stages 
       for(int i=1;i<word.length();i++){
           if(!(checkKey(word.charAt(i))==setRow))       //check row and if not return false 
               return false;
       }
        return true;
        }
    
    public int checkKey(Character c){
        for(String key:map.keySet()){
      if(key.contains(c.toString()))
          return map.get(key);
                      
        }
        return 4;//random value
    }
      
    
}
