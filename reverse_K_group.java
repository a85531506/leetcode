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
    public ListNode reverseKGroup(ListNode head, int k) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        if(head==null)return null;
        ListNode n=head;
        for(int i=0;i<k-1;i++){
            n=n.next;
            if(n==null)return head;
        }
        ListNode next=n.next;
        n=head;
        ListNode pre=null;
        for(int i=0;i<k;i++){
            ListNode nextnode=n.next;
            n.next=pre;
            pre=n;
            n=nextnode;
        }
        head.next=reverseKGroup(next,k);
        return pre;
    }
}