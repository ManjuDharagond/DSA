public class GCDOfString {

        public int gcd(int a,int b)
        {
            if(b==0)
                return a;

            return gcd(b,a%b);
        }
        public String gcdOfStrings(String str1, String str2)
        {
            String s=str1+str2;
            if(!s.equals(str2+str1))return "";

            return str1.substring(0,gcd(str1.length(),str2.length()));
        }

}
