import java.util.HashMap;
import java.util.Map;

public class Isomorphic {
    public boolean isomorphic(String s, String t){
       /* if (s.length() != t.length()) {
            return false; // If lengths are different, they cannot be isomorphic
        }

        int[] sMap = new int[256]; // Map for characters in s
        int[] tMap = new int[256]; // Map for characters in t

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            // Check if the mapping exists and is consistent
            if (sMap[charS] == 0 && tMap[charT] == 0) {
                // If both characters are not mapped yet, map them
                sMap[charS] = charT;
                tMap[charT] = charS;
            } else if (sMap[charS] != charT || tMap[charT] != charS) {
                return false; // Inconsistent mapping found
            }
        }
        return true; // All characters mapped consistently */




        if (s.length() != t.length()) return false;

        Map<Character, Character> mapST = new HashMap<>();
        Map<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (mapST.containsKey(c1)){
                if (mapST.get(c1) != c2) return false;
            } else {
                mapST.put(c1, c2);
            }

            if (mapTS.containsKey(c2)){
                if (mapTS.get(c2) != c1) return false;
            } else {
                mapTS.put(c2, c1);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Isomorphic iso = new Isomorphic();
        String s1 = "egg";
        String t1 = "add";
        boolean result1 = iso.isomorphic(s1, t1);
        System.out.println(STR."Are \"\{s1}\" and \"\{t1}\" isomorphic? \{result1}"); // Output: true

        String s2 = "foo";
        String t2 = "bar";
        boolean result2 = iso.isomorphic(s2, t2);
        System.out.println(STR."Are \"\{s2}\" and \"\{t2}\" isomorphic? \{result2}"); // Output: false

        String s3 = "paper";
        String t3 = "title";
        boolean result3 = iso.isomorphic(s3, t3);
        System.out.println(STR."Are \"\{s3}\" and \"\{t3}\" isomorphic? \{result3}"); // Output: true

        String s4 = "ab";
        String t4 = "aa";
        boolean result4 = iso.isomorphic(s4, t4);
        System.out.println(STR."Are \"\{s4}\" and \"\{t4}\" isomorphic? \{result4}"); // Output: false
    }
}
