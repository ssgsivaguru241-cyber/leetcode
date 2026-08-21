class Solution {
    public String compare(String str)
    {
        StringBuilder sb = new StringBuilder();
        for(char ch : str.toCharArray())
        {
            if(ch == '#')
                {
                    if (sb.length() > 0) {
                      sb.deleteCharAt(sb.length() - 1);
                    }
                }
                else
                {
                    sb.append(ch);
                }
        }
        return sb.toString();
    }
    public boolean backspaceCompare(String s, String t) {
        return compare(s).equals(compare(t));
    }
}