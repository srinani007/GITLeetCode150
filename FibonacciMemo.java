
import java.util.HashMap;

public class FibonacciMemo {
    public static HashMap<Integer, Integer> memo = new HashMap<>();//
    public static int fib(int n){
        if(n <= 1) return n; // Base case
        if(memo.containsKey(n)) return memo.get(n); // why we need to check if the memo contains the key n. If the memo contains the key n, return the value of n
        int result = fib(n - 1) + fib(n - 2); // Recursive call
        memo.put(n, result); // store the result in the memo what does n and result represent? n is the key and result is the value
        return result;
        // debug the code to see the values of the memo
        // System.out.println(memo); // {2=1, 3=2, 4=3, 5=5, 6=8, 7=13, 8=21, 9=34, 10=55}
    }
    public static void main(String[] args) {
        System.out.println(fib(10)); // Output: 5
    }

}
