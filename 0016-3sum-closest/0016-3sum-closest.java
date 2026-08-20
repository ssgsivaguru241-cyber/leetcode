class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int clossum = nums[0] + nums[1] + nums[2];
        int minDiff = Math.abs(target - clossum);
        for(int i = 0 ; i < n - 2 ; i++)
        {
           int left = i + 1;
           int right = n - 1; 
           while(left < right)
           {
             int sum = nums[i] + nums[left] + nums[right];
             int Diff = Math.abs(target - sum);
             if(Diff < minDiff)
             {
                 minDiff = Diff;
                 clossum = sum;
             }
             if(sum < target)
             {
                    left++;
             }
             if(sum > target)
             {
                 right--;
             }
             if(sum == target)
             {
                return sum;
             }
           }
    }
    return clossum;
}
}