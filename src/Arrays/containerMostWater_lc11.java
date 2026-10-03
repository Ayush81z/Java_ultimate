package Arrays;

public class containerMostWater_lc11 {
    public static void main(String[] args) {
        int []height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        //two pointer index
        int left = 0;
        int right = height.length - 1;

        //max value initialization
        int maxVal = Math.min(height[left] , height[right]) * right - left;

        for (int i = 0; i < height.length ; i++) {
            //to calculate the area we need the distance b/w the two points , also the container would only be able to hold the lower value among the values
            int low = Math.min(height[left] , height[right]);
            int distance = right - left;

            if (low * distance > maxVal) {
                maxVal = low * distance;
            }

            if (height[left] < height[right]) left++;
            else right--;
        }
        return maxVal;
    }
}
