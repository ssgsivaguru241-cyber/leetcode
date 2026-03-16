class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> li = new ArrayList<>();
        backtrack(li,"",0,0,n);
        return li;
    }
    public void backtrack(List<String> li,String s,int openCount,int closeCount,int n){
        if(s.length() == n*2){
            li.add(s);
            return;
        }
        if(openCount < n){
            backtrack(li,s+"(",openCount+1,closeCount,n);
        }
        if(closeCount < openCount){
            backtrack(li,s+")",openCount,closeCount+1,n);
        }

        }
}
 
