public class ContainerWater {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1; // initialize left and right pointer
        int maxWater = 0; // variable to store the maximum water area

        while(left < right) {
            int water = Math.min(height[left], height[right]) * (right - left); // calcuate the water area between left and right
            maxWater = Math.max(maxWater, water); // update maxWater if the current water are is greater

            // move the pointer of the shorter height towrds the center
            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxWater; // return the maximum water area
    }
    public static void main(String[] args) {
        ContainerWater obj = new ContainerWater();
        int[] height = {1,8,6,2,5,4,8,3,7};
        int maxArea = obj.maxArea(height);
        System.out.println("Maximum water area: " + maxArea); // Maximum water area: 49
    }
}
