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
    public ListNode middleNode(ListNode head) {
        HashMap<Integer,ListNode>map=new HashMap();//use a map to store index and then the node 
        ListNode s=head;
        int size=0;
        while(s!=null){
            map.put(size,s);
            s=s.next;
            size++;
        }
       // System.out.println(size/2);
    //        System.out.println(map.get(size/2));
        return (ListNode)map.get(size/2);
        
    }
}
