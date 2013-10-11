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
    public void flatten(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
       if(root==null)return;
       flatten(root.left);
       flatten(root.right);
       TreeNode n=root.right;
       root.right=root.left;
       root.left=null;
       TreeNode rm=root;
       while(rm.right!=null)rm=rm.right;
       rm.right=n;
    }
}