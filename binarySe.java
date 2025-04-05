public  class binarySe {
    public int lastOccurrence(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                result = mid; // store answer
                left = mid + 1; // go right to find later target
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }



    public static void main(String[] args) {
        binarySe bs = new binarySe();
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;
        int result = bs.lastOccurrence(nums, target);
        if (result != -1) {
            System.out.println("The last occurrence of " + target + " is at index: " + result);
        } else {
            System.out.println("The target " + target + " is not found in the array.");
        }
    }
}
