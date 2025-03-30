


public class productOfArray {
    public int[] productExceptSelf(int[] nums){
        int left[] = new int[nums.length];
        int right[] = new int[nums.length];
        int result[] = new int[nums.length];

        int temp = 1;
        for(int i = 0; i < nums.length; i++){
            left[i] = temp;
            temp *= nums[i];
        }
        temp = 1; // Reset temp for the right array calculation
        for(int i = nums.length - 1; i >= 0; i--){
            right[i] = temp; // store the right product
            temp *= nums[i];
        }

        for(int i = 0; i < nums.length; i++){
            result[i] = left[i] * right[i];
        }
        return result;
    }
    public static void main(String[] args) {
        productOfArray obj = new productOfArray();
        int[] nums = {1, 2, 3, 4};
        int[] result = obj.productExceptSelf(nums);
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " "); // except the elements [24,12,8,6]
        }
    }
    
}
