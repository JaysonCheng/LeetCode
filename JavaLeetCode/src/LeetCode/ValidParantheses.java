package LeetCode;

import java.util.HashMap;
import java.util.Stack;

public class ValidParantheses {

    public static boolean isValid(String s) {
        if(s.length() < 2) return false;

        boolean isValid = false;
        HashMap<Character, Character> parentheses = new HashMap<>();
        parentheses.put('{', '}');
        parentheses.put('(', ')');
        parentheses.put('[', ']');

        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(parentheses.containsKey(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else {
                if(stack.empty()) {
                    return false;
                }
                char openParentheses = stack.pop();
                if(s.charAt(i) != parentheses.get(openParentheses)) {
                       isValid = false;
                       stack.push(openParentheses);
                       break;
                } else {
                    continue;
                }
            }
        }

        if(stack.empty()) isValid = true;

        return isValid;
    }

    public static void main(String[] args) {
        System.out.println(isValid("(]"));
    }
}
