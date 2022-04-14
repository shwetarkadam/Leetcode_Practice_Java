class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> m1=new HashMap<Integer,Integer> ();
        HashMap<Integer,Integer> m2=new HashMap<Integer,Integer> ();
           List<Integer> l=new ArrayList();
         int c=0;
      for(int i =0;i<nums1.length;i++)
        {
                
                m1.put(nums1[i],m1.getOrDefault(nums1[i],0)+1);
            
        }
    int t=0;
    for(int j=0;j<nums2.length;j++){
        t=m1.getOrDefault(nums2[j],0);
        if(t>0){
            l.add(nums2[j]);
            m1.put(nums2[j],t-1);
        }
    }
        
        
        
        

        return l.stream().mapToInt(i->i).toArray();
    }
    
   
}
