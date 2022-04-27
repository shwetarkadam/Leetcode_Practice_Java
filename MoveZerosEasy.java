class Solution {
    public void moveZeroes(int[] nums) {
        int temp=0,k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){    //shoft element if non zero
                temp=nums[k];
                nums[k]=nums[i];
                nums[i]=temp;
                k++;
            }
            
        }
    }
}
