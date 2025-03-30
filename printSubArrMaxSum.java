public class printSubArrMaxSum {
    // print the subarray with maximum sum
    public void printMAx(int[] nums) {
        int sum = 0; // sum of the subarray
        int maxSum = Integer.MIN_VALUE;
        int start = 0; // start of the subarray
        int end = 0; // end of the subarray
        int s = 0; // temporary start of the potential max sum subarray

        System.out.println("Starting Kadane's Algorithm Debug Mode 🚀");
        
        for (int i = 0; i < nums.length; i++) {
            System.out.println("\nProcessing nums[" + i + "] = " + nums[i]);

            sum += nums[i];
            System.out.println("Current sum: " + sum);

            if (sum > maxSum) {
                maxSum = sum;
                start = s;
                end = i;
                System.out.println("New Maximum Found! maxSum = " + maxSum);
                System.out.println("Start index updated to: " + start);
                System.out.println("End index updated to: " + end);
            }

            if (sum < 0) {
                System.out.println("Sum dropped below 0, resetting sum and updating start index...");
                sum = 0;
                s = i + 1;
                System.out.println("New potential start index: " + s);
            }
        }

        System.out.println("\nFinal Result:");
        System.out.println("Subarray with Maximum Sum = " + maxSum);
        System.out.print("Subarray Elements: ");
        for (int i = start; i <= end; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\nDebugging Complete ✅");
    }

    public static void main(String[] args) {
        printSubArrMaxSum obj = new printSubArrMaxSum();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        obj.printMAx(nums);
    }
}
