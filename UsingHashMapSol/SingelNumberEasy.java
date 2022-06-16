class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> s=new HashSet();
        for(int i=0;i<nums.length;i++){
            if(!s.remove(nums[i]))
                s.add(nums[i]);
            
        }
        
        return s.iterator().next();
    }
}
