public class ValidPalindrome {
    public static void main(String[] args) {
        String str = "A man, a plan , a canal ! panama";
        str = str.toLowerCase();
        str = str.replaceAll("[^a-zA-Z0-9]", "" );

        int start =0, end=str.length()-1;
        while (start<=end){
            if(str.charAt(start)!=str.charAt(end)){
                System.out.println("Not a valid Palindrome");
                return;
            }else {
                start++;
                end--;
            }
        }
        System.out.println("Valid Palindrome");
    }
}
