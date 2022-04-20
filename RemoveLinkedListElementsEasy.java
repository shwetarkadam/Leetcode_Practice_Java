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
    public ListNode removeElements(ListNode head, int val) {
        return remove(head,val);
    }
    public ListNode remove(ListNode head,int val){
        if(head==null)
            return head;
         head.next=remove(head.next,val);  //moved here since we call remove in both conditions and next pair irt with mext node 
        if(head.val==val){
           // System.out.println("val="+val+"\t head.val="+head.val+"\t head.next="+head.next);
          return   head=head.next;
           
        }
        else           
        return head;
    }
}
