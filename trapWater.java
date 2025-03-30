public class trapWater {
    public int trap(int[] height){
        if(height.length == 0) return 0; // if the length of the height array is 0, return 0

        int left = 0, right = height.length - 1; // set the left and right pointers
        int leftMax = 0, rightMax = 0; // set the leftMAx and rightMax to 0
        int totalWater = 0; // set the totalWater to 0

        while(left < right){
            if(leftMax < rightMax){
                left++; // imcrement the left pointer
                leftMax = Math.max(leftMax, height[left]); // get the maximum value of the leftMax and the height at the left pointer
                totalWater += leftMax - height[left]; // add the difference between the leftMax and the height at the left pointer to the totalwater
            }else{
                right--; // decrement the right pointer
                rightMax = Math.max(rightMax, height[right]); // get the maximium value of the rightMax and the height at the right pointer
                totalWater += rightMax - height[right]; //add the difference between the rightMax and the height at the right pointer to the totalWater            
            }
        }
        return totalWater;
    }
    public static void main(String[] args) {
        trapWater obj = new trapWater();
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(obj.trap(height)); // 6
    }
}
