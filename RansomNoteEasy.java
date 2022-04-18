class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> mmap=new HashMap<>();
       HashMap<Character,Integer> rmap=new HashMap<>();
        if(ransomNote.length()>magazine.length())                 //check if magazinwe has enough letters for ransomnote 
            return false;
        else{
            for(int i=0;i<magazine.length();i++){
                mmap.put(magazine.charAt(i),mmap.getOrDefault(magazine.charAt(i),0)+1);               //store freqwuency count of each character in ransomenote and magazine
            }
              for(int j=0;j<ransomNote.length();j++){
                rmap.put(ransomNote.charAt(j),rmap.getOrDefault(ransomNote.charAt(j),0)+1);
            }
            boolean f=false;
            for(int k=0;k<ransomNote.length();k++){   
               // System.out.println(mmap.containsKey(ransomNote.charAt(k)));
                if(mmap.containsKey(ransomNote.charAt(k))){                                         //check if magazine has ransome note letter if at any stage it doesnt then we cant make the ransome note     
                                                                                
                    if(mmap.get(ransomNote.charAt(k)) >= rmap.get(ransomNote.charAt(k))){         //but if we do have the letter we check if ewe have enough letters 
                        f=true;
                    }
                    else{
                        f=false;
                        break;
                    }
                }else{                        
                    f=false;
                    break;
                }
            }
            return f;
            
        }
    }
}
