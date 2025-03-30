public class Power {
    public static int power(int x, int n){
        if(n == 0) return 1; // base case
        return x * power(x, n - 1); // recursive call x * power(x, n - 1) means => x * x * x * x * ... * x (n times)
        // eg power(2, 3) => 2 * power(2, 2) => 2 * 2 * power(2, 1) => 2 * 2 * 2 * power(2, 0) => 2 * 2 * 2 * 1 => 8
        // eg power(2, 3) = 8 => x = 2, n = 3 : power(2, 3 - 1) => power(2, 2) : => 2 * power(2, 2 - 1) => 2 * power(2, 1) => 2 * power(2, 1 - 1) => 2 * power(2, 0) => 2 * 1 => 2 * 2 => 4

        // debug => x = 2, n = 5 : => power(2, 5 - 1) => power(2, 4) => 2 * power(2, 4 - 1) => 2 * power(2, 3) => 2 * power(2, 3 - 1) => 2 * power(2, 2) => 2 * power(2, 2 - 1) => 2 * power(2, 1) => 2 * power(2, 1 - 1) => 2 * power(2, 0) => 2 * 1 => 2 * 2 => 4 * 2 => 8 * 2 => 16 * 2 => 32

    }
    public static void main(String[] args) {
        System.out.println(power(2, 5)); // Output: 32
    }
}
