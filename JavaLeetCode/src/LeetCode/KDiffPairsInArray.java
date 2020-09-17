package LeetCode;

import java.util.Arrays;

public class KDiffPairsInArray {

    public static int findPairs(int[] nums, int k) {
        if(nums.length < 2 || k < 0) {
            return 0;
        }
        Arrays.sort(nums);
        int i = 0;
        int j = 1;
        int ans = 0;

        while(i < nums.length && j < nums.length) {
            if(nums[j] - nums[i] == k && i != j) {
                ans++;
                if(nums[j] == nums[j-1] && j >= 2 && j-1 != i) {
                    ans--;
                }
            } else if(nums[j] - nums[i] > k) {
                i++;
                continue;
            }
            j++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2,8,6,9,7,4,9,0,5,4};
        int res = findPairs(nums, 1);
        System.out.println(res);
    }
}
