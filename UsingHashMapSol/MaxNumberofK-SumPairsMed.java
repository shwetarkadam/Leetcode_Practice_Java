class Solution {
    // iterate the array and maintain the map 
    // if k-i is present means the pair is present 
    //  increase the count of the result and decrease the difference element by one and add back to the hashmap
    public int maxOperations(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap();
        List<Integer> l = Arrays.stream(nums).boxed().toList();
        int r=0,count=0,res=0;
       for(int i:nums){
			 count = 0;
			if (map.containsKey(k - i)) {
				count = map.get(k - i);
				if (count > 0) {
					res++;
					map.put(k - i, --count);
				}
				else{
					map.put(i, map.getOrDefault(i,0)+1);
				}
			} else {
				map.put(i, map.getOrDefault(i,0)+1);
			}
        }
        return res;
    }
               
    
}
