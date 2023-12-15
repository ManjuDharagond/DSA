import java.util.*;

public class SingleNumber {

    // Solution class encapsulating the logic
    class Solution {

        // Method to find the single number in the array
        public int singleNumber(int[] nums) {
            // Create a HashMap to store the count of each number
            HashMap<Integer, Integer> map = new HashMap<>();

            // Iterate through the array and update the count in the map
            for (int i = 0; i < nums.length; i++) {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }

            // Iterate through the array again to find the number with count less than 2
            for (int i = 0; i < nums.length; i++) {
                int count = map.get(nums[i]);
                System.out.println(count);

                // If count is less than 2, it is the single number
                if (count < 2) {
                    return nums[i];
                }
            }

            // If no single number is found, return 0
            return 0;
        }
    }
}
