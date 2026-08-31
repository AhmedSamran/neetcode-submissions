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
        ListNode previous = null;
        ListNode current = head;

        while(current != null) {
            //current = 2
            ListNode temporary = current.next; //temporary = null
            current.next = previous; // current.next = 2

            previous = current; // previous = 3
            current = temporary; // current = null
        }
        
        return previous;
    }
}
