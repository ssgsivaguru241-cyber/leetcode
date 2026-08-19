class Solution {
    public int[] singleNumber(int[] nums) {
        int[] element = new int[2];
        int index = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            boolean founded = false;
            for(int j = 0 ; j < nums.length ; j++)
            {
                if(i != j && nums[i] == nums[j])
                {
                    founded = true;
                    break;
                }
            }
             if(!founded)
            {
                element[index++] = nums[i];
                if(index == 2)
                {
                    break;
                }
            }

        }
        return element;
    }
}