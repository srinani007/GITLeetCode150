public class IntToRoma {
    public String intToRoString(int num) {
        int[] values =    {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder result = new StringBuilder(); // use Stringbulder to build the string efficiently
        for(int i = 0; i < values.length; i++){
            while(num >= values[i]){
                result.append(symbols[i]); // append the symbol to the result
                num -= values[i]; // subtract the value from the input number
            }
        }
        return result.toString(); // convert the stringbuilder to string and return it
    }
    public static void main(String[] args) {
        IntToRoma obj = new IntToRoma();
        int num = 1995; // input number as a string
        System.out.println(obj.intToRoString(num)); // MCMXCIV
    }
}
