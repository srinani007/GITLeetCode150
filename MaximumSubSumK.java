public class MaximumSubSumK {
    public int maxSum(int[] nums, int k){

        if (nums.length < k ) return  -1; // edge case if array is smaller than k

        int maxSum = 0, windowSum = 0;

        //Calculate sum of first 'k' elements (initial window)
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        maxSum = windowSum;

        // slide the window
        for (int right = k; right < nums.length; right++){
            windowSum += nums[right]; // add new element
            windowSum -= nums[right - k]; // remove old leftmost element
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }

    public static void main(String[] args){
        MaximumSubSumK obj = new MaximumSubSumK();
        int[] nums = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println(obj.maxSum(nums, k)); // output : 9
    }
}
