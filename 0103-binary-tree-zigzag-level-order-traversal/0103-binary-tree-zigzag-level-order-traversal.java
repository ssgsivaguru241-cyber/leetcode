/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Boolean flag = false;
        if(root == null){
            return res;
        }
        Queue<TreeNode> q = new LinkedList<>();        
        q.add(root);
        while(!q.isEmpty()){
            int n  = q.size();
            List<Integer> res1 = new ArrayList<>();
            for(int i = 0 ; i < n ; i++){
            TreeNode curr = q.poll();
            res1.add(curr.val);
            if(curr.left != null){
                q.add(curr.left);
            }
            if(curr.right != null){
                q.add(curr.right);
            }
        }
        if(!flag){
            res.add(res1);
            flag = true;
        }
        else if(flag)
        {
            Collections.reverse(res1);
            res.add(res1);
            flag = !flag;
        }  
        }
        return res;
    }
}
