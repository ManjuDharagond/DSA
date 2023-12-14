public class ProductOfArrayExceptItself {
    class Solution {
        public int[] productExceptSelf(int[] nums) {
            // Initialize an array to store the product of all elements to the left of each element
            int[] ans = new int[nums.length];

            // Initialize variables to keep track of the product to the left and right of each element
            int leftProd = 1;
            int rightProd = 1;

            // Calculate the product of all elements to the left of each element and store it in the 'ans' array
            for (int i = 0; i < nums.length; i++) {
                ans[i] = leftProd;
                leftProd *= nums[i];
            }

            // Calculate the product of all elements to the right of each element and update the 'ans' array
            for (int i = nums.length - 1; i >= 0; i--) {
                ans[i] *= rightProd;
                rightProd *= nums[i];
            }

            // Return the final array containing the product of all elements except self
            return ans;
        }
    }
}
