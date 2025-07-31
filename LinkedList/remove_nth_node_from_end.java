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
        if(head.next==null)
        return null;
        ListNode temp=head;
        ListNode prev=new ListNode (-1);
        prev.next=head;
        int c=1,l=0;
        while(temp!=null){
            temp=temp.next;
            ++l;
        }
        temp=prev;
        while(temp!=null){
           if(c==(l-n)+1){
            temp.next=temp.next.next;
            break;
           }
           temp=temp.next;
           ++c;
        }
        return prev.next;
    }
}
