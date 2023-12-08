import java.util.*;
public class RightSideViewOfBinaryTree {
    class Solution {
        public List<Integer> rightSideView(TreeNode root) {
            if(root == null){
                return new ArrayList<>();
            }
            int level = 0;
            List<Integer> result = new ArrayList<>();
            helper(root, level, result );
            return result;
        }
        public void helper(TreeNode root, int level, List<Integer>result){
            if(root == null){
                return;
            }
            if(level == result.size()){
                result.add(root.val);
            }
            helper(root.right, level+1, result);
            helper(root.left, level+1, result);
        }
    }
}
