package LeetCode;

public class stringToInteger {

    public static int myAtoi(String s) {
        String str = s.trim();
        long res = 0;
        boolean isNegative = false;

        for(int i = 0; i < str.length(); i++) {
            if(i == 0 && str.charAt(i) == '-') {
                isNegative = true;
            } else if(i == 0 && str.charAt(i) == '+') {
                continue;
            } else if(str.charAt(i) == '1') {
                res *= 10;
                res += 1;
            } else if(str.charAt(i) == '2') {
                res *= 10;
                res += 2;
            } else if(str.charAt(i) == '3') {
                res *= 10;
                res += 3;
            } else if(str.charAt(i) == '4') {
                res *= 10;
                res += 4;
            } else if(str.charAt(i) == '5') {
                res *= 10;
                res += 5;
            } else if(str.charAt(i) == '6') {
                res *= 10;
                res += 6;
            } else if(str.charAt(i) == '7') {
                res *= 10;
                res += 7;
            } else if(str.charAt(i) == '8') {
                res *= 10;
                res += 8;
            } else if(str.charAt(i) == '9') {
                res *= 10;
                res += 9;
            } else if(str.charAt(i) == '0') {
                res *= 10;
                res += 0;
            } else {
                break;
            }

            if(res > Integer.MAX_VALUE) {
                if(!isNegative) {
                    return Integer.MAX_VALUE;
                } else {
                    return Integer.MIN_VALUE;
                }
            }
        }

        if(isNegative) {
            res *= -1;
        }

        return (int)res;
    }

    public static void main(String[] args) {
        String str = "21474836460";
        int res = myAtoi(str);
        System.out.println(res);
    }
}
