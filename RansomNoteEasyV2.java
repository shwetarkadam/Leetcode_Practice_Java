class Solution {
    public boolean canConstruct(String r, String m) {
        HashMap<Character,Integer> rmap=new HashMap(); 
        HashMap<Character,Integer> mmap=new HashMap(); 
        for(Character rc:r.toCharArray()){
            rmap.put(rc,rmap.getOrDefault(rc,0)+1);
        }
         for(Character mc:m.toCharArray()){
            mmap.put(mc,mmap.getOrDefault(mc,0)+1);
        }
        
        for(Map.Entry<Character,Integer> e:rmap.entrySet()){
            if(mmap.containsKey(e.getKey())){
                int mval=mmap.get(e.getKey());
                if(!(e.getValue()<=mval))
                    return false;
            }else
                return false;
        }
        return true;
 
    }
}
