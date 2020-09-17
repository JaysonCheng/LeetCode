package LeetCode;

public class containerWithMostWater {

    public static int maxArea(int[] height) {

        int leftWall = 0;
        int rightWall = height.length - 1;
        int maxArea = Integer.MIN_VALUE;
        while(leftWall < rightWall) {
            int min = Math.min(height[leftWall], height[rightWall]);
            int area = min * (rightWall - leftWall);
            maxArea = Math.max(area, maxArea);
            if(height[leftWall] < height[rightWall]) {
                leftWall++;
            } else {
                rightWall--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = {2,3,10,5,7,8,9};
        maxArea(height);
        int res = maxArea(height);
        System.out.println(res);
    }
}
