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
    public ListNode reverseBetween(ListNode head, int m, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(head==null)return null;
        if(m==n)return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode node=dummy;
        ListNode pretail=null;
        ListNode pre=null;
        for(int i=1;i<=n+1;i++){
            if(i==m){
                pretail=node;
            }
            if(i>m&&i<=n+1){
                ListNode temp=node.next;
                node.next=pre;
                pre=node;
                node=temp;
            }
            else node=node.next;
        }
        pretail.next.next=node;
        pretail.next=pre;
        return dummy.next;
    }
}