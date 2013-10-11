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
    public boolean isValidBST(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root==null)return true;
        return isValidBST(root, Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    public boolean isValidBST(TreeNode root, int low, int up){
        if(root==null)return true;
        if(root.val>low&&root.val<up){
            return isValidBST(root.left,low,root.val)&&isValidBST(root.right, root.val,up);
        }
        else return false;
    }
}