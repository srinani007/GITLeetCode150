

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {
    public List<List<Integer>> threeInt(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;

            int j = i + 1, k = nums.length - 1;
            while( j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    // move both pointers to avoid duplicates
                    while(j < k && nums[j] == nums[j + 1]) j++;
                    while(j < k && nums[k] == nums[k - 1]) k--;

                    j++; k--; // move both pointers inward

                } else if(sum < 0){
                    j++; // move left pointer to the right to increase the sum need to bigger sum
                } else {
                    k--; // move right pointer to the left to decrease the sum need to smaller sum
                }

            }

        }
        return result; // return the list of triplets that sum to zero
    }
    public static void main(String[] args) {
        threeSum obj = new threeSum();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = obj.threeInt(nums);
        System.out.println("Triplets that sum to zero: " + result); // Triplets that sum to zero: [[-1, -1, 2], [-1, 0, 1]]
    }
}
