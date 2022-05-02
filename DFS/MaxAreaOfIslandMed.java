class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea=0,sum=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    sum=0;
                    sum=floodfill(grid,i,j);
                }
                if(sum>maxArea)
                    maxArea=sum;
                
            }
        }
        return maxArea;
    }
     public int floodfill(int [][]img,int sr,int sc){
      //  System.out.println("Here"+img[sr][sc]);
        if(sr<0|| sc<0 || sr>=img.length||sc>=img[0].length|| img[sr][sc]==0)
        { //System.out.println("Here sr="+sr+"\tsc="+sc);
            return 0;
        }
        
        img[sr][sc]=0;//makr it as visited
         int sum=1; //and store the visited vakye fior sym
    sum+=floodfill(img,sr+1,sc);
         sum+= floodfill(img,sr,sc+1);
        sum+=  floodfill(img,sr-1,sc);
         sum+= floodfill(img,sr,sc-1);
         return sum;
    }
}
