package org.example.od;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 创建 Scanner 对象来接收用户输入
        Scanner scanner = new Scanner(System.in);

        // 提示用户输入字符串
        System.out.print("请输入一个字符串：");
        String input = scanner.nextLine();

        // 按空格分割字符串
        String[] words = input.split("\\s+"); // 使用正则表达式处理多个空格

        // 获取最后一个单词
        String lastWord = words[words.length - 1];

        // 输出最后一个单词的长度
        System.out.println(lastWord.length());

        // 关闭扫描器
        scanner.close();
    }
}
