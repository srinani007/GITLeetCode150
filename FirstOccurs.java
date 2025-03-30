public class FirstOccurs {
    public int strStr(String haystack, String needle){
        if( needle.isEmpty()) return 0; // if needle is empty, return 0
        if (haystack.length() < needle.length()) return -1;  // if haystack is shorter than needle, return -1
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++){
            if(haystack.substring(i, i + needle.length()).equals(needle)){ // check if the substring of haystack from index i to i + needle.length()is equal to needle
                return i; // if the substring of haystack from index i to i + needle.length() is equal to needle, return i 
            }
        }
        return -1; // if needle is not found in haystack, return -1
    }
    public static void main(String[] args) {
        FirstOccurs obj = new FirstOccurs();
        String haystack = "hello";
        String needle = "ll";
        System.out.println(obj.strStr(haystack, needle)); // 2
    }
}
