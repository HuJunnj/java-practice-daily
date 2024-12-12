package org.example.stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String str = "({[]))";
        Boolean result = isValid(str);
        System.out.println(result);
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if (c == ')' && top != '(' || c == '}' && top != '{' || c == ']' && top != '[') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}
