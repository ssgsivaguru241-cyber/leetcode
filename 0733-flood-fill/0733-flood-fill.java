class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int num = image[sr][sc];
        if(image[sr][sc] == color){
            return image;
        }
        backtrack(image,sr,sc,color,num);
        return image;
    }
      public void backtrack(int[][] grid,int i,int j,int color,int num){
            if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != num){
            return;
        }
        grid[i][j] = color;
        backtrack(grid,i+1,j,color,num);
        backtrack(grid,i-1,j,color,num);
        backtrack(grid,i,j+1,color,num);
        backtrack(grid,i,j-1,color,num);
}
}