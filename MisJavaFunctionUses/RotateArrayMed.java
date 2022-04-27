class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int[] res=new int[n];
        while(k>n){
            k=k-n;
        }
       // System.out.println("n-k ="+(n-k));
         //  System.out.println("k="+k);
        System.arraycopy(nums,n-k,res,0,k);//5	6	7	4	5	6	7	copy last n-k lemenets in the first half of the array 
       System.arraycopy(nums,0,res,k,n-k);    //copy first half elements
        
        // Arrays.stream(res).forEach(e->System.out.print(e+"\t"));
        System.out.println();
         
        for(int i=0;i<n;i++){
            nums[i]=res[i];
        }
 
      
         
    }
}
