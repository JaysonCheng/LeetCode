package LeetCode;

public class ReverseInteger {
    public int reverseInteger(int x) {
        // use long if there is 9 numbers, eg: 1223456789, if 9 is the first digit cause integer overflow
        int res = 0;
        while (x != 0) {
            if (res > Integer.MAX_VALUE / 10) return 0;
            if (res < Integer.MIN_VALUE / 10) return 0;
            res *= 10;
            int digit = x % 10;
            x /= 10;
            res += digit;
        }

        return res;
    }
}
