class Solution {
    public int maxAreaOfIsland(int[][] grid) {
         int maxArea = 0;
        if(grid == null || grid.length == 0)
        {
            return 0;
        }
        for(int i = 0 ;i<grid.length;i++){
            for(int j = 0 ;j < grid[0].length ; j++){
                if(grid[i][j] == 1){
                    int max = backtrack(grid,i,j);
                    maxArea = Math.max(maxArea,max);
                }
            }
        }
        return maxArea;
    }
    public int backtrack(int[][] grid,int i,int j){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0){
            return 0;
        }
        grid[i][j] = 0;
        int area = 1;
        area += backtrack(grid,i+1,j);
        area += backtrack(grid,i,j+1);
        area += backtrack(grid,i-1,j);
        area += backtrack(grid,i,j-1);
        return area;
    }
}