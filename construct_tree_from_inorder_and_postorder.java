//Construct Binary Tree from Inorder and Postorder Traversal
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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int end=inorder.length-1;
        int[] last=new int[1];
        last[0]=postorder.length-1;
        return buildTree(inorder,0,end,postorder,last);
    }
    public TreeNode buildTree(int[] inorder, int inbegin, int inend, int[] postorder, int[] last){
        if(inbegin>inend)return null;
        TreeNode root=new TreeNode(postorder[last[0]]);
        int find=-1;
        for(int i=inbegin;i<=inend;i++){
            if(inorder[i]==postorder[last[0]]){
                find=i;
                break;
            }
        }
        last[0]--;
        root.right=buildTree(inorder, find+1,inend,postorder,last);
        root.left=buildTree(inorder, inbegin, find-1, postorder,last);
        return root;
    }
}
