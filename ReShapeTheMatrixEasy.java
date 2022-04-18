class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row=mat.length;
        int col=mat[0].length;
        int res[][]=new int[r][c];
        if(row*col != r*c) //check if matrix can be reshaped
            return mat;
        else{
            int r1=0,c1=0;
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    res[r1][c1]=mat[i][j];   
                    c1++;                    // keep adding values column wise
                    if(c1==c)  {            //once reach peak condi reset the row and col of result matrix
                       c1=0;
                        r1++;   
                    }
                }
            }
        }
        
            return res;
    }

}
