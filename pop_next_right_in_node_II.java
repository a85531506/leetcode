/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root==null)return;
        ArrayList<TreeLinkNode> pre=new ArrayList<TreeLinkNode>();
        pre.add(root);
        while(!pre.isEmpty()){
            ArrayList<TreeLinkNode> curr=new ArrayList<TreeLinkNode>();
            for(int i=0;i<pre.size()-1;i++){
                pre.get(i).next=pre.get(i+1);
            }
            for(int i=0;i<pre.size();i++){
                if(pre.get(i).left!=null)curr.add(pre.get(i).left);
                if(pre.get(i).right!=null)curr.add(pre.get(i).right);
            }
            pre=curr;
        }
    }
}