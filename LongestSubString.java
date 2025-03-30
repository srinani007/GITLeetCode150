import java.util.HashMap;

public class LongestSubString {
    public int characterReplace(String s, int k){
        if (s == null || s.isEmpty()) return 0;

        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, maxFreq = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++){
            char rightChar = s.charAt(right);
            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(rightChar));


            //if window size - maxFreq > k, it means we need more than k replacement - shrink window
            while ((right - left + 1) - maxFreq > k){
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
