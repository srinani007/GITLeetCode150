import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getNext(n);
        }
        return n == 1;
    }
    private int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int digit = n % 10; // get last digit
            n = n / 10; // why this n : to remove last digit
            totalSum += digit * digit; // square the digit and add to totalSum
        }
        return totalSum; // return 16
    }
    public static void main(String[] args) {
        HappyNumber hn = new HappyNumber();
        int n = 4; // Example number
        boolean result = hn.isHappy(n);
        System.out.println(STR."Is \{n} a happy number? \{result}");
    }

}
