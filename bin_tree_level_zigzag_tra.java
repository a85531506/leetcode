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
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        if(root==null)return ans;
        ArrayList<TreeNode> pre=new ArrayList<TreeNode>();
        pre.add(root);
        int count=1;
        while(!pre.isEmpty()){
            ArrayList<Integer> num=new ArrayList<Integer>();
            ArrayList<TreeNode> cur=new ArrayList<TreeNode>();
            for(int i=0;i<pre.size();i++){
                if(count%2==1)num.add(pre.get(i).val);
                else num.add(0, pre.get(i).val);
                if(pre.get(i).left!=null)cur.add(pre.get(i).left);
                if(pre.get(i).right!=null)cur.add(pre.get(i).right);
            }
            count++;
            ans.add(num);
            pre=cur;
        }
        return ans;
    }
}