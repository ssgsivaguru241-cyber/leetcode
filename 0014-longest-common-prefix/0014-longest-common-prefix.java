class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder pr = new StringBuilder();
        Arrays.sort(strs);
        String begin = strs[0];
        String end = strs[strs.length-1];
        for(int i = 0;i<Math.min(begin.length(),end.length());i++)
        {
            if(begin.charAt(i) != end.charAt(i)){
                return pr.toString();
            }
            pr.append(begin.charAt(i));
        }
        return pr.toString();
    }
}