public class binarySe {
    public int binarySearch(int[] nums, int target){
        int left = 0, right = nums.length - 1;

        while(left <= right) {
            int mid = left + (right - left) / 2;


            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        binarySe bs = new binarySe();
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;
        int result = bs.binarySearch(nums, target);
        if (result != -1) {
            System.out.println("Element " + target + " found at index: " + result);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}
