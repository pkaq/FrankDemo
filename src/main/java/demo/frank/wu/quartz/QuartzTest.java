package demo.frank.wu.quartz;

import java.util.Date;

import org.quartz.CronTrigger;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;
/**
  @File:           QuartzTest.java
  @Author:         WuF
  @Version:        v 1.0
  @Date:           2014年7月18日下午4:03:20
  @Description:	定时执行框架DEMO,演示quartz基本用法,基于Quartz1.6.4
 */
public class QuartzTest {
	  public static void main(String[] args) throws Exception {

	        try {
	            // Grab the Scheduler instance from the Factory 
	        	//创建调度器
	            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
	            //创建任务触发器
	        
	            CronTrigger cronTrigger = new CronTrigger();
	            cronTrigger.setName("triger_test");
	            cronTrigger.setStartTime(new Date());
	            cronTrigger.setCronExpression(" 0/5 * * * * ?");
	            //创建任务
	            JobDetail jobDetail = new JobDetail();
	            jobDetail.setName("test");
	            jobDetail.setJobClass(Sayer.class);
	            //加入调度
	            scheduler.scheduleJob(jobDetail, cronTrigger);
	            // and start it off
	            //启动调度
	            scheduler.start();
	            //停止任务
	           // scheduler.shutdown();
	            //暂停任务
	            //scheduler.pause();
	            //恢复任务
	            //scheduler.resumeAll();
	            //删除任务
	            //scheduler.deleteJob("", "");

	        } catch (SchedulerException se) {
	            se.printStackTrace();
	        }
	    }

}
