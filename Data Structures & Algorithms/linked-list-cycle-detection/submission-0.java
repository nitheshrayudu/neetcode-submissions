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
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode, Boolean> hm = new HashMap<ListNode, Boolean>();

        while(head != null){
            if(hm.containsKey(head)){ return true;}
            hm.put(head,true);
            head = head.next;
        }
        return false;
    }
}
