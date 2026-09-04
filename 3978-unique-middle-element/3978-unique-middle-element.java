class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        if(nums.length == 0 || nums == null)
        {
            return false;
        }
        int count = 0;
        int mid = nums.length/2;
        int index = nums[mid];

        for(int num : nums)
        {
            if(num == index)
            {
                count++;
            }
        }
        return count == 1;
    }
}