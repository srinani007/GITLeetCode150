import java.util.HashSet;

public class LongConsecutiveSeq {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longestStreak = 0;

        for( int num : set) {
            // check if it's the start of a sequence
            if (!set.contains(num - 1)) {
                int current = num;
                int count = 1;

                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }
                longestStreak = Math.max(longestStreak, count);
            }
        }
        return longestStreak;
    }
    public static void main(String[] args) {
        LongConsecutiveSeq lcs = new LongConsecutiveSeq();
        int[] nums = {100, 4, 200, 1, 3, 2};
        int result = lcs.longestConsecutive(nums);
        System.out.println("The length of the longest consecutive sequence is: " + result);
    }
}
