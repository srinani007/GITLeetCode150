public class minSubArr {
    public int min(int[] nums, int target){
        if(nums == null || nums.length == 0) return 0;

        int minLen = Integer.MAX_VALUE;
        int left = 0, sum = 0;

        for(int right = 0; right < nums.length; right++){
            sum += nums[right];
            while(sum >= target){
                minLen = Math.min(minLen, right - left + 1);
                sum -= nums[left++];

            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
    public static void main(String[] args) {
        minSubArr obj = new minSubArr();
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(obj.min(nums, target));
    }
}
