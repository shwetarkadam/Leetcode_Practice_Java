class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        int r=0;
        int []res=new int[2];
        for(int i=0;i<nums.length;i++){
            r=target-nums[i];
            if(map.containsValue(r)){
                res[0]=i;
                final Integer r1=r;
               Integer t=map.entrySet().stream()
  .filter(e -> e.getValue().equals(r1))
  .map(Map.Entry::getKey)
  .findFirst()
  .orElse(null);
             //   System.out.println(t);
                res[1]=t;
                return res;
                
            }else{
                map.put(i,nums[i]);
            }
        }
        return res;
    }
}                                              
