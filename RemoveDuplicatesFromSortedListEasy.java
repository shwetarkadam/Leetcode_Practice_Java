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
    public ListNode deleteDuplicates(ListNode head) {
        HashSet<Integer> map=new HashSet(); //use the set to keep track of duplicates
        ListNode prev=head;
        ListNode t=head;
        
        while(t!=null){
            if(!map.contains(t.val)){
                map.add(t.val);   //if duplicate fouind link prev node next wiht current node next
                
                prev=t;
                t=t.next;
                
            }else{
                prev.next=t.next;
                prev=t;
                t=t.next;
            }
        }
        return head;
    }
}
