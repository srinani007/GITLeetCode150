public class FindMaxSumOfSubArray {
    public double findMax(int[] nums, int k){
        int sum = 0, left =0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            sum += nums[i]; // expand window
        // when window reaches size k
            if(i >= k - 1){
                maxSum = Math.max(maxSum, sum); // update max sum
                sum -= nums[left]; // shrink window
                left++;
            }
        }
        return (double) maxSum / k; // return the max sum found
    }
    public static void main(String[] args) {
        FindMaxSumOfSubArray obj = new FindMaxSumOfSubArray();
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(obj.findMax(nums, k));
    }
}
