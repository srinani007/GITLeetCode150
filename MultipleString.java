public class MultipleString {

    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0"; // If either number is 0, the product is 0
        }
        int m = num1.length(), n = num2.length();
        int[] result = new int[m + n]; // result array to hold the product
        for (int i = m - 1; i >= 0; i--) { // why i from m-1 to 0? :
            int n1 = num1.charAt(i) - '0'; // convert char to int
            for (int j = n - 1; j >= 0; j--) {
                int n2 = num2.charAt(j) - '0'; // convert char to int
                int sum = n1 * n2 + result[i + j + 1]; // multiply and add to the current position
                result[i + j + 1] = sum % 10; // store the last digit in the current position
                result[i + j] += sum / 10; // carry over the rest to the next position
            }
        }

        // Convert result array to string
        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            if (!(sb.isEmpty() && num == 0)) { // skip leading zeros
                sb.append(num);
            }
        }
        return sb.isEmpty() ? "0" : sb.toString(); // if sb is empty, return "0"
        
    }

    public static void main(String[] args) {
        MultipleString ms = new MultipleString();
        String num1 = "123";
        String num2 = "456";
        String result = ms.multiply(num1, num2);
        System.out.println("The product of \"" + num1 + "\" and \"" + num2 + "\" is: " + result); // Output: 56088
    }
}
