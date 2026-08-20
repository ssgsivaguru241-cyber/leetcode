class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        int max = 0;
        for(int can:candies)
        {
            max = Math.max(max,can);
        }
        List<Boolean> li = new ArrayList<>();
        for(int can:candies)
        {
             li.add(can+extraCandies >= max);
        }
        return li;
    }
}