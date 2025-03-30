public class TwoPointer2 {
    public int[] twoSum(int[] nums, int target){
        int result[] = new int[2]; // create an array to store the indice of the two numbers
        int left =0; 
        int right = nums.length - 1; 

        while( left < right){
            int sum = nums[left] + nums[right]; 
            if(sum == target){
                result[0] = left + 1;
                result[1] = right + 1;
                break;
            } else if( sum > target){
                right--;

            } else{
                left++;
            }
        }
        return  result;
    }
    public static void main(String[] args) {
        TwoPointer2 obj = new TwoPointer2();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = obj.twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]); // Indices: 1, 2
    }
}
