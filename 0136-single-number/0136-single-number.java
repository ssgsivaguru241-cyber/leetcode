class Solution {
    public int singleNumber(int[] nums) {
        int m1 = nums[0];
        for(int i = 1 ; i < nums.length ; i++)
        {
            m1 = m1 ^ nums[i];
        }
        return m1;
    }
}