package LeetCode;

public class maxSubArray {

    public static int maxSubArray(int[] nums) {
        boolean isNegative = true;
        for(int num : nums) {
            if(num > 0) {
                isNegative = false;
            }
        }
        int maxSum = Integer.MIN_VALUE;
        if(isNegative) {
            for(int num : nums) {
                maxSum = Math.max(maxSum, num);
            }
        } else {
            int n = nums.length;
            int sum = 0;
            for(int num : nums) {
                if(sum + num > 0) {
                    sum += num;
                } else {
                    sum = 0;
                }
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int maxSubArray = maxSubArray(nums);
        System.out.println(maxSubArray);
    }
}
