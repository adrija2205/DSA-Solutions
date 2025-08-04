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
        ListNode temp=head;
        ListNode itself=temp;
        while(temp!=null&& temp.next!=null){
            temp=temp.next.next;
            itself=itself.next;
            if(temp==itself){
                return true;
            }
        }
     return false;
    }
}
