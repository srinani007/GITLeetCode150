public class Subsets {
    public static void subsets(String s, String current, int index){
        if(index == s.length()){
            System.out.println(current);
            return;
        }
        subsets(s, current + s.charAt(index), index + 1); // include the current character
        subsets(s, current, index + 1); // exclude the current character
    }
    public static void main(String[] args) {
        String s = "abc";
        subsets(s, "", 0);
    }
}
