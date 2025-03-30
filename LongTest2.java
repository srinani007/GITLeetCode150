import java.util.HashMap;
import java.util.Map;

public class LongTest2 {
    public  int test2(String s){
        int maxLen = 0;

        Map<Character, Integer> charIn = new HashMap<>();

        for(int right = 0, left = 0; right < s.length(); right++){
            char curr = s.charAt(right);
            if(charIn.containsKey(curr) && charIn.get(curr) >= left){
                left = charIn.get(curr)+ 1; // move left pointer to the right of the last occurrence of curr
            }
            maxLen = Math.max(maxLen, right - left + 1); // update maxLen if the current substring is longer
            charIn.put(curr, right); // update the last occurrence of curr
        }
        return maxLen; // return the maximum length of the substring
    }
    public static void main(String[] args) {
        LongTest2 obj = new LongTest2();
        String s = "abcabcbb";
        int maxLength = obj.test2(s);
        System.out.println("Maximum length of substring without repeating characters: " + maxLength); // Maximum length of substring without repeating characters: 3
    }
}
