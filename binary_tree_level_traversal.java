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
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
        if(root==null)return ans;
        ArrayList<TreeNode> pre=new ArrayList<TreeNode>();
        pre.add(root);
        while(!pre.isEmpty()){
            ArrayList<Integer> num=new ArrayList<Integer>();
            ArrayList<TreeNode> cur=new ArrayList<TreeNode>();
            for(int i=0;i<pre.size();i++){
                num.add(pre.get(i).val);
                if(pre.get(i).left!=null)cur.add(pre.get(i).left);
                if(pre.get(i).right!=null)cur.add(pre.get(i).right);
            }
            ans.add(num);
            pre=cur;
        }
        return ans;
    }
}