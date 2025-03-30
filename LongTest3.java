public class LongTest3 {
   public int lenSub(String s){
    int maxLen = 0;

    for( int right =0, left =0; right < s.length(); right++){
        int index = s.indexOf(s.charAt(right), left); // find the index of the current character from the left pointer
        if(index != right){
            left = index + 1;
        }
        maxLen = Math.max(maxLen, right - left + 1); // update maxLen if the current substring is longer
    }
    return maxLen; // return the maximum length of the substring
   }
    public static void main(String[] args) {
          LongTest3 obj = new LongTest3();
          String s = "abcabcbb";
          int maxLength = obj.lenSub(s);
          System.out.println("Maximum length of substring without repeating characters: " + maxLength); // Maximum length of substring without repeating characters: 3
     }
}
