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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ListNode head=null;
        ListNode tail=null;
        ListNode n1=l1;
        ListNode n2=l2;
        int car=0;
        while(n1!=null||n2!=null){
            int num1=0;
            int num2=0;
            if(n1!=null){
                num1=n1.val;
                n1=n1.next;
            }
            if(n2!=null){
                num2=n2.val;
                n2=n2.next;
            }
            int sum=num1+num2+car;
            int digit=sum%10;
            car=sum/10;
            ListNode n=new ListNode(digit);
            if(tail==null){
                head=n;
                tail=n;
            }
            else{
                tail.next=n;
                tail=tail.next;
            }
        }
        if(car>0){
            ListNode n= new ListNode(car);
            tail.next=n;
            tail=tail.next;
        }
        return head;
        
    }
}