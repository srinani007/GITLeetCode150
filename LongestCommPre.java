import java.util.Arrays;

public class LongestCommPre {
    public String longestCommonPrefix(String[] strs){
       /*  if(strs == null || strs.length == 0) return ""; // if the array is null or empty, return an empty string
        String prefix = strs[0]; // set the prefix to the first string in the array
        for(int i = 1; i < strs.length; i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() -1); // remove the last character from prefix until it matches the start of the current string
                if(prefix.isEmpty()) return ""; // if the prefix is empty, retun an empyty string
            }
       }
        return prefix; // return the common prefix */

        // Optimized version using StringBuilder for better performance
         // This version avoids creating multiple substring objects and uses StringBuilder to manage the prefix
         
         // The logic remains the same, but we use StringBuilder to handle the prefix
        /* if (strs == null || strs.length == 0) return ""; // if the array is null or empty, return an empty string
        StringBuilder prefix = new StringBuilder(strs[0]); // use StringBuilder for better performance
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix.toString()) != 0) { // check if the current string starts with the prefix
                prefix.setLength(prefix.length() - 1); // remove the last character from prefix
                if (prefix.length() == 0) return ""; // if the prefix is empty, return an empty string
            }
        }
        return prefix.toString(); // convert StringBuilder to String and return it */

        /* // Final optimized version using character comparison
        if (strs == null || strs.length == 0) return ""; // if the array is null or empty, return an empty string
        int minLength = Integer.MAX_VALUE; // find the minimum length of the strings
        for (String str : strs) {
            minLength = Math.min(minLength, str.length()); // update the minimum length
        }
        StringBuilder prefix = new StringBuilder(); // use StringBuilder for better performance
        for (int i = 0; i < minLength; i++) { // iterate through the characters up to the minimum length
            char currentChar = strs[0].charAt(i); // get the character from the first string
            for (int j = 1; j < strs.length; j++) { // compare with all other strings
                if (strs[j].charAt(i) != currentChar) { // if characters do not match
                    return prefix.toString(); // return the common prefix found so far
                }
            }
            prefix.append(currentChar); // append the matching character to the prefix
        }
        return prefix.toString(); // return the final common prefix */
        /* if (strs == null || strs.length == 0) return ""; // if the array is null or empty, return an empty string
        for(int i = 0; i < strs[0].length(); i++){
            char c = strs[0].charAt(i); // get the character from the first string
            for(int j = 1; j < strs.length; j++){
                if(i >= strs[j].length() || strs[j].charAt(i) != c){
                    return strs[0].substring(0, i); // if characters do not match or index exceeds length, return the common prefix found so far 
                }
            }
        }
        return strs[0]; // if all characters match, return the first string as the common prefix */

        // Final optimized version using character comparison
        StringBuilder pre = new StringBuilder(); // use StringBuilder for better performance

        //sort the array to ensure the first and last strings are the most different
        Arrays.sort(strs); // sort the array to ensure the first and last strings are the most different

        char[] first = strs[0].toCharArray(); // convert the first string to a character array
        char[] last = strs[strs.length - 1].toCharArray(); //convert the last string to a character array

        for( int i = 0; i < first.length; i++){ // iterate through the characters up to the minimum length
            if(first[i] != last[i]){ // if characters do not match
                break; // exit the loop
            }
            pre.append(first[i]); // append the matching character to the prefix
        }
        return pre.toString(); // return the final common prefix

    }
    public static void main(String[] args) {
        LongestCommPre obj = new LongestCommPre();
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(obj.longestCommonPrefix(strs)); // "fl"
    }
}
