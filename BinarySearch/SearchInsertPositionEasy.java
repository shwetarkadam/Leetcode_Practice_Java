class Solution {
    public int searchInsert(int[] nums, int target) {
        
 for(int i=0;i<nums.length;i++){
     if(nums[i]==target || nums[i]>target)       //check the tatgert and return the index the one behind 
         return i;
     
 }
        
        return nums.length;   //if none found return length
}}
