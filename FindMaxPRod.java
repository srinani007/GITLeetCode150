public class FindMaxPRod {
   // find the contigous subarray , which as the largest product and return the product
   public int findMax(int[] nums){
    int maxProd = nums[0];
    int minProd = nums[0];
    int result = nums[0];
    for(int i = 1; i < nums.length; i++){
        int temp = maxProd;
        maxProd = Math.max(Math.max(maxProd * nums[i], minProd * nums[i]), nums[i]);
        minProd = Math.min(Math.min(temp * nums[i], minProd * nums[i]), nums[i]);
        result = Math.max(result, maxProd);
    }
    return result;
   }
    public static void main(String[] args) {
         FindMaxPRod obj = new FindMaxPRod();
         int[] nums = {2,3,-2,4};
         System.out.println(obj.findMax(nums));
    }
    
    
}
