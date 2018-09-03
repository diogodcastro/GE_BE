package com.dc.schedule;


import java.util.concurrent.TimeUnit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.scheduling.support.PeriodicTrigger;

@Configuration
@ComponentScan(
  basePackages="com.dc.schedule.inspection",
  basePackageClasses={ScheduleConfig.class})
public class ScheduleConfig  {

    @Bean
    public ThreadPoolTaskScheduler threadPoolTaskScheduler(){
        ThreadPoolTaskScheduler threadPoolTaskScheduler
          = new ThreadPoolTaskScheduler();
        threadPoolTaskScheduler.setPoolSize(2);
        threadPoolTaskScheduler.setThreadNamePrefix(
          "NextDateInspectionSchedule");
        return threadPoolTaskScheduler;
    }
    

    @Bean
    public CronTrigger cronTrigger() {
        return new CronTrigger("0/10 * * * * ?");
    }

    @Bean
    public PeriodicTrigger periodicTrigger() {
    	PeriodicTrigger t = new PeriodicTrigger(1, TimeUnit.DAYS);
    	t.setInitialDelay(2);
    	t.setFixedRate(true);
        return t;
    }

   
}
	


