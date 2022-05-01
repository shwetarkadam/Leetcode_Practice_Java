class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())
            return false;
        
        Map<Character,Integer> map=new HashMap();
          
    int i=0,j=0;
  
        
        for(int p=0;p<s1.length();p++){
          map.put(s1.charAt(p),map.getOrDefault(s1.charAt(p),0)+1);
        
        
        }
        
     int   k=s1.length();  
        int max=map.size();
    while(j<s2.length()){
      //  System.out.println("map size="+map.size());
        if(map.containsKey(s2.charAt(j))){
       map.put(s2.charAt(j),map.getOrDefault(s2.charAt(j),0)-1);
          if(map.get(s2.charAt(j)) == 0) max--;
            
        }
    
       if(j-i+1 <k)
        j++;
        
        else if(j-i+1 ==k){  //check window size is equal to s1.length 
          //  System.out.println("j-i+1"+(j-i+1));
          //  max=Math.max(max,j-i+1);
         //   j++;
            if(max==0)
                return true;
            
            
            if(map.containsKey(s2.charAt(i))){
                 map.put(s2.charAt(i), map.getOrDefault(s2.charAt(i), 0) + 1);
                if(map.get(s2.charAt(i)) == 1) max++;
            }
            j++;
            i++;
        }
     
    
        }
    
    
    return false;
    }
    
}
