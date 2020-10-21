package LeetCode;

import java.util.HashMap;

public class lengthOfLongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        if(s == "") return 0;

//        char[] ch = s.toCharArray();
//        HashSet<Character> res = new HashSet<>();
//        int start = 0;
//        int end  = 0;
//        int maxLength = 0;
//        while(start < ch.length && end < ch.length) {
//            if(!res.contains(ch[end])) {
//                res.add(ch[end]);
//                end++;
//                maxLength = Math.max(maxLength, res.size());
//            } else {
//                res.remove(ch[start]);
//                start++;
//            }
//        }
//        return maxLength;
        HashMap<Character, Integer> res = new HashMap<>();
        int start = 0, maxLength = 0;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(res.containsKey(c)) {
                start = Math.max(start, res.get(c) + 1);

            }
            maxLength = Math.max(maxLength, i - start + 1);
            res.put(c, i);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int res = lengthOfLongestSubstring("abcabbab");
        System.out.println(res);
    }
}
