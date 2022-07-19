class Solution {
    public int search(int[] nums, int target) {
        int min=Arrays.stream(nums).min().orElseThrow();//get min element
       int minIndex= Arrays.stream(nums).boxed().collect(Collectors.toList()).indexOf(min);//then get min index of that min
     int res1=binSearch(nums,0,minIndex-1,target);
       int res2= binSearch(nums,minIndex,nums.length-1,target);
     // System.out.println("r1="+res1);
      //System.out.println("r2="+res2);
        if(res1!=-1) return res1;
        if(res2!=-1) return res2;
        else 
            return res1;
    }
    public int binSearch(int []a,int start,int end,int t){
        int mid=start+(end-start)/2;
//System.out.println("\nmid="+mid);

     if(end>=start){
        if(a[mid]==t)
            return mid;
        else if(a[mid]>t)
            return binSearch(a,start,mid-1,t);
        else if(a[mid]<t)
            return binSearch(a,start+1,end,t);
     }
       
        return -1;
    }
}
