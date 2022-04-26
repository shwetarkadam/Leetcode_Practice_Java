class Solution {
    public int[] sortedSquares(int[] nums) {
        List<Integer> l=Arrays.stream(nums).boxed().toList(); //convert array to list
        
    nums=l.stream()
           .mapToInt(e->e*e)   //stream and map the square to int and return the array and sort it
         .toArray();
     
        
        Arrays.sort(nums);
           return nums;
    }
}
