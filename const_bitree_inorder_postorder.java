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
        // Note: The Solution object is instantiated only once and is reused by each test case.
        if(inorder.length==0)return null;
        int[] po=new int[1];
        po[0]=postorder.length-1;
        return buildTree(inorder,postorder,0,inorder.length-1,po);
    }
    public TreeNode buildTree(int[] in,int[] post,int inb,int ine,int[] poste){
        if(inb>ine)return null;
        int value=post[poste[0]];
        TreeNode root=new TreeNode(value);
        poste[0]--;
        int i=0;
        for(i=inb;i<=ine;i++){
            if(in[i]==value)break;
        }
        TreeNode right=buildTree(in,post,i+1,ine,poste);
        TreeNode left=buildTree(in,post,inb,i-1,poste);
        root.left=left;
        root.right=right;
        return root;
    }
}