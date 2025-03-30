public class ReveseWord {
    public String reverseWords(String s){
        StringBuilder result = new StringBuilder(); // use StringBuilder to build the string efficiently

        int i = s.length() - 1; // start from the end of the string

        while(i >= 0){
            // skip any trailing spaces
            while(i >= 0 && s.charAt(i) == ' '){
                i--; // move left until we find a non-space charater
            }
            if( i < 0) break; // if we reach the beginning of the string, break the loop

            // find the end of the word
            int j = i; // set j to the current position of i 
            while(i >= 0 && s.charAt(i) != ' '){
                i--; // move left until we find a space character
            }

            result.append(s.substring(i+1, j +1)); // append the word to the result
        }
        return result.toString(); // convert stringbuilder to string and return it, trimming any leading or trailing spaces 
    }
    public static void main(String[] args) {
        ReveseWord obj = new ReveseWord();
        String s = "the sky is blue"; // input string with leading and trailing spaces
        System.out.println(obj.reverseWords(s)); // "World! Hello"
    }
    
}
