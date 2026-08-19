class Solution {
    public int[] shuffle(int[] nums, int n) {
        int m = nums.length;
        int arr[] = new int[m];
        for(int i = 0 ; i < m ; i++)
        {
            if(i % 2 == 0)
            {
                arr[i] = nums[i/2];
            }
            else
            {
                arr[i] = nums[n + (i/2)];
            }
        }
        return arr;
    }
}