public class FixedK {
    //Maximum Sum of a Subarray of Fixed Size K
    public double findMax(int[] nums, int k){
        int sum =0, left = 0;
        int maxSum = Integer.MIN_VALUE;

        // expand window and calculate sum of first k elements
        for(int i = 0; i < k; i++){ // first k elements what we have to consider : 1 12 -5 -6
            // sum = sum + nums[i];
            // sum = 0 + 1 = 1
            // sum = 1 + 12 = 13
            // sum = 13 + -5 = 8
            // sum = 8 + -6 = 2
            sum += nums[i];// expand window
        }
        maxSum = sum; // initialize maxSum with sum of first k elements
        // when window reaches size k
        // sum = 2, left = 0
        // sum = 2, left = 1
        // sum = 2, left = 2
        // sum = 2, left = 3
        // slide window
        for(int i = k; i < nums.length; i++){ // 4 < 6 // 5 < 6 
            // sum = sum + nums[i] - nums[left];
            // sum = 2 + 50 - 1 = 51 - 1 = 50
            // sum = 50 + 3 - 12 = 53 - 12 = 41
            sum += nums[i]; // expand window
            sum -= nums[left]; // shrink window
            left++;// slide window
            maxSum = Math.max(maxSum, sum); // update maxSum
            // maxSum = 50
            // maxSum = 53
        }
        return (double)maxSum/k; // return the max sum found
        // 53 / 4 = 13.25
        // 50 / 4 = 12.5
        // 12.5
    }
    public static void main(String[] args) { // main method
        FixedK obj = new FixedK();  // create object of FixedK class
        int[] nums = {1,12,-5,-6,50,3}; // create an array of integers
        int k = 4;  // k = 4
        System.out.println(obj.findMax(nums, k));   // print the result
    }
}
