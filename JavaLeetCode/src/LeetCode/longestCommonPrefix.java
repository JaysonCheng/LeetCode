package LeetCode;

public class longestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        String res = "";

        // Find minimum size of string in strs array
        int minSize = Integer.MAX_VALUE;
        for(String str : strs) {
            minSize = Math.min(minSize, str.length());
        }

        System.out.println(minSize);
        res = strs[0].substring(0, minSize);

        for(int j = 1; j < strs.length; j++) {
            while(strs[j].indexOf(res) != 0) {
                res = res.substring(0, res.length() - 1);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        String[] strs = {"acc","aaa","aaba"};
        String res = longestCommonPrefix(strs);
        System.out.println(res);
    }
}
