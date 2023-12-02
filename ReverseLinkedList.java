class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class ReverseLinkedList {
    // Time Complexity: O(n) - linear time complexity
    // Space Complexity: O(1) - constant space complexity



//    Definition for singly-linked list.

        // Method to reverse a singly-linked list
        // Time Complexity: O(n) - linear time complexity
        // Space Complexity: O(1) - constant space complexity
        static ListNode reverseList(ListNode head) {
            // Initialize previous node as null, current node as the head of the list
            ListNode prev = null;
            ListNode current = head;

            // Iterate through the list and reverse the links between nodes
            while (current != null) {
                // Save the next node
                ListNode next = current.next;

                // Reverse the link to the previous node
                current.next = prev;

                // Move the pointers to the next nodes
                prev = current;
                current = next;
            }

            // After the loop, 'prev' will point to the new head of the reversed list
            return prev;
        }


}
