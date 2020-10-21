package LeetCode;

public class lengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        if(s.equals("")) return 0;
        // 0ms
//
//        s = s.trim();
//        int i = s.length() - 1;
//        int length = 0;
//        while(i >= 0 && s.charAt(i) != ' ') {
//            i--;
//            length++;
//        }
//
//        return length;

        // 1ms
        s = s.trim();
        String[] tokens = s.split(" ");

        if(tokens.length == 0) {
            return 0;
        }
        if(tokens.length == 1) {
            return tokens[0].length();
        }

        int lastLength = tokens[tokens.length - 1].length();
        return lastLength;
    }

    public static void main(String[] args) {
        int res = lengthOfLastWord(" sdsa cd dsad   ");
        System.out.println(res);
    }
}
