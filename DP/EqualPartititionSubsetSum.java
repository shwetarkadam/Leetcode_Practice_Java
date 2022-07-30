class Solution {
    boolean t[][];
    
    public boolean canPartition(int[] nums) {
        int sum=Arrays.stream(nums).sum();//if sum is odd we cant create the subset and if even then half of sum is one of the subset value
       
        if(sum%2!=0)
            return false;
        else
            return subsetSum(nums,sum/2,nums.length);
    }
    
    public boolean subsetSum(int []nums,int sum,int n){
       t=new boolean[nums.length+1][sum+1];
         Arrays.stream(t).forEach(a -> Arrays.fill(a, false));
    
    
    for(int k=0;k<nums.length+1;k++){
        t[k][0]=true;
    }
    
     for(int i=1;i<nums.length+1;i++){
         for(int j=1;j<sum+1;j++){
           if(nums[i-1]<=j)
           t[i][j]=(t[i-1][j-nums[i-1]])||(t[i-1][j]);
           else
            t[i][j]=t[i-1][j];
         }
     }
     return t[nums.length][sum];
    }
}
