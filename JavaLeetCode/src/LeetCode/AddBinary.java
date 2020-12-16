package LeetCode;

public class AddBinary {

    public String addBinary(String a, String b) {
        // Math with StringBuilder
        // Without StringBuilder will run O(xn^2)
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int sum = 0;
        while(i >= 0 || j >= 0 || sum == 1) {
            // char - '0' (ASCII) will return the digit
            sum += ((i >= 0) ? a.charAt(i) - '0' : 0);
            sum += ((j >= 0) ? b.charAt(j) - '0' : 0);
            // digit + '0' (ASCII) will return the char
            res.append((char)(sum % 2 + '0'));
            sum /= 2;
            i--;
            j--;
        }

        return res.reverse().toString();


        // Brute force
//        boolean hasCarry = false;
//        String res = "";
//        int i = a.length() - 1;
//        int j = b.length() - 1;
//        while(i >= 0 || j >= 0) {
//            char currA = Character.MIN_VALUE;
//            char currB = Character.MIN_VALUE;
//            if(i < 0) {
//                currA = '0';
//            } else {
//                currA = a.charAt(i);
//            }
//            if(j < 0) {
//                currB = '0';
//            } else {
//                currB = b.charAt(j);
//            }
//            if(!hasCarry) {
//                if(currA == '1' && currB == '1') {
//                    res = "0" + res;
//                    hasCarry = true;
//                } else if((currA == '1' && currB == '0') || (currA == '0' && currB == '1')) {
//                    res = "1" + res;
//                    hasCarry = false;
//                } else if(currA == '0' && currB == '0') {
//                    res = "0" + res;
//                    hasCarry = false;
//                }
//            } else {
//                if(currA == '1' && currB == '1') {
//                    res = "1" + res;
//                    hasCarry = true;
//                } else if((currA == '1' && currB == '0') || (currA == '0' && currB == '1')) {
//                    res = "0" + res;
//                    hasCarry = true;
//                } else if(currA == '0' && currB == '0') {
//                    res = "1" + res;
//                    hasCarry = false;
//                }
//            }
//            i--;
//            j--;
//        }
//
//        if(hasCarry) {
//            res = "1" + res;
//        }
//
//        return res;
    }
}
