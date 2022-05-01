class Solution {
    public int lengthOfLongestSubstring(String s) {

        if(s.equals(""))
            return 0;
 Map<Character,Integer> map=new HashMap<Character,Integer>();
    
    int i=0,j=0;
    int max=-1;
        
    while(j<s.length()){
      //  System.out.println("map size="+map.size());
        map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
        
        
        
      // if(map.size()<(j-i+1))
      //  j++;
        //dry run and understand why the condition reversed
         if(map.size()==(j-i+1)){
          //  System.out.println("j-i+1"+(j-i+1));
            max=Math.max(max,j-i+1);
            j++;
        }
        else if(map.size()<(j-i+1)){
            while(map.size()<(j-i+1)){
                     map.put(s.charAt(i),map.get(s.charAt(i))-1);
                  if(map.get(s.charAt(i))==0)
                    {
                       map.remove(s.charAt(i));
                    }
                    i++;
        }
        j++;
        }
    }
    
    return max;
    }
    
    
}
