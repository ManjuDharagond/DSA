import java.util.Arrays;

public class MoveAllZerosEnd {
    public static void main(String[] args) {
        int nums[] = {0,1,2,0,3,4,0};
        helper(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void helper(int nums[]){
        if(nums.length == 1){
            return;
        }

        int nonZeroIndex = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }

        while(nonZeroIndex<nums.length){
            nums[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
    }
}
