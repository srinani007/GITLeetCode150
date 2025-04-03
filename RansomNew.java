import java.util.HashMap;

public class RansomNew {
    public boolean ransomeNew(String ransom, String magazine){
        HashMap<Character, Integer> freq = new HashMap<>();

        for (char c : magazine.toCharArray()){
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        for (char c : ransom.toCharArray()){
            if (!freq.containsKey(c) || freq.get(c) == 0) return false;
            freq.put(c,freq.get(c) - 1);
        }
        return true;
    }
    public static void main(String[] args) {
        RansomNew ransomNew = new RansomNew();
        // Test cases
        System.out.println(ransomNew.ransomeNew("a", "b"));      // false
        System.out.println(ransomNew.ransomeNew("aa", "ab"));    // false
        System.out.println(ransomNew.ransomeNew("aa", "aab"));   // true
    }
}
