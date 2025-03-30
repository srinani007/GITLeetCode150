public class productExceptSelfTest2 {
   public int[] productExe(int[] nums){
    int n = nums.length; // length of the array
    int[] result = new int[n]; // array to store the result

    // step 1: calculate the left product for each index
    result[0] = 1; // no element to the left of the first element
    for(int i = 1; i < n; i++){
        result[i] = result[i - 1] * nums[i - 1];
    }

    //step 2: calculate the right product for each index
    int right = 1; // no element to the right of the last element
    for(int i = n - 1; i >= 0; i--){
        result[i] *= right; //multiply the left product with the right product
        right *= nums[i]; // update the right product for the next iteration
    }
    return result;
   }
   public static void main(String[] args) {
    productExceptSelfTest2 obj = new productExceptSelfTest2();
    int[] nums = {1, 2, 3, 4};
    int[] result = obj.productExe(nums);
    for(int i = 0; i < result.length; i++){
        System.out.print(result[i] + " ");
    }
   }
}
