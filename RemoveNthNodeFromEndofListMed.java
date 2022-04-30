/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=0;
        ListNode t=head;
    while(t!=null){
       //  System.out.println("Size="+size);
        size++;
        t=t.next;
    } //System.out.println("Size="+size);
        if(size==1)
            return null;
        int i=1;
        int n1=size-n;
        if(n1==0){
            head=head.next;
            return head;
        }
       // System.out.println("N1="+n1);
 ListNode t1=head;
        while(i<n1){
         //  System.out.println("t.val="+t1.val+"\t i="+i);
            t1=t1.next;
            i++;
        }
        t1.next=t1.next.next;
        return head;
    }
}
