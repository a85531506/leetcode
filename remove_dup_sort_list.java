/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(head==null)return null;
        ListNode n=head;
        while(n.next!=null){
            if(n.val!=n.next.val)n=n.next;
            else n.next=n.next.next;
        }
        return head;
    }
}