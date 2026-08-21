class Solution {
    public int findComplement(int num) {
        int nums = 0;
        int temp = num;
        while(temp > 0)
        {
            nums = (nums << 1) | 1;
            temp >>= 1;
        }
        return num ^ nums;
    }
}