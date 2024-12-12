package org.example.string;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String  str = "dsf  eds";
        char[] s = str.toCharArray();
        reverseString(s);
        str = Arrays.toString(s);
        System.out.println(str);
    }
    public static void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

}
