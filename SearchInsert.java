public class SearchInsert {


        /**
         * Searches for the target value in the given array and returns its index or the index where it should be inserted.
         *
         * @param nums   The array to search/insert into. Assumes the array is sorted in ascending order.
         * @param target The target value to search/insert.
         * @return The index of the target value if found, or the index where it should be inserted.
         */
        static int searchInsert(int[] nums, int target) {
            // Iterate through the array
            for (int i = 0; i < nums.length; i++) {
                // Check if the current element is equal to the target
                if (nums[i] == target) {
                    // If equal, return the index of the target
                    return i;
                } else if (nums[i] > target) {
                    // If the current element is greater than the target, return the current index
                    // This is the index where the target should be inserted to maintain sorted order
                    return i;
                }
            }

            // If the target is greater than all elements in the array, return the index after the last element
            return nums.length;
        }

        // Optional main method for testing
        public static void main(String[] args) {
            int nums[] = {1,3,5,6};
            int target = 5;
            System.out.println(searchInsert(nums, target));
        }
    }
