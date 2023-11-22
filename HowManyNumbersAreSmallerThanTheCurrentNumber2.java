import java.util.Arrays;

public class HowManyNumbersAreSmallerThanTheCurrentNumber2 {
    public static void main(String[] args) {
        int nums [] = {8,1,2,2,3};
        int result[] = smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(result));
    }


    static int[] smallerNumbersThanCurrent(int[] nums) {
        // Step 1: Initialize an array for counting occurrences of each number
        int smaller[] = new int[101];

        // Step 2: Count occurrences of each number in the given array
        for (int i = 0; i < nums.length; i++) {
            smaller[nums[i]]++;
        }

        // Step 3: Create a cumulative sum array for the count array
        for (int i = 1; i < 101; i++) {
            smaller[i] = smaller[i] + smaller[i - 1];
        }

        // Step 4: Update the given array with the count of smaller numbers
        for (int i = 0; i < nums.length; i++) {
            int position = nums[i];
            if (position == 0) {
                nums[i] = 0;
            } else {
                nums[i] = smaller[position - 1];
            }
        }

        // Step 5: Return the array with updated counts
        return nums;
    }
}
