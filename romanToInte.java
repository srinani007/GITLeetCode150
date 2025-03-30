
import java.util.HashMap;
import java.util.Map;

public class romanToInte{
    public int romanTOInteger(String s){
        Map<Character, Integer> roam = new HashMap<>();
        roam.put('I', 1);
        roam.put('V', 5);
        roam.put('X', 10);
        roam.put('L', 50);
        roam.put('C', 100);
        roam.put('D', 500);
        roam.put('M', 1000);

        int total = 0; 
        int prev = 0;

        for(char c : s.toCharArray()){ // convert the string to a character array
            int curr = roam.get(c); // get the value of the character
            total += (curr > prev) ? (curr - 2 * prev) : curr; //MCMXCIV 
            // if the current value is greater than the previous value, subtract the previous value from the current value and add it to the total, else add the current value to the total
            prev = curr;
        }
        return total;
    }
    public static void main(String[] args) {
        romanToInte obj = new romanToInte();
        String s = "MCMXCIV";
        System.out.println(obj.romanTOInteger(s)); // 1994
    }
    
}
