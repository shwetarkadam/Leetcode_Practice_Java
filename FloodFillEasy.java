class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
         if(newColor == image[sr][sc]){
          return image;
        }
        int oldColor=image[sr][sc];
        floodfill(image,sr,sc,newColor,oldColor);
        return image;
    }
    public void floodfill(int [][]img,int sr,int sc,int newColor,int oldColor){
      //  System.out.println("Here"+img[sr][sc]);
        if(sr<0|| sc<0 || sr>=img.length||sc>=img[0].length)
        { //System.out.println("Here sr="+sr+"\tsc="+sc);
            return;
        }
        if(img[sr][sc]!=oldColor){
         //System.out.println("Here"+sr+"\tsc="+sc);
            return;
        }
    //    System.out.println(img[sr][sc]);
        img[sr][sc]=newColor;//makr it as visited
         floodfill(img,sr+1,sc,newColor,oldColor);
         floodfill(img,sr,sc+1,newColor,oldColor);
         floodfill(img,sr-1,sc,newColor,oldColor);
         floodfill(img,sr,sc-1,newColor,oldColor);
    }
}
