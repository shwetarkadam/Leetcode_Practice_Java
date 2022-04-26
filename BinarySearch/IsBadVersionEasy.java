/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
    int low=1;
        int high=n;
        
        while(low<=high){   //make sure low and high dont cross
            int mid=low + (high-low)/2;
          
        if(isBadVersion(mid))    //mae sure the element is shoifted to left
            high=mid-1;
            else
                low=mid+1;      //or to right
            
        }
        return low;
}
}
