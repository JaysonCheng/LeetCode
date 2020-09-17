package LeetCode;

public class maxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;
        for(int num: nums) {
            if(num == 1) {
                count++;
            } else {
                count = 0;
            }
            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        findMaxConsecutiveOnes(nums);
        int res = findMaxConsecutiveOnes(nums);
        System.out.println(res);
    }
}
