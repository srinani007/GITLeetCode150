public class LongTest1 {
    public int longSub(String s){
        int maxLen = 0; // variable to store the maximum length of the substring

        for(int i = 0; i < s.length(); i++){
            StringBuilder sb = new StringBuilder();
            for(int j = i; j < s.length(); j++){
                if(sb.indexOf(String.valueOf(s.charAt(j))) != -1){
                    break;
                }
                sb.append(s.charAt(j));
                maxLen = Math.max(maxLen, sb.length()); // update maxLen if the current substring is longer
            }
        }
        return maxLen; // return the maximum length of the substring
    }
    public static void main(String[] args) {
        LongTest1 obj = new LongTest1();
        String s = "abcabcbb";
        int maxLength = obj.longSub(s);
        System.out.println("Maximum length of substring without repeating characters: " + maxLength); // Maximum length of substring without repeating characters: 3
    }
}
