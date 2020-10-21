package LeetCode;

import java.util.Arrays;

public class maximumProductOf3Numbers {
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int a = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        int b = nums[0] * nums[1] * nums[nums.length - 1];

        return Math.max(a,b);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int res = maximumProduct(nums);
        System.out.println(nums);
    }
}
