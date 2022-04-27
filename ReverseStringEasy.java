class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        int mid=n/2;
       
        char t;
       
            for(int i=0;i<mid;i++){
                t=s[i];
                s[i]=s[n-1-i];
                s[n-1-i]=t;
            }
      
    }
}
