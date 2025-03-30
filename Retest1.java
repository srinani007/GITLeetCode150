
import java.util.HashMap;

public class Retest1 {
    public int characterReplacement(String s, int k){
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, maxFreq = 0, maxLength = 0;

        for(int right = 0; right < s.length(); right++){
            char rightChar = s.charAt(right);
            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(rightChar));
            // maxFreq is the frequency of the most common character in the current window

            // if the number of characters that need to be changed is greater than k, we need to shrink the window
            // we do this by moving the left pointer to the right until the number of changes needed is less than or equal to k
            while((right - left + 1) - maxFreq > k) {
                char leftChar = s.charAt(left); // get the character at the left pointer
                map.put(leftChar, map.get(leftChar) - 1); // decrement the frequency of the left character
                left++; // move the left pointer to the right
                // we don't need to update maxFreq here because we are only moving the left pointer to shrink the window
            }
            maxLength = Math.max(maxLength, right - left + 1); // update the maximum length of the window
            // we don't need to update maxFreq here because we are only moving the left pointer to shrink the window
            // Note: we are not updating maxFreq here because we are only moving the left pointer to shrink the window
            // the maxFreq will be updated in the next iteration when we move the right pointer
        }
        return maxLength; // return the maximum length of the window
        // Time Complexity: O(N)
        // Space Complexity: O(K) where K is the number of distinct characters in the string
    }
    public static void main(String[] args) {
        Retest1 obj = new Retest1();
        String s = "AABABBA";
        int k = 1;
        System.out.println("Final result: " + obj.characterReplacement(s, k)); // Output: 4
    }
    // Explanation: The longest substring we can get is "AABA" or "ABBA" with one character replacement.
        // "AABA" -> replace the second 'A' with 'B' to get "ABBA"
        // "ABBA" -> replace the first 'B' with 'A' to get "AABA"
        // Both have a length of 4.
        // The longest substring with at most 1 character replacement is "AABA" or "ABBA" with a length of 4.
}
