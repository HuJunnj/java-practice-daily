package org.example.quartz;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import java.util.Calendar;
import java.util.Date;


public class QuartzSchedulerExample {
    public static void main(String[] args) {
            // 1. 创建调度器 Scheduler
        Scheduler scheduler = null;
        try {
            scheduler = StdSchedulerFactory.getDefaultScheduler();
            // 2. 定义 JobDetail
           /* for (int i=0; i<3; i++) {*/
                JobDetail jobDetail = JobBuilder.newJob(MyJob.class)
                        .withIdentity("myJob", "group1") // 定义任务的名称和组名
                        .build();
                Calendar startCalendar = Calendar.getInstance();
                Calendar endCalendar = Calendar.getInstance();
                // 设置自定义的年、月、日、小时、分钟和秒
                startCalendar.set(Calendar.YEAR, 2024);          // 设置年份
                startCalendar.set(Calendar.MONTH, Calendar.DECEMBER);  // 设置月份 (12 月)
                startCalendar.set(Calendar.DAY_OF_MONTH, 11);    // 设置日期
                startCalendar.set(Calendar.HOUR_OF_DAY, 18);     // 设置小时 (24 小时制)
                startCalendar.set(Calendar.MINUTE, 30);          // 设置分钟
                startCalendar.set(Calendar.SECOND, 0);           // 设置秒数为 0

                // 设置自定义的年、月、日、小时、分钟和秒
                endCalendar.set(Calendar.YEAR, 2024);          // 设置年份
                endCalendar.set(Calendar.MONTH, Calendar.DECEMBER);  // 设置月份 (12 月)
                endCalendar.set(Calendar.DAY_OF_MONTH, 11);    // 设置日期
                endCalendar.set(Calendar.HOUR_OF_DAY, 18);     // 设置小时 (24 小时制)
                endCalendar.set(Calendar.MINUTE, 36);          // 设置分钟
                endCalendar.set(Calendar.SECOND, 0);           // 设置秒数为 0

                long startTimeInMillis = startCalendar.getTimeInMillis();
                long endTimeInMillis = startCalendar.getTimeInMillis();
                Date satrtDate = new Date(startTimeInMillis);
                Date endDate = new Date(endTimeInMillis);
                // 3. 定义 Trigger
                Trigger trigger = TriggerBuilder.newTrigger()
                        .withIdentity("myTrigger", "group1") // 定义触发器的名称和组名
                        .startAt(satrtDate)
                        .endAt(endDate)// 立即执行
                        .withSchedule(SimpleScheduleBuilder.simpleSchedule()
                                .withIntervalInSeconds(30)  // Set interval time in seconds
                                .repeatForever())
                        .build();
                // 4. 使用 Scheduler 安排任务
                Date firstExecutionTime = scheduler.scheduleJob(jobDetail, trigger);
                System.out.println("Job scheduled to run at: " + firstExecutionTime);
            /*}*/
            // 启动调度器
            scheduler.start();
        } catch (SchedulerException e) {
            throw new RuntimeException(e);
        }
    }
}

