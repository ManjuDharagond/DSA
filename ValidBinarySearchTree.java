
// * Definition for a binary tree node.
 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
    TreeNode() {}
     TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
         this.left = left;
         this.right = right;
     }
 }


/**
 * This class provides a solution for determining whether a given binary tree is a valid binary search tree (BST).
 * A binary tree is considered a BST if, for each node, its value is greater than all values in its left subtree
 * and less than all values in its right subtree.
 */
public class ValidBinarySearchTree {

    /**
     * Checks whether the given binary tree is a valid BST.
     *
     * @param root The root of the binary tree.
     * @return True if the tree is a valid BST, false otherwise.
     */
    static boolean isValidBST(TreeNode root) {
        // Initialize the lower and upper bounds for the root.
        Long lower = Long.MIN_VALUE;
        Long upper = Long.MAX_VALUE;

        // Use a helper function to recursively check the validity of the BST.
        return helper(root, lower, upper);
    }

    /**
     * Helper function to recursively check the validity of a binary search tree.
     *
     * @param root   The current node being checked.
     * @param lower  The minimum value allowed for the current node.
     * @param upper  The maximum value allowed for the current node.
     * @return True if the subtree rooted at the current node is a valid BST, false otherwise.
     */
    static boolean helper(TreeNode root, Long lower, Long upper) {
        // If the current node is null, the subtree is a valid BST.
        if (root == null) {
            return true;
        }

        // If the current node's value violates the BST property, return false.
        long val = root.val;
        if (val <= lower || val >= upper) {
            return false;
        }

        // Recursively check the left and right subtrees.
        return helper(root.left, lower, val) && helper(root.right, val, upper);
    }
}
