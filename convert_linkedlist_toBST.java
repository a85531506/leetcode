/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(head==null)return null;
        ListNode n=head;
        int len=0;
        while(n!=null){
            len++;
            n=n.next;
        }
        ListNode[] Nodearr=new ListNode[1];
        Nodearr[0]=head;
        TreeNode ans=sortedListToBST(Nodearr, 0, len-1);
        return ans;
    }
    public TreeNode sortedListToBST(ListNode[] root, int begin, int end){
        if(begin>end)return null;
        int mid=begin+(end-begin)/2;
        TreeNode left=sortedListToBST(root,begin,mid-1);
        TreeNode nroot=new TreeNode(root[0].val);
        root[0]=root[0].next;
        TreeNode right=sortedListToBST(root, mid+1,end);
        nroot.left=left;
        nroot.right=right;
        return nroot;
    }
}