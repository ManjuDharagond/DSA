public class LongestPalindrome {
    public static void main(String[] args) {
        String word = "kappalot";
        int maxLength = Integer.MIN_VALUE;
        for(int i =0; i<word.length(); i++){
            int length1 = expandAround(word, i, i);
            int length2 = expandAround(word, i, i+1);
            int max = Math.max(length1,length2);
            if(max > maxLength){
                maxLength = max;
            }
        }
        System.out.println(maxLength);
    }

    static int expandAround(String s, int left, int right) {
        while (left >= 0 &&  right< s.length()) {
            if ( s.charAt(left) != s.charAt(right)) {
                return right - left - 1;
            }else {
                left--;
                right++;
            }
        }
        return right-left-1;
    }
}
