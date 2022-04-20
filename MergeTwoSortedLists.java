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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode result=null;
        result=mergeLists(result,l1,l2);
                                
    return result;
        
    }
    public ListNode mergeLists(ListNode result,ListNode l1,ListNode l2){
        if(l1==null && l2==null)
            return result;
        
        if(l1!=null && (l2==null|| (l1.val<l2.val))){
           // System.out.println(l1.val);
            result=new ListNode(l1.val);
            result.next=mergeLists(result.next,l1.next,l2);
        }
        if(l2!=null && (l1==null || (l1.val>=l2.val) )){
              //System.out.println(l2.val);
             result=new ListNode(l2.val);
            result.next=mergeLists(result.next,l1,l2.next);
        }
        
        return result;
    }
}
