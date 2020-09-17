package LeetCode;

public class moveZeroes {

    public static void moveZeroes(int[] nums) {
        int writeCtr = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[writeCtr] = nums[i];
                writeCtr++;
            }
        }

        for(int j = writeCtr; j < nums.length; j++) {
            nums[j] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 5};
        moveZeroes(nums);
        for(int num : nums) {
            System.out.println(num);
        }
    }
}
