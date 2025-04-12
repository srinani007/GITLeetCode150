import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

    public List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) return new ArrayList<>();

        int[] nums1 = new int[nums.length + 1];
        System.arraycopy(nums, 0, nums1, 0, nums.length);
        nums1[nums1.length - 1] = nums[nums.length - 1] + 2;

        int l = 0;
        List<String> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums1[i] != nums1[i + 1] - 1) {
                StringBuilder str = new StringBuilder();
                if (i != l) {
                    str.append(nums1[l]).append("->").append(nums1[i]);
                } else {
                    str.append(nums[l]);
                }
                ans.add(str.toString());
                l = i + 1;
            }
        }

        return ans;
    }

    // ✅ MAIN METHOD MUST BE INSIDE CLASS + STATIC
    public static void main(String[] args) {
        SummaryRanges sr = new SummaryRanges();
        int[] nums = {0, 1, 2, 4, 5, 7};
        List<String> result = sr.summaryRanges(nums);
        System.out.println("Summary Ranges: " + result);
    }
}
