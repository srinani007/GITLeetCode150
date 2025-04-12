import java.math.BigInteger;

public class Multistring {

    public String multiply(String num1, String num2){
       /* if (num1.equals("0") || num2.equals("0")) return "0";

        int m = num1.length(), n = num2.length();
        int[] rest = new int[m + n];

        // multiply the digits
        for (int i = m - 1; i >= 0; i--){
            int digit1 = num1.charAt(i) - '0';

            for (int j = n - 1; j >= 0; j--){
                int digit2 = num2.charAt(j) - '0';
                int product = digit1 * digit2;

                int p1 = i + j, p2 = i + j + 1;
                int sum = product + rest[p2];

                rest[p2] = sum % 10;
                rest[p1] += sum / 10;
            }
        }
        // Convert result array to string (skip leading 0s)
        StringBuilder sb = new StringBuilder();
        for (int num : rest){
            if (!(sb.length() == 0 && num == 0)){
                sb.append(num);
            }
        }
        return sb.toString();*/

        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num1);

        return a.multiply(b).toString();
    }

    public static void main(String[] args) {
        Multistring ms = new Multistring();
        String num1 = "123";
        String num2 = "456";
        String product = ms.multiply(num1, num2);
        System.out.println(STR."The product of \{num1} and \{num2} is: \{product}");
    }
}
