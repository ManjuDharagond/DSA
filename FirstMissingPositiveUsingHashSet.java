import java.util.*;


public class FirstMissingPositiveUsingHashSet {
    public static void main(String[] args) {
            int nums[] = {3,4,-1,1};
        System.out.println(firstMissingPositive(nums));
    }
    static int firstMissingPositive(int[] nums) {
        HashSet<Integer>set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i=1;i<=nums.length;i++){
            Boolean hasNum = set.contains(i);
            if(!hasNum){
                return i;
            }
        }
        return nums.length+1;
    }

}
