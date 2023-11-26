public class TrappedRainWater {
    static int trappedRainWater(int height[]) {
        int n = height.length, trappedWater = 0;
        //calculate left max bound
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            if (height[i] > leftMax[i-1]) {
                leftMax[i] = height[i];
            } else {
                leftMax[i] = leftMax[i - 1];
            }
        }

        //calculate right max bound
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (height[i] > rightMax[i + 1]) {
                rightMax[i] = height[i];
            } else {
                rightMax[i] = rightMax[i + 1];
            }
        }

        for (int i = 0; i < n; i++) {

            //calculate water level
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            //calculate trapped water
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trappedRainWater(height));
    }
}
