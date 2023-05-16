class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int j=0;
        double currMaxAvg=Integer.MIN_VALUE,avg=0.00,sum=0.00;
        for(int i=0;i<nums.length;i++)
        {
             sum+=nums[i];
            
             if(i>=(k-1))
             {
                 avg=sum/k;
                 System.out.println(avg);
                 currMaxAvg=Math.max(avg,currMaxAvg);
                 sum=sum-nums[j];
      
                 j++;
             }
        }
        return currMaxAvg;
    }
}
