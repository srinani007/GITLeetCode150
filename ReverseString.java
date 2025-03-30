public class ReverseString {
    public static String reverse(String s){
        if(s.isEmpty()) return s; // Base case
        return reverse(s.substring(1))+ s.charAt(0); // Recursive call
        // reverse("hello") => reverse("ello") + h => reverse("llo") + e + h => reverse("lo") + l + e + h => reverse("o") + l + l + e + h => o + l + l + e + h
        // reverse("hello") => olleh
        // what does s.substring(1) do? s.substring(1) returns the substring of s starting from index 1 to the end of the string
        // what does s.charAt(0) do? s.charAt(0) returns the character at index 0 of the string s
        // debug the code to see the values of the s
        // System.out.println(s); // hello => ello => llo => lo => o =>

    }
    public static void main(String[] args) {
        System.out.println(reverse("hello")); // Output: olleh
    }
}
