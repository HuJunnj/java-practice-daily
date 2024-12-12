package org.example.quartz;

import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;

public class WeekDaysCalculator {
    public static void main(String[] args) {
        // 输入某一天的日期
        LocalDate givenDate = LocalDate.of(2024, 12, 11); // 示例：2024-12-11

        // 计算这一天所在周的周一到周日，并过滤大于等于给定日期的日期
        List<LocalDate> filteredWeekDays = calculateWeekDaysAfter(givenDate);

        // 输出结果
        System.out.println("大于等于这天的周内日期为：");
        for (LocalDate date : filteredWeekDays) {
            System.out.println(date);
        }
    }

    public static List<LocalDate> calculateWeekDaysAfter(LocalDate givenDate) {
        List<LocalDate> result = new ArrayList<>();

        // 找到本周的周一
        LocalDate monday = givenDate.with(DayOfWeek.MONDAY);

        // 遍历周一到周日
        for (int i = 0; i < 7; i++) {
            LocalDate currentDay = monday.plusDays(i);
            // 仅添加大于等于给定日期的日期
            if (!currentDay.isBefore(givenDate)) {
                result.add(currentDay);
            }
        }

        return result;
    }
}

