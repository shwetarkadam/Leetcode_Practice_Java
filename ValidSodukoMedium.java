class Solution {
    public boolean isValidSudoku(char[][] board) {
             HashSet s=new HashSet();
        for(int i=0;i<9;i++){
       
            for(int j=0;j<9;j++){
                if(board[i][j]!= '.'){
                     //store every value as a key as each number shd be unique in each row,col and box
                    String row =board[i][j]+" in row "+i;
                    String col =board[i][j]+" in col"+j;
                    String box=board[i][j]+" in box "+i/3+" and "+j/3;
                    //System.out.println(board[i][j]+" in box "+i/3+" and "+j/3);
                    if(s.contains(row)|| s.contains(col) || s.contains(box))
                        return false;
                    
                    s.add(row);
                    s.add(col);
                    s.add(box);
                }
            }
        }
        return true;
    }
}
