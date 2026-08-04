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
        //reverse the order similar to reverse linkedlist.
        ListNode curr = head;
        int length =0;
        // First loop: count nodes
        while (curr != null) {
            length++;
            curr = curr.next;
        }

        // Remove first node
        if (length == n) {
            return head.next;
        }

        // Second loop: go to node before target
        curr = head;
        for (int i = 1; i < length - n; i++) {
            curr = curr.next;
        }

        curr.next = curr.next.next;

        return head;
    }
}
