import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = new int[]{1,1,3,4,5,0,2};
        int x[] = twoSum(arr,3);
        System.out.println(x[0] + "," + x[1]);
    }

    static int[] twoSum(int arr[], int target){
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int remaining = target - arr[i];

            if(map.containsKey(remaining)){
                return new int[]{map.get(remaining), i};
            }
            map.put(arr[i], i);
        }
        return new int[]{-1,-1};
    }
}