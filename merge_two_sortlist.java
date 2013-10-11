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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        ListNode head=null;
        ListNode tail=null;
        while(l1!=null||l2!=null){
            if(l1!=null&&l2!=null){
                if(l1.val<=l2.val){
                    if(tail==null){
            head=l1;
            tail=l1;
        }
        else{
            tail.next=l1;
            tail=tail.next;
        }
                    l1=l1.next;
                }
                else{
                    if(tail==null){
            head=l2;
            tail=l2;
        }
        else{
            tail.next=l2;
            tail=tail.next;
        }
                    l2=l2.next;
                }
            }
            else if(l1!=null){
                if(tail==null){
            head=l1;
            tail=l1;
        }
        else{
            tail.next=l1;
            tail=tail.next;
        }
                l1=l1.next;
            }
            else{
                if(tail==null){
            head=l2;
            tail=l2;
        }
        else{
            tail.next=l2;
            tail=tail.next;
        }
                l2=l2.next;
            }
        }
        return head;
    }
    }
}