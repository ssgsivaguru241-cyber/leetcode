class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        int j = 0;
        for(int num:pushed){
            st.push(num);
            while(!st.empty() && st.peek() == popped[j]){
                st.pop();
                j++;
            }
        }
        return st.isEmpty();  
          }
}