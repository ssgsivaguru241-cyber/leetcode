class Solution {
    public String capitalizeTitle(String title) {

        title = title.toLowerCase();

        String result = "";
        String[] words = title.split(" ");

        for(int i = 0; i < words.length; i++) {

            if(words[i].length() <= 2) {
                result += words[i];
            }
            else {
                result += Character.toUpperCase(words[i].charAt(0))
                        + words[i].substring(1);
            }

            if(i < words.length - 1) {
                result += " ";
            }
        }

        return result;
    }
}