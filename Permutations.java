

public class Permutations {
    public static void permutations(String s, String result){
        if(s.isEmpty()) {
            System.out.println(result);
            return;
        }
        for(int i = 0; i < s.length(); i++){
            permutations(s.substring(0,i) + s.substring(i + 1), result + s.charAt(i));
            // permutations("abc", "") => permutations("bc", "a") => permutations("c", "ab") => permutations("", "abc") => abc
            // permutations("bc", "a") => permutations("c", "ab") => permutations("", "abc") => abc
            // permutations("c", "ab") => permutations("", "abc")x => abc
        }
    }
    public static void main(String[] args) {
        String s = "abc";
        permutations(s, "");
    }
}
