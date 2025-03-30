import java.util.HashMap;

public class LongKDistChar {
    public int LenOfLongSub(String s, int k) {
        if (s == null || s.length() == 0)
            return 0;

        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, maxLen = 0;

        System.out.println("Input String: " + s + ", K: " + k);
        System.out.println("====================================");

        // Move the right hand through the string
        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right); // Get the right character
            System.out.println("Right Pointer at Index: " + right + ", Character: " + rightChar);

            // Add/update character frequency in map
            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);
            System.out.println("Updated Frequency Map: " + map);

            // If the distinct character count exceeds k, shrink the window
            while (map.size() > k) {
                char leftChar = s.charAt(left); // Get the left character
                System.out.println("Shrinking Window: Left Pointer at Index: " + left + ", Character: " + leftChar);

                // Decrement character frequency
                map.put(leftChar, map.get(leftChar) - 1);

                // If character count drops to 0, remove it from the map
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                    System.out.println("Character " + leftChar + " removed from map.");
                }

                left++; // Move left pointer
                System.out.println("New Left Pointer Position: " + left);
            }

            // Calculate max length of valid substring
            maxLen = Math.max(maxLen, right - left + 1);
            System.out.println("Current Max Length: " + maxLen);
            System.out.println("====================================");
            // what is the Final Longest Substring Print the characters of the substring
            System.out.println("Final Longest Substring: " + s.substring(left, right + 1));
            // Print the characters of the substring
            System.out.println("Final Longest Substring Characters: ");
            for (int i = left; i <= right; i++) {
                System.out.print(s.charAt(i) + " ");
            }
            System.out.println();
        }

        // Return the max length
        return maxLen;
        // Time Complexity: O(N)
        // Space Complexity: O(K)
    }

    public static void main(String[] args) {
        LongKDistChar obj = new LongKDistChar();
        String s = "eceba";
        int k = 2;
        int result = obj.LenOfLongSub(s, k);
        System.out.println("Final Longest Substring Length: " + result);
    }
}
