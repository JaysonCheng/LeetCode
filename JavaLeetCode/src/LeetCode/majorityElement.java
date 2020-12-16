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

        // HashMap solution
//        if(nums.length == 1) {
//            return nums[0];
//        }
//
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for(int i : nums) {
//            if(!map.containsKey(i)) {
//                map.put(i , 1);
//            } else {
//                int count = map.get(i) + 1;
//                if(count > (nums.length / 2)) {
//                    return i;
//                }
//                map.put(i, count);
//            }
//        }
//        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 2, 1, 1};
        int majorityElement = majorityElement(nums);
        System.out.println(majorityElement);
    }
}
