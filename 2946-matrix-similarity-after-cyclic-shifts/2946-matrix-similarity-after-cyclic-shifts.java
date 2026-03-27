class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int rows = mat.length;
        int cols = mat[0].length;
        k = k % cols;
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++) 
            {
                int shiftedValue;
                if (i % 2 == 0) 
                {
                    shiftedValue = mat[i][(j + k) % cols];
                } 
                else 
                {
                    shiftedValue = mat[i][(j - k + cols) % cols];
                }
                if (shiftedValue != mat[i][j])
                {
                    return false;
                }
            }
        }
        
        return true;
    }
}
