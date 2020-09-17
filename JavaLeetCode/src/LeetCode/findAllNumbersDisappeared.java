package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class findAllNumbersDisappeared {

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> disappearedNumbers = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int j = Math.abs(nums[i]) - 1;
            nums[j] = Math.abs(nums[j]) * -1;
        }

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                disappearedNumbers.add(i + 1);
            }
        }

        return disappearedNumbers;
    }

    public static void main(String[] args) {
        int[] height = {3,2,2,5,3};
        List<Integer> res = new ArrayList<>();
        res = findDisappearedNumbers(height);
        System.out.println(res);
    }
}
