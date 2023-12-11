public class FindPeakElements {
    class Solution {
        public int findPeakElement(int[] nums) {
            int peak = 0;
            if(nums.length == 2) {
                peak = nums[0] > nums[1] ? 0:1;
            }

            for(int i = 1;i < nums.length-1;i++)
            {
                if(nums[i-1] < nums[i] && nums[i+1] < nums[i])
                {
                    peak = i;
                }
                else if (nums[i] < nums[i+1]) peak = i+1;
            }
            return peak;
        }
    }
}
