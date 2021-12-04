class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode next=head;
        ListNode curr=head;
        while(curr!=null){
            next=curr.next; //maintain next position of cur
            curr.next=prev;//assign prev value
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
