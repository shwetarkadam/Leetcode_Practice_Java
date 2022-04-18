class Solution {
//another approach could be sort the string and compare char by char if not present return false;
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> smap=new HashMap<>();
        Map<Character,Integer> tmap=new HashMap<>();
        smap=populateMap(smap,s);
        tmap=populateMap(tmap,t);
        if(smap.equals(tmap))
            return true;
        else 
            return false;
       
    }
    
  public Map<Character,Integer>  populateMap(Map<Character,Integer> mmap,String magazine){
          for(int i=0;i<magazine.length();i++){
                mmap.put(magazine.charAt(i),mmap.getOrDefault(magazine.charAt(i),0)+1);              
            }
        return mmap;
    }
}
