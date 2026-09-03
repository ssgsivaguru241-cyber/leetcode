class Solution {
    public boolean detectCapitalUse(String word) {
        int cap = 0;
        int small = 0;
        for(int i = 0 ; i < word.length() ; i++)
        {
            char ch = word.charAt(i);
            if(ch >= 'A' && ch <= 'Z')
            {
                cap++;
            }
            else
            {
                small++;
            }
        }
        if(cap == word.length())
        {
            return true;
        }
        if(small == word.length())
        {
            return true;
        }
        if(cap == 1 && word.charAt(0) >= 'A' && word.charAt(0) <= 'Z')
        {
            return true;
        }
        return false;
    }
}