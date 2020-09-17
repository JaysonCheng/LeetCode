package LeetCode;
import java.util.Set;
import java.util.HashSet;
public class containsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        // 12 ms
        if(nums.length < 2) {
            return false;
        }
        boolean hasDuplicate = false;
        Set<Integer> noDuplicate = new HashSet<Integer>();
        for(int num : nums) {
            noDuplicate.add(num);
        }
        if(noDuplicate.size() != nums.length) {
            hasDuplicate = true;
        }

        return hasDuplicate;

        // 5 ms
//        boolean hasDuplicate = false;
//        Arrays.sort(nums);
//        for(int i = 1; i < nums.length; i++) {
//            if(nums[i] == nums[i-1]){
//                hasDuplicate = true;
//            }
//        }
//        return hasDuplicate;
    }

    public static void main(String[] args) {
        int[] nums = {0,4,5,0,3,6};
        boolean hasDuplicate = containsDuplicate(nums);
        System.out.println(hasDuplicate);
    }
}
