public class Fibonacci {
    public static int fib(int n) {
        if( n <= 1) return n; // Base case
        return fib(n - 1) + fib(n - 2); // Recursive call fib(n - 1) + fib(n - 2) means => fib(n - 1) + fib(n - 2) + fib(n - 3) + fib(n - 4) + ... + fib(0)
        // eg fib(5) => fib(4) + fib(3) => fib(3) + fib(2) + fib(2) + fib(1) => fib(2) + fib(1) + fib(1) + fib(0) + fib(1) + fib(0) + fib(1) => fib(1) + fib(0) + fib(1) + fib(1) + fib(0) + fib(1) + fib(0) + fib(1) => 5
        // eg: fib(5) = 5 => n = 5 fib(5 -1) + fib(5 - 2) => fib(4) + fib(3) => 3 + 2 => 5
    }
    
    public static void main(String[] args) {
        System.out.println(fib(5)); // Output: 5
    }
}
