import java.util.*;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
   //source,sorc pos,dest,dest pos,legnth of subarray to be copied
           System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
}
}
