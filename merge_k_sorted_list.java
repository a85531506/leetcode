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
    public ListNode mergeKLists(ArrayList<ListNode> lists) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        if(lists.size()==0)return null;
        ListNode n1=lists.get(0);
        for(int i=1;i<lists.size();i++){
            ListNode head=null;
            ListNode tail=null;
            ListNode n2=lists.get(i);
            while(n1!=null||n2!=null){
                if(n1!=null&&n2!=null){
                    if(n1.val<n2.val){
                        if(head==null){
                            head=n1;
                            tail=n1;
                        }
                        else{
                            tail.next=n1;
                            tail=tail.next;
                        }
                        n1=n1.next;
                    }
                    else{
                        if(head==null){
                            head=n2;
                            tail=n2;
                        }
                        else{
                            tail.next=n2;
                            tail=tail.next;
                        }
                        n2=n2.next;
                    }
                }
                else if(n1==null){
                    if(head==null){
                        head=n2;
                        tail=n2;
                    }
                    else{
                        tail.next=n2;
                        tail=tail.next;
                    }
                    n2=n2.next;
                }
                else{
                    if(head==null){
                        head=n1;
                        tail=n1;
                    }
                    else{
                        tail.next=n1;
                        tail=tail.next;
                    }
                    n1=n1.next;
                }
                
            }
            n1=head;
        }
        return n1;
    }
}