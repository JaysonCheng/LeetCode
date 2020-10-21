package LeetCode;

import java.util.HashMap;

public class twoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        if(nums.length < 2) return res;

        HashMap<Integer, Integer> mapIndex = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            mapIndex.put(nums[i], i);
        }

        for(int j = 0; j < nums.length; j++) {
            int diff = target - nums[j];
            if(mapIndex.containsKey(diff) && mapIndex.get(diff) != j) {
                res[0] = j;
                res[1] = mapIndex.get(diff);
            }
        }

        return res;

        // One pass check
//        Map<Integer, Integer> prevMap = new HashMap<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            int diff = target - nums[i];
//
//            if (prevMap.containsKey(diff)) {
//                return new int[]{ prevMap.get(diff), i };
//            }
//            prevMap.put(nums[i], i);
//        }
//        return new int[0]; // Guranteed solution, no need for return
    }
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int[] result = twoSum(nums, 6);
        for(int index : result) {
            System.out.println(index);
        }
    }
}
