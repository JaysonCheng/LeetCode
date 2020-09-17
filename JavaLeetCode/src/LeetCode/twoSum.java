package LeetCode;

public class twoSum {

    public static int[] twoSum(int[] numbers, int target) {
        if(numbers.length == 0) {
            return new int[0];
        } else if(numbers.length == 1) {
            return numbers;
        }

        int start = 0;
        int end = numbers.length - 1;
        int[] result = new int[2];
        while(start <= end) {
            int sum = numbers[start] + numbers[end];
            if(sum < target) {
                start++;
            } else if(sum > target) {
                end--;
            } else {
                result[0] = start + 1;
                result[1] = end + 1;
                break;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int[] result = twoSum(nums, 9);
    }
}
