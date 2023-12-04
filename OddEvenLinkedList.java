public class OddEvenLinkedList {
    class Solution {
        /**
         * Rearranges a linked list such that all nodes with odd positions come before nodes with even positions.
         *
         * @param head The head of the linked list.
         * @return The head of the modified linked list.
         */
        public ListNode oddEvenList(ListNode head) {
            // Base cases: empty list or a list with only one node
            if (head == null || head.next == null) {
                return head;
            }

            // Initialize pointers for odd, even, and the head of even nodes
            ListNode odd = head;
            ListNode even = head.next;
            ListNode evenHead = even;

            // Traverse the linked list
            while (even != null && even.next != null && odd != null && odd.next != null) {
                // Rearrange odd nodes
                odd.next = even.next;
                odd = odd.next;

                // Rearrange even nodes
                even.next = odd.next;
                even = even.next;
            }

            // Connect the odd list with the even list
            odd.next = evenHead;

            // Return the head of the modified linked list
            return head;
        }
    }

}
