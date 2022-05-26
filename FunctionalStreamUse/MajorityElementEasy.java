class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int n=nums.length;
        final Integer r=map.entrySet().stream()
            .filter(e->e.getValue()>n/2)
            .map(Map.Entry::getKey)
            .findFirst()
             .orElse(null);
        return r;
    }
}
