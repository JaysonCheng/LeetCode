package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class containsNearbyDuplicate {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> uniqueValues = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(uniqueValues.containsKey(nums[i]) && i - uniqueValues.get(nums[i]) <= k) {
                return true;
            } else {
                if(uniqueValues.containsKey(nums[i])) {
                    uniqueValues.replace(nums[i], i);
                } else {
                    uniqueValues.put(nums[i], i);
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        boolean hasDuplicate = containsNearbyDuplicate(nums, 4);
        System.out.println(hasDuplicate);
    }
}
