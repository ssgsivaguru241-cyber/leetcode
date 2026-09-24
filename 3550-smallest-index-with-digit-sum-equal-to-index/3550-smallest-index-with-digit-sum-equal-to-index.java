class Solution {
    public int digit(int num)
    {
        int sum = 0;
        while(num > 0)
        {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        // System.out.println(sum);
        return sum;
    }
    public int smallestIndex(int[] nums) {
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(i == digit(nums[i]))
            {
                return i;
            }
        }
        return -1;
    }

}