class Solution {
    public int longestkSubstr(String s, int k) {
 Map<Character,Integer> map=new HashMap<Character,Integer>();
    
    int i=0,j=0;
    int max=-1;
    while(j<s.length()){
      //  System.out.println("map size="+map.size());
        map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
        
        
        
       if(map.size()<k)
        j++;
        
        else if(map.size()==k){
          //  System.out.println("j-i+1"+(j-i+1));
            max=Math.max(max,j-i+1);
            j++;
        }
        else if(map.size()>k){
            while(map.size()>k){
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
