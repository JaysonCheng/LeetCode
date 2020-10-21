package LeetCode;

import java.util.HashMap;

public class RomanToInt {

    public static int romanToInt(String s) {
        HashMap<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int res = 0;
        for(int i = 1; i < s.length(); i++) {
            if(roman.get(s.charAt(i)) <= roman.get(s.charAt(i-1))) {
                res += roman.get(s.charAt(i-1));
            } else {
                res -= roman.get(s.charAt(i-1));
            }
        }
        res += roman.get(s.charAt(s.length()-1));
        return res;
    }

    public static void main(String[] args) {
        int res = romanToInt("XIV");
        System.out.println(res);
    }
}
