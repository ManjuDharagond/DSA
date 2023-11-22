import java.util.*;

public class NumberOfPairs {
    public static void main(String[] args) {
        int nums[] = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));
    }
    static int numIdenticalPairs(int[] nums) {
        int ans = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int currInt : nums){
            int currIntCount = map.getOrDefault(currInt, 0);
            ans += currIntCount;
            map.put(currInt, currIntCount+1);
        }
        return ans;
    }
}
