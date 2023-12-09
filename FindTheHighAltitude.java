public class FindTheHighAltitude {
    public int largestAltitude(int[] gain) {
        int prefixSum = 0;
        int maxSoFar = 0;
        for(int i =0;i<gain.length;i++){
            prefixSum += gain[i];
            if(prefixSum > maxSoFar){
                maxSoFar = prefixSum;
            }
        }
        return maxSoFar;
    }
}
