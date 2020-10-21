package LeetCode;

import java.util.Arrays;

public class ArrayPartitionI {

    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for(int i = 0; i < nums.length; i+=2) {
            ans += nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7};
        arrayPairSum(nums);
        int res = arrayPairSum(nums);
        System.out.println(res);
    }
}
