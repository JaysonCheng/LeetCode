package LeetCode;

import java.util.Arrays;

public class thirdMaximumNumber {

    public static int thirdMax(int[] nums) {
        if(nums.length == 0) {
            return 0;
        } else if(nums.length == 1) {
            return nums[0];
        }

        Arrays.sort(nums);
        int j = nums.length - 1;
        int maxNum = nums[j];
        int count = 2;
        for(int i = nums.length - 2; i >= 0; i--) {
            if(nums[i] != nums[i+1]) {
                count--;
            }
            if(count == 0) {
                return nums[i];
            }
        }
        return maxNum;
    }

    public static void main(String[] args) {
        int[] nums = {4};
        thirdMax(nums);
        int res = thirdMax(nums);
        System.out.println(res);
    }
}
