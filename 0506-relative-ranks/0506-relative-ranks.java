class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] str = new String[n];
        Integer[] index = new Integer[n];
        for(int i = 0 ; i < n ; i++)
        {
            index[i] = i;
        }
        Arrays.sort(index , (a,b) -> score[b] - score[a]);
        for(int i = 0 ; i < n ; i++)
        {
            if(i == 0)
            {
                str[index[i]] = "Gold Medal";
            }
            else if(i == 1)
            {
                str[index[i]] = "Silver Medal";
            }
            else if(i == 2)
            {
                str[index[i]] = "Bronze Medal";
            }
            else
            {
                str[index[i]] = (i+1) + "";
            }
        }
        return str;
    }
}