class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n=mat[0].length;
        int m=mat.length;
        int k=0;
         if (r*c != n*m) return mat;
        int res[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++,k++){
                res[i][j]=mat[k/n][k%n];
            }
        }
        return res;
    }
}
