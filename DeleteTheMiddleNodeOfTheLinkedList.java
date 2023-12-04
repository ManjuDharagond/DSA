public class DeleteTheMiddleNodeOfTheLinkedList {
//    Intuition:
//    The goal is to delete the middle node of a linked list. The middle node in this context refers to the node approximately in the middle of the linked list. To achieve this, we can use two pointers: one moving at a regular pace (slow), and another moving at twice the pace (fast). When the fast pointer reaches the end of the list, the slow pointer will be approximately in the middle. At this point, we can update the pointers to remove the middle node.
//
//    Approach:
//    Initialize two pointers (slow and fast) at the beginning of the linked list.
//    Move the fast pointer two steps at a time while moving the slow pointer one step at a time.
//    When the fast pointer reaches the end of the list, the slow pointer will be at the middle (or close to the middle).
//    Update the next pointer of the node before the middle node to skip the middle node, effectively removing it.
//    Complexity:
//    Time Complexity:
//
//    The time complexity is O(n), where n is the number of nodes in the linked list.
//    Both pointers traverse the linked list linearly, and the operation to remove the middle node takes constant time.
//    Space Complexity:
//
//    The space complexity is O(1).
//    We use only a constant amount of extra space for the two pointers (slow and fast), and no additional data structures are used.
//    In summary, the solution is efficient with linear time complexity and constant space complexity.poi
//
//            Code
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
        /**
         * Deletes the middle node of a linked list.
         *
         * @param head The head of the linked list.
         * @return The head of the linked list after removing the middle node.
         */
        public ListNode deleteMiddle(ListNode head) {
            // Base cases: empty list or a list with only one node
            if (head == null || head.next == null) {
                return null;
            }

            // Initialize two pointers, slow and fast, both starting at the head
            ListNode slow = head;
            ListNode fast = head;

            // Move the fast pointer two steps at a time until it reaches the end
            // When fast reaches the end, slow will be at the middle
            fast = fast.next.next;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            // Remove the middle node by updating the next pointer of the node before the middle
            slow.next = slow.next.next;

            // Return the head of the modified linked list
            return head;
        }
    }
}
