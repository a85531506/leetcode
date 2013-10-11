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
    public void recoverTree(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<TreeNode> err=new ArrayList<TreeNode>();
        TreeNode[] min=new TreeNode[1];
        min[0]=new TreeNode(Integer.MIN_VALUE);
        recoverTree(root,min,err);
        int temp=err.get(0).val;
        err.get(0).val=err.get(err.size()-1).val;
        err.get(err.size()-1).val=temp;
    }
    public void recoverTree(TreeNode root, TreeNode[] min, ArrayList<TreeNode> err){
        if(root==null)return;
        recoverTree(root.left, min,err);
        if(root.val<min[0].val){
            err.add(min[0]);
            err.add(root);
        }
        min[0]=root;
        recoverTree(root.right,min,err);
    }
}