class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map=new HashMap(); //use the map to store element and index 
        map.put(numbers[0],0);
        int r=0;
        int res[]=new int[2];
        Arrays.fill(res,-1);
        for(int i=1;i<numbers.length;i++){
            r=target-numbers[i];        //check if remainder exists in the map 
            if(map.containsKey(r))
            {
                res[0]=map.get(r)+1;   //update index by 1 since index start with 0 
                res[1]=i+1;
                return res;
            }
            
            map.put(numbers[i],i);
        }
        
        return res;
    }
}
