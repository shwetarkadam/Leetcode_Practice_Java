class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=nums[0];//take first element becoz f [-1] testcase instead of 0
        int currentSum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(currentSum<0)
                currentSum=nums[i];
            else
            currentSum=currentSum+nums[i];
            maxSum=Math.max(currentSum,maxSum);
        }
        return maxSum;
    }
}
