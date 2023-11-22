import java.util.HashSet;

public class CompressString {

    static int minimizeStringLength2(String s){
        if(s.length()==1){
            return 1;
        }
        if(s.length()==2){
            if(s.charAt(0)==s.charAt(1)){
                return 1;
            } else{
                return 2;
            }
        }
        StringBuilder str = new StringBuilder();
        str.append(s);
        for(int i=0;i<str.length()-1;i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i) == str.charAt(j)){
                    str.deleteCharAt(j);
                    j--;
                }
            }
        }
        return str.length();
    }


    static int minimizeStringLengthHashSet(String s){
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(!set.contains(s.charAt(i))){
             set.add(s.charAt(i));
            }
        }
        return set.size();
    }


    public static void main(String[] args) {
        String s = "aaabc";
        System.out.println(minimizeStringLengthHashSet(s));
//        System.out.println(minimizeStringLength2(s));
//        System.out.println(minimizedStringLength(s));
    }

    static int minimizedStringLength(String s) {
        if(s.length()==1){
            return 1;
        }
        if(s.length()==2){
            if(s.charAt(0)==s.charAt(1)){
                return 1;
            } else{
                return 2;
            }
        }
        int i=1;
        StringBuilder str = new StringBuilder();
        str.append(s);
        while(i<str.length()){

            int m=i-1,n=i+1;

            while(m>0 || n<str.length()){

                if(m>=0 && str.charAt(m)==str.charAt(i)){
                    str.deleteCharAt(m);
                }
                if(m>0){
                    m--;
                }
                if(n<str.length() && str.charAt(n)==str.charAt(i)){
                    str.deleteCharAt(n);
                }
                if(n<str.length()){
                    n++;
                }
            }
            i++;
        }
        return str.length();
    }
}
