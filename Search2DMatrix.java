class Solution {
    public boolean searchMatrix(int[][] matrix, int t) {
          if(matrix==null || matrix.length==0 || matrix[0].length==0) 
            return false;
        
        int m=matrix.length;
        int n=matrix[0].length;
        int j=0;
     for(int i=0;i<m;i++){
         j=n-1;
         while(j>=0 && i<m){            // make sure to start j from end of the col and that i and j never cross each other otherwise TLE 
             if(matrix[i][j]==t) 
                 return true;
             else if(matrix[i][j]>t)
                 j--;
             else 
                 i++;                    // move to next row if target>mat
         }
     }
        return false;
}
}
