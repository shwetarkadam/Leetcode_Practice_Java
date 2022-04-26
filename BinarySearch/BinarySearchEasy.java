class Solution {
    public int search(int[] nums, int target) {
    return binarySearch(nums,target,0,nums.length-1);
    }
    public int binarySearch(int []nums,int target,int l,int r){
        if(r>=l){      //make sure r and l dont cross each other 
        int mid=(l+r)/2;
        
        if(nums[mid]==target)
            return mid;
        
        else if(nums[mid]>target)
        return    binarySearch(nums,target,l,mid-1);
        
        else if(nums[mid]< target)
         return   binarySearch(nums,target,mid+1,r);
            
         
               
        }
         return -1;
    }
}
