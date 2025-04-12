import java.util.HashMap;

public class containsNearbyDuplicate {
    public boolean contains(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){

            if (map.containsKey(nums[i])){
                int j = map.get(nums[i]);
                if (i - j <= k) {
                    return true; // found a duplicate within the range
                }
            }
            map.put(nums[i], i); // store the index of the current number
        }
        return false; // no duplicates found within the range
    }
    public static void main(String[] args) {
        containsNearbyDuplicate cnd = new containsNearbyDuplicate();
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        boolean result = cnd.contains(nums, k);
        System.out.println(STR."Contains nearby duplicate: \{result}");
    }
}
