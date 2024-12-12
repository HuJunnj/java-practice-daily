package org.example.Metadata.entity;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorDemo {
    public static void main(String[] args) {
        ThreadPoolExecutor customThreadPool = new ThreadPoolExecutor(
                2,                        // 核心线程数
                5,                        // 最大线程数
                60,                       // 线程空闲时间
                TimeUnit.SECONDS,         // 时间单位
                new ArrayBlockingQueue<>(3) // 队列容量
                // 拒绝策略
        );
        for(int i=0; i<50; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            customThreadPool.execute(() -> {
                System.out.println(Thread.currentThread().getName() + " 正在执行任务");
                try {
                    Thread.sleep(1000 * 30);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }
        System.out.println("主线程结束");
    }
}
