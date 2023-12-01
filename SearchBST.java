
public class SearchBST { // Definition for a binary tree node.
// Class representing a solution for searching a value in a Binary Search Tree (BST)
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

    // Method to search for a value in the BST
    // Returns the node with the specified value, or null if not found
    static TreeNode searchBST(TreeNode root, int val) {
        // If the root is null, the value is not found in the empty tree
        if (root == null) {
            return null;
        }
        // If the current node's value is equal to the target value
        else if (root.val == val) {
            // Create a new TreeNode ans and set it to the current node
            TreeNode ans = root;
            // Return the node containing the target value
            return ans;
        }
        // If the target value is less than the current node's value, search in the left subtree
        else if (root.val > val) {
            return searchBST(root.left, val);
        }
        // If the target value is greater than the current node's value, search in the right subtree
        return searchBST(root.right, val);
    }
}
