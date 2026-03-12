class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(String s:operations){
            if(!st.isEmpty() && s.equals("C")){
                st.pop();
            }
            else if(!st.isEmpty() && s.equals("D")){
                st.push(2*(st.peek()));
            }
            else if(!st.isEmpty() && s.equals("+")){
                int first = st.pop();
                int second = st.peek();
                int sum = first + second;
                st.push(first);
                st.push(sum);
            }
            else{
                st.push(Integer.valueOf(s));
            }
        }
        int res = 0;
        for(int i:st){
        res+= i;
        }
        return res;
    }
}