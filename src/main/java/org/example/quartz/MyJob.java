package org.example.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class MyJob implements Job {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        try {
            System.out.println("execute my job");
            Thread.sleep(1000 * 10);
            System.out.println("execute my job is over");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
