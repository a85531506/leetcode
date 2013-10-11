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
    public int sumNumbers(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root==null)return 0;
        int[] sum=new int[1];
        sum[0]=0;
        sumNumbers(root,sum,0);
        return sum[0];
        
    }
    public void sumNumbers(TreeNode root, int[] res, int sum){
        if(root==null)return;
        if(root.left==null&&root.right==null){
            res[0]+=sum*10+root.val;
            return;
        }
        if(root.left!=null)sumNumbers(root.left, res,sum*10+root.val);
        if(root.right!=null)sumNumbers(root.right,res,sum*10+root.val);
    }
}