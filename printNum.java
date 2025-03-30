public class printNum {
    public static void printN(int n){
        if(n < 1) return; // base case means: if n is less than 1, we return without doing anything
        
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
                // print numbers from 1 to n in each row
            }
            System.out.println(); // move to the next line after printing each row
        }

    }
    public static void main(String[] args) {
        printN(5);

    }
    
}
