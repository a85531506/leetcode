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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int[] first=new int[1];
        first[0]=0;
        int end=inorder.length-1;
        return buildTree(preorder,0,end,inorder,first);
    }
    public TreeNode buildTree(int[] preorder, int begin, int end, int[] inorder, int[] first){
        if(begin>end)return null;
        TreeNode root=new TreeNode(preorder[first[0]]);
        int find=-1;
        for(int i=begin;i<=end;i++){
            if(inorder[i]==preorder[first[0]]){
                find=i;
                break;
            }
        }
        first[0]++;
        root.left=buildTree(preorder, begin, find-1,inorder,first);
        root.right=buildTree(preorder, find+1,end,inorder,first);
        return root;
    }
}