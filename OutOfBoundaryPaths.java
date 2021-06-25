class Solution {
      int MOD = 1000000007;
    long [][][] mat;
    public void initializeMat(int m,int n){
        mat=new long[m][n][51];
    }
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        initializeMat(m,n);
        for(long [][] row:mat)
            for(long []row2:row)
            Arrays.fill(row2,-1);
        
       int count=(int)solve(m,n,maxMove,startRow,startColumn);
        return count;
    }
    
    
    public long solve(int m,int n,int moves,int r,int c){
        if(r<0 || r>=m || c<0 || c>=n){
           // System.out.println("R="+r+"\tc="+c);
             // System.out.println("m="+m+"\tn="+n);
            return 1;
        }
        if(moves<=0)
            return 0;
        
        if(mat[r][c][moves] != -1)
            return mat[r][c][moves];
        
      return mat[r][c][moves]=(solve(m,n,moves-1,r-1,c)+solve(m,n,moves-1,r+1,c)+solve(m,n,moves-1,r,c-1)+solve(m,n,moves-1,r,c+1))%MOD;
    }
}
