
import java.util.HashSet;

public class LengthOf {
    public int len(String s){
        HashSet<Character> set = new HashSet<>();
        int left = 0, maxLen = 0;

        for(int right = 0; right < s.length(); right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left)); // explain : remove the left character from the set, so that we can move the left pointer to the right
                left++;
            }
            set.add(s.charAt(right)); // add the right character to the set, so that we can move the right pointer to the right
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        LengthOf obj = new LengthOf();
        String s = "abcabcbb";
        System.out.println(obj.len(s));
    }
}
