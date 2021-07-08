class Solution {
    int [][]dp;
    public int findLength(int[] nums1, int[] nums2) {
        dp=new int [nums1.length+1][nums2.length+1];
        for(int []r:dp){
            Arrays.fill(r,0);
        }int max_len=0;
      for(int i = 1; i <= nums1.length; ++i) {
            for(int j = 1; j <=nums2.length; ++j) {
                if(nums1[i-1] == nums2[j-1]) {
                    dp[i][j] = dp[i-1][j-1]+1;
                    if(dp[i][j] > max_len) max_len = dp[i][j];
                }
            }
        }
        return max_len;
    }
}
    
