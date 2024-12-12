package org.example;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class StringToTimeExample {
    public static void main(String[] args) {
        String timeString = "13:00";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime time = LocalTime.parse(timeString, formatter);
        System.out.println("转换后的时间对象为: " + time);
    }
}
