import java.util.HashMap;

public class fibno {
    private HashMap<Integer, Integer> memo = new HashMap<>();

   /* public int fib(int n){
        if(n <= 1) return n; // base case
        if(memo.containsKey(n)) return memo.get(n); // check if we have already computed fib(n)
        int result = fib(n - 1) + fib(n - 2); // recursive case
        memo.put(n, result); // store the result in the memoization map, put n as key and result as value
        return result; // return the result
    } */
   public int fib(int n){
    if(n <= 1) return n; // base case
    int first = 0, second = 1; // initialize the first two Fibonacci numbers

    for(int i = 2; i <= n; i++){
        int next = first + second;
        first = second;
        second = next; // update the first and second Fibonacci numbers
    }
    return second; // return the nth Fibonacci number   
    // Time Complexity: O(N) where N is the input number
    // Space Complexity: O(1) because we are using only a constant amount of space for the first two Fibonacci numbers
    // This is an iterative approach to calculate the nth Fibonacci number
   }
    public static void main(String[] args) {
        fibno obj = new fibno();
        int n = 10; // example input
        System.out.println("Fibonacci of " + n + " is: " + obj.fib(n)); // Output: 55
    }
    
}
