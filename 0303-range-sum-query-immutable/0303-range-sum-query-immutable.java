class NumArray {
    List<Integer> numarray;
    public NumArray(int[] nums) {
        numarray = new ArrayList<>();
        for(int i:nums)
        {
            numarray.add(i);
        }
    }
    
    public int sumRange(int left, int right) {
        int result = 0;
        for(int i = left ; i <= right ; i++)
        {
            result += numarray.get(i);
        }
        return result;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */