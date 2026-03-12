class Solution {
    public boolean isValid(String word) {
        if(word.length() < 3)
        {
           return false;
        }
        boolean vowel = false;
        boolean consonent = false;
        for(char c:word.toCharArray()){
            if(!Character.isLetterOrDigit(c)){
                return false;
            }
            if(Character.isLetter(c)){
            char lower = Character.toLowerCase(c);
            if(lower == 'a' ||lower == 'e' ||lower == 'i' ||lower == 'o' ||lower == 'u')
            {
                vowel = true;
            }
            else{
                consonent = true;
            }

            }
            
        }
        return vowel & consonent;

    }
}
