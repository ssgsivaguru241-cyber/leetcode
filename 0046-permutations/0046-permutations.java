class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> temp = new ArrayList<>();
        backtrack( res , temp ,nums);
        return res;
    }
    void backtrack(List<List<Integer>> res,List<Integer> temp,int[] nums){

        if(temp.size() == nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i = 0 ; i < nums.length ; i++){
            if(temp.contains(nums[i])){
                continue;
            }
            temp.add(nums[i]);
            backtrack(res,temp,nums);
            temp.remove(temp.size()-1);
        }
    }
}