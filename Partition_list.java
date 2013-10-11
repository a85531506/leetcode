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
    public ListNode partition(ListNode head, int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(head==null)return null;
        ListNode leh=null;
        ListNode let=null;
        ListNode grh=null;
        ListNode grt=null;
        ListNode n=head;
        while(n!=null){
            if(n.val<x){
                if(let==null){
                    let=n;
                    leh=n;
                }
                else{
                    let.next=n;
                    let=let.next;
                }
            }
            else{
                if(grt==null){
                    grt=n;
                    grh=n;
                }
                else{
                    grt.next=n;
                    grt=grt.next;
                }
            }
            n=n.next;
        }
        if(leh==null)return grh;
        let.next=grh;
        if(grt!=null)grt.next=null;
        return leh;
    }
}