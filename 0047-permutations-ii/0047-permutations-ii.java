class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> temp = new ArrayList<>();
        boolean[] n = new boolean[nums.length];
        backtrack( res , temp ,nums,n);
        return res;
    }
    void backtrack(List<List<Integer>> res,List<Integer> temp,int[] nums,boolean[] n){

        if(temp.size() == nums.length){
            if(!res.contains(temp)){
            res.add(new ArrayList<>(temp));
            return;
            }
        }
        for(int i = 0 ; i < nums.length ; i++){
            if(n[i]){
                continue;
            }
            // if (i > 0 && nums[i] == nums[i - 1]){
            //     continue;
            // } 
            temp.add(nums[i]);
            n[i] = true;
            backtrack(res,temp,nums,n);
            temp.remove(temp.size()-1);
            n[i] = false;
        }
    }
}