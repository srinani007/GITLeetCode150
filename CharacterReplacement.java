import java.util.HashMap;

public class CharacterReplacement {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, maxFreq = 0, maxLength = 0;

        System.out.println("String: " + s + ", k: " + k);
        System.out.println("Initial state: left=" + left + ", maxFreq=" + maxFreq + ", maxLength=" + maxLength);
        
        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            System.out.println("\n--- Right pointer moves to " + right + " (char: " + rightChar + ") ---");
            
            // Update frequency map for current character
            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(rightChar));
            
            System.out.println("After update - Map: " + map);
            System.out.println("Current window: " + s.substring(left, right+1) + 
                             " (size: " + (right - left + 1) + ")");
            System.out.println("maxFreq updated to: " + maxFreq);
            
            // Calculate how many characters would need to be changed
            int changesNeeded = (right - left + 1) - maxFreq;
            System.out.println("Changes needed: " + changesNeeded + " (window size " + (right-left+1) + 
                             " - maxFreq " + maxFreq + ")");
            
            // If more than k characters need to be changed, shrink window
            while (changesNeeded > k) {
                System.out.println("  !!! Need to shrink window (changesNeeded " + changesNeeded + " > k " + k + ")");
                char leftChar = s.charAt(left);
                System.out.println("  Removing left char: " + leftChar + " at position " + left);
                
                map.put(leftChar, map.get(leftChar) - 1);
                left++; // Move left pointer
                
                System.out.println("  New left: " + left);
                System.out.println("  Map after removal: " + map);
                
                // Note: We don't update maxFreq here (optimization)
                changesNeeded = (right - left + 1) - maxFreq;
                System.out.println("  New changes needed: " + changesNeeded);
            }
            
            maxLength = Math.max(maxLength, right - left + 1);
            System.out.println("Current maxLength: " + maxLength);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        CharacterReplacement obj = new CharacterReplacement();
        String s = "AABABBA";
        int k = 1;
        System.out.println("\nFinal result: " + obj.characterReplacement(s, k)); // Output: 4
    }
}