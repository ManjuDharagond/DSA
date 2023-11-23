import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int nums[] = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void sortColors(int[] nums) {
        int low=0,mid=0,high= nums.length-1;

        while(mid<=high){

            if(nums[mid] == 1){
                mid++;
            }else if(nums[mid] == 0){
                swap(nums, low, mid);
                low++;
                mid++;
            }else{
                swap(nums,mid, high);
                high--;
            }
        }

    }
    static void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
