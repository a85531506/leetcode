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
        // Note: The Solution object is instantiated only once and is reused by each test case.
        if(head==null)return null;
        ListNode dummy=new ListNode(0);
        ListNode pre=dummy;
        ListNode n=head;
        boolean flag=true;
        while(n!=null){
            if(n.next!=null&&n.val!=n.next.val){
                if(flag){
                    pre.next=n;
                    pre=n;
                    flag=true;
                }
                else{
                    flag=true;
                }
            }
            else if(n.next==null&&flag){
                pre.next=n;
                pre=n;
            }
            else flag=false;
            n=n.next;
        }
        pre.next=null;
        return dummy.next;
    }
}