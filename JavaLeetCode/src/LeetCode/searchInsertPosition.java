package LeetCode;

public class searchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        int i = 0;
        if(target < nums[0]) {
            i = 0;
        } else if(target > nums[nums.length-1]) {
            i = nums.length;
        } else {
            for(i = 0; i < nums.length; i++){
                if(nums[i] == target) {
                    break;
                } else if(i != 0 && i != nums.length-1) {
                    if(target > nums[i-1] && target < nums[i]) {
                        break;
                    }
                } else if(i == nums.length-1) {
                    if(target < nums[i]) {
                        break;
                    }
                }
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5};
        int target = 4;
        int insertedPosition = searchInsert(nums, target);
        System.out.println(insertedPosition);
    }
}
