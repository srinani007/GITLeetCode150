public class Subsequence {
    public boolean isSub(String s, String t){
        // Check if s is a subsequence of t
        if(s.isEmpty() || t.isEmpty()) return false;

        int i = 0;
        int j =0;

        while(j < t.length()){
            if( i < s.length() && s.charAt(i) == t.charAt(j)){
                i++; // move to the next character in s
            }
            j++;

        }
        return i == s.length(); // if we have matched all characters in s, return true
    }
    
}
