class Solution {
    public int[] twoSum(int[] nums, int target) {
    List<Integer> l=new ArrayList(Arrays.asList(nums));
        for(int j=0;j<nums.length;j++)
         l.add(j,nums[j]);
      
        
        int r=0;
        int res[]=new int [2];
        for(int i=0;i<nums.length;i++){
            r=target-nums[i];

            if(l.contains(r) && l.indexOf(r)!=i ){
                res[0]=i;
                res[1]=l.indexOf(r);

            }
        }
        return res;
    }
}
