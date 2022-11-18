package com.junzhi.quarz;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloScheduler {
  public static void main(String[] args) {
    //
    JobDetail jobDetail =
        JobBuilder.newJob(HelloJob.class).withIdentity("myjob1", "group1").build();
    SimpleScheduleBuilder simpleScheduleBuilder =
        SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(5).repeatForever();
    SimpleTrigger trigger =
        TriggerBuilder.newTrigger()
            .withIdentity("myTrigger", "group1")
            .startNow()
            .withSchedule(simpleScheduleBuilder)
            .build();

    StdSchedulerFactory schedulerFactory = new StdSchedulerFactory();
    try {
      Scheduler scheduler = schedulerFactory.getScheduler();
      scheduler.start();
      scheduler.scheduleJob(jobDetail, trigger);
    } catch (SchedulerException e) {
      e.printStackTrace();
    }

    // Date
    Date date = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    System.out.println("Current Time is : " + sdf.format(date));
  }
}
