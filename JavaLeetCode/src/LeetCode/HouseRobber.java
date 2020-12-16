package LeetCode;

import java.util.HashMap;

public class HouseRobber {

    public static int findMaxMoney(int[] nums, int i, HashMap<Integer, Integer> mem) {
        if(i > nums.length - 1) {
            return 0;
        }
        if(i == nums.length - 1) {
            return nums[i];
        }
        if(mem.containsKey(i)) {
            return mem.get(i);
        }

        int includeCurrent = nums[i] + findMaxMoney(nums, i + 2, mem);
        int excludeCurrent = findMaxMoney(nums, i + 1, mem);
        int maxMoney = Math.max(includeCurrent, excludeCurrent);

        mem.put(i, maxMoney);
        return maxMoney;
    }

    public static int rob(int[] nums) {
        // RECURSIVE BOTTOM UP DP
        HashMap<Integer, Integer> mem = new HashMap<>();
        return findMaxMoney(nums, 0, mem);

        // BETTER SOLUTION DP
//        if(nums.length == 0) return 0;
//        if(nums.length == 1) return nums[0];
//        int[] dp = new int[nums.length];
//        dp[0] = nums[0];
//        dp[1] = Math.max(nums[0], nums[1]);
//
//        for(int i = 2; i < nums.length; i++) {
//            dp[i] = Math.max(dp[i-1], nums[i] + dp[i-2]);
//        }
//
//        return dp[nums.length - 1];
    }

    public static void main(String[] args) {
        int[] nums = {2,7,3,1};
        int res = rob(nums);
        System.out.println(res);
    }
}
