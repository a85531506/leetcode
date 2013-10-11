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
        // Note: The Solution object is instantiated only once and is reused by each test case.
        if(preorder.length==0)return null;
        int[] pref=new int[1];
        pref[0]=0;
        return buildTree(preorder,inorder,0,inorder.length-1,pref);
    }
    public TreeNode buildTree(int[] pre,int[] in,int inb,int ine,int[] pref){
        if(inb>ine)return null;
        int value=pre[pref[0]];
        pref[0]++;
        TreeNode root=new TreeNode(value);
        int i=0;
        for(i=inb;i<=ine;i++){
            if(in[i]==value)break;
        }
        TreeNode left=buildTree(pre,in,inb,i-1,pref);
        TreeNode right=buildTree(pre,in,i+1,ine,pref);
        root.left=left;
        root.right=right;
        return root;
    }
}