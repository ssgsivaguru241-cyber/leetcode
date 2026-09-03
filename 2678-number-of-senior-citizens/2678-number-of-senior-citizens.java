class Solution {
    public int countSeniors(String[] details) {

        int count = 0;

        for(int i = 0; i < details.length; i++) {

            char a = details[i].charAt(11);
            char b = details[i].charAt(12);

            int age = (a - '0') * 10 + (b - '0');

            if(age > 60) {
                count++;
            }
        }

        return count;
    }
}