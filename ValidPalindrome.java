

public class ValidPalindrome {
    public boolean isPalindrone(String s){

        // step 1: remove all non-alphanumeric characters and conevert to lowercase
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) { // check if the character is alphanumeric
                sb.append(Character.toLowerCase(c)); // convert to lowercase and append to sb
            }
        }
        String filteredString = sb.toString(); // convert sb to string

        // step 2: use two pointers to check if the string is a palindrome
        int left = 0; // initialize left pointer to the start of the string
        int right = filteredString.length() - 1; // initialize right pointer to the end of the string
       while(left < right){
        if(filteredString.charAt(left) != filteredString.charAt(right)){
            return false;
        }
        left++;
        right--;
       }
        return true; // if all characters are equal, return true
        
    }  
    public static void main(String[] args) {
        ValidPalindrome obj = new ValidPalindrome();
        String s = "0P";
        System.out.println(obj.isPalindrone(s)); // true
    }
}
