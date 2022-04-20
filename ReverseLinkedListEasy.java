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
    public ListNode reverseList(ListNode head) {
       ListNode next=head;
        ListNode curr=head;
        ListNode prev =null;
        while(curr!=null){
            next=curr.next;  //first update next
            curr.next=prev;   //pooint urrent node to prev node
            prev=curr;        //makr current node as prev 
            curr=next;
            
        }
        return prev;
}
}
