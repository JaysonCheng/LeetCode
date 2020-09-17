package LeetCode;

public class plusOne {

    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i = n-1; i >= 0 ; i--) {
            if(digits[i] < 9) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;

        return newDigits;
    }
    public static void main(String[] args) {
        int[] nums = {9, 9};
        int[] arrPlusOne = plusOne(nums);
        System.out.println(arrPlusOne);
    }

}
