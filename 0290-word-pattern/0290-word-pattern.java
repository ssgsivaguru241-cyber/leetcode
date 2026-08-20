class Solution {
    public boolean wordPattern(String pattern, String s) {
        char[] ch = pattern.toCharArray();
        String[] str = s.split(" ");
        if(ch.length != str.length)
        {
            return false;
        }
        HashMap<Character,String> map = new HashMap<>();
        for(int i = 0 ; i < str.length; i++)
        {
            if(!map.containsKey(ch[i]) && !map.containsValue(str[i]))
            {
                map.put(ch[i],str[i]);
            }
        }
        for(int i = 0 ; i < str.length ; i++)
        {
            if(!(str[i].equals(map.get(ch[i]))))
            {
                return false;
            }
        }
        return true;
    }
}