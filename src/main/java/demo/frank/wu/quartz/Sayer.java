package demo.frank.wu.quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.StatefulJob;

public class Sayer implements StatefulJob {

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		System.err.println("Hello world");
	}

}
