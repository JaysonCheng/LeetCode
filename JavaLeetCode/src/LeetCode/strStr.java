package LeetCode;

public class strStr {

    public static int strStr(String haystack, String needle) {
        if(needle.equals("")) {
            return 0;
        }

        int res = -1;
        int n = haystack.length() - needle.length() + 1;
        for(int i = 0; i < n; i++) {
            if(needle.equals(haystack.substring(i, i + needle.length()))) {
                res = i;
                break;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int res = strStr("aaa", "a");
        System.out.println(res);
    }
}
