package com.example;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) { // iterate through the array
            int compliment = target - nums[i]; // calculate the compliment

            if (map.containsKey(compliment)) { // check if the compliment exists in the map
                return new int[] { map.get(compliment), i }; // return the indices
            }
            map.put(nums[i], i); // store the number and its index in the map
        }
        return new int[] { -1, -1 }; // return -1 if no solution is found
    }

    // This method finds two indices in the array such that their values add up to
    // the target.
    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] nums = { 3, 2, 4 };
        int target = 6;
        int[] result = ts.twoSum(nums, target);

        if (result[0] != -1) {
            System.out.println("Indices of the two numbers are: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No two numbers add up to the target.");
        }
    }
}
