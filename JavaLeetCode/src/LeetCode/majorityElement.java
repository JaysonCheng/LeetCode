package LeetCode;

public class majorityElement {

    public static int majorityElement(int[] nums) {
        // 3ms with O(n) time
//        Arrays.sort(nums);
//        int mostNum = nums[0];
//        int count = 1;
//        int max = 0;
//        for(int i = 1; i < nums.length; i++) {
//            if(nums[i] == nums[i-1]) {
//                count++;
//            } else {
//                count = 1;
//            }
//            if(count > max) {
//                max = count;
//                mostNum = nums[i];
//            }
//        }
//        return mostNum;

        // 1ms with O(n) time and O(1) space
        int count=1, num = nums[0];

        for(int i=1; i<nums.length; i++){
            if(count == 0){
                count ++;
                num = nums[i];
            } else if(num == nums[i]){
                count ++;
            } else {
                count --;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 2, 1, 1};
        int majorityElement = majorityElement(nums);
        System.out.println(majorityElement);
    }
}
