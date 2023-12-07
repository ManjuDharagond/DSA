import java.util.*;
public class RemovingStarsFromAString_Stack {
    class Solution {
        public String removeStars(String s) {
            Stack<Character>stack = new Stack<>();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i) != '*'){
                    stack.push(s.charAt(i));
                }else{
                    stack.pop();
                }
            }
            StringBuilder str = new StringBuilder();
            while(stack.size()>=1){
                char ch = stack.pop();
                str.append(ch);
            }
            return str.reverse().toString();
        }
    }
}
