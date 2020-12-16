package LeetCode;

public class LongestPalindromeSubstring {
    public String longestPalindrome(String s) {
        int startIndex = 0;
        int endIndex = 0;
        int maxLength = 0;
        for(int i = 0; i < s.length(); i++) {
            int leftPtr = i;
            int rightPtr = i;
            while(leftPtr >= 0 && rightPtr < s.length()) {
                if(s.charAt(leftPtr) != s.charAt(rightPtr)) {
                    break;
                }
                if((rightPtr - leftPtr + 1) > maxLength) {
                    maxLength = rightPtr - leftPtr + 1;
                    startIndex = leftPtr;
                    endIndex = rightPtr;
                }
                leftPtr--;
                rightPtr++;
            }
            leftPtr = i;
            rightPtr = i + 1;
            while(leftPtr >= 0 && rightPtr < s.length()) {
                if(s.charAt(leftPtr) != s.charAt(rightPtr)) {
                    break;
                } else {
                    if((rightPtr - leftPtr + 1) > maxLength) {
                        maxLength = rightPtr - leftPtr + 1;
                        startIndex = leftPtr;
                        endIndex = rightPtr;
                    }
                }
                leftPtr--;
                rightPtr++;
            }
        }

        return s.substring(startIndex, endIndex + 1);
    }
}
