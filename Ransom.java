public class Ransom{
    public boolean canConstruct(String ransomNote, String magazine) {
        // create an array to count the frequency of each character in the magazine

        int[] charCount = new int[26]; // for 'a' to 'z'
        for (char c : magazine.toCharArray()){
            charCount[c - 'a']++; // increment the count for this charter
        }
        // check if we can construct the ransom note
        for (char c : ransomNote.toCharArray()){
            charCount[c - 'a']--; // decrement the count for this character
            if(charCount[c - 'a'] < 0){
                return false; // if count goes negative, it means we don't have enough characters
            }
        }
        return true; // if we successfully checked all characters in ransomNote
    }
    public static void main(String[] args) {
        Ransom ransom = new Ransom();
        String ransomNote = "a";
        String magazine = "b";
        boolean result = ransom.canConstruct(ransomNote, magazine);
        System.out.println(STR."Can construct ransom note: \{result}"); // Output: false

        ransomNote = "aa";
        magazine = "ab";
        result = ransom.canConstruct(ransomNote, magazine);
        System.out.println(STR."Can construct ransom note: \{result}"); // Output: false

        ransomNote = "aa";
        magazine = "aab";
        result = ransom.canConstruct(ransomNote, magazine);
        System.out.println(STR."Can construct ransom note: \{result}"); // Output: true
    }
}
