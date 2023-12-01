import java.util.Arrays;

public class CompressedString {

    public static void main(String[] args) {
        char[] chars = {'a','a','a','b','b','c','c','c'};
        System.out.println(compress(chars));
        System.out.println(Arrays.toString(chars));
    }

        // Method to compress the input character array and return the length of the compressed string
        static int compress(char[] chars) {
            // StringBuilder to store the compressed string
            StringBuilder sb = new StringBuilder();

            // Counter for consecutive repeating characters
            int count = 1;

            // Iterate through the input character array
            for (int i = 0; i < chars.length; i++) {
                // Current character
                char ch = chars[i];

                // Check if the current character is the same as the next one
                while (i < chars.length - 1 && chars[i] == chars[i + 1]) {
                    // If yes, increment the count and move to the next character
                    count++;
                    i++;
                }

                // Append the current character to the StringBuilder
                sb.append(ch);

                // If the count is greater than 1, append the count to the StringBuilder
                if (count > 1) {
                    sb.append(count);
                }

                // Reset the count for the next unique character
                count = 1;
            }

            // Convert the StringBuilder to a String (compressed string)
            String compressedString = sb.toString();

            // Copy the compressed string back to the original character array
            for (int i = 0; i < compressedString.length(); i++) {
                char ch = compressedString.charAt(i);
                chars[i] = ch;
            }

            // Return the length of the compressed string
            return compressedString.length();
        }
    }
