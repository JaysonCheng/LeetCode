package LeetCode;

import java.util.Arrays;

public class ShortestUnsortedContinuousArray {

    public static int findUnsortedSubarray(int[] nums) {
        if(nums.length < 2) {
            return 0;
        }

        int[] sortedNums = nums.clone();
        Arrays.sort(sortedNums);

        int i = 0;
        int j = nums.length - 1;
        int count = nums.length;
        while(i <= j) {
            if(nums[i] != sortedNums[i] && nums[j] != sortedNums[j]) {
                break;
            }
            if(nums[j] == sortedNums[j] && i != j) {
                count--;
                j--;
            }
            if(nums[i] == sortedNums[i]) {
                count--;
                i++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 1,2,3,3,3 };
        int res = findUnsortedSubarray(nums);
        System.out.println(res);
    }
}
