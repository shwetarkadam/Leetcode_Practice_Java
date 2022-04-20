/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> map=new HashSet();   //useing hashset to store listnodes and not values 
        ListNode start=head;
        while(start!=null){
            if(map.contains(start)){
                return true;
            }
            map.add(start);
            start=start.next;
        }
        return false;
    }
}
