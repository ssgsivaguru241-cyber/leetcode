class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int sums = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i = 0 ; i < n - 2 ; i++)
        {
            int left = i + 1;
            int right = n - 1;
            int sum = nums[i] * nums[left] * nums[right];
            sums = Math.max(sums,sum);
        }
        return sums;
    }
}