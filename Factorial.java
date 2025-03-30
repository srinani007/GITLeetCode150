public class Factorial {
    static int fact(int n) {
        if (n == 0) return 1; // Base case
        return n * fact(n - 1); // Recursive call n * fact means => n * (n - 1) * (n -2) * ... * 1
        // eg fact(5) => 5 * fact(4) => 5 * 4 * fact(3) => 5 * 4 * 3 * fact(2) => 5 * 4 * 3 * 2 * fact(1) => 5 * 4 * 3 * 2 * 1 * fact(0) => 5 * 4 * 3 * 2 * 1 * 1
        // fact(5) = 5 * 4 * 3 * 2 * 1 = 120
    }
    public static void main(String[] args) {
        System.out.println(fact(5)); // Output: 120
    }
}
