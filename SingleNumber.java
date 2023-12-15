import java.util.*;
public class SingleNumber {
    class Solution {
        public int singleNumber(int[] nums) {
            HashMap<Integer,Integer> map = new HashMap<>();

            for(int i=0;i<nums.length;i++){
                map.put(nums[i], map.getOrDefault(nums[i],0)+1);
            }

            for(int i=0;i<nums.length;i++){
                int count = map.get(nums[i]);
                System.out.println(count);
                if(count<2){
                    return nums[i];
                }
            }
            return 0;
        }
    }
}
