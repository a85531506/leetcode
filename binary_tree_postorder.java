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
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> ans=new ArrayList<Integer>();
        post(ans,root);
        return ans;
    }
    public void post(ArrayList list, TreeNode root){
        if(root==null)return;
        post(list,root.left);
        post(list,root.right);
        list.add(root.val);
    }
}