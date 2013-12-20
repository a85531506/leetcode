/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> ans=new ArrayList<Integer>();
        if(root==null)return ans;
        Stack<TreeNode> stack=new Stack<TreeNode>();
        stack.push(root);
        while(!stack.empty()){
            TreeNode n=stack.pop();
            ans.add(n.val);
            if(n.right!=null)stack.push(n.right);
            if(n.left!=null)stack.push(n.left);
        }
        return ans;
    }
}