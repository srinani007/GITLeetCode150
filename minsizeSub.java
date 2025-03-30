public class minsizeSub {
    public int minsub(int target, int[] nums){
        if (nums == null || nums.length == 0) return 0;

        int minLength = Integer.MAX_VALUE;
        int left = 0, sum = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right]; // Expand the window by adding right element

            // Shrink the window from the left while sum is >= target
            while (sum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left]; // Remove leftmost element
                left++; // Move left pointer
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
    public static void main(String[] args) {
        minsizeSub obj = new minsizeSub();
        int target = 7;
        int[] nums = {2,3,1,2,4,3};
        int result = obj.minsub(target, nums);
        System.out.println("Minimum size of subarray: " + result); // Minimum size of subarray: 2
    }
}
