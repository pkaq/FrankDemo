package demo.frank.wu.spring.event;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @Description: 	 事件源
 * @FileName: 		 EventSource.java
 * @Author:		 WuF
 * @Version: 		 1.0
 * @Date: 			 2014年12月29日 下午5:38:39
 * @Others: 
 * @FuntionList:
 * @History:
 * @Category:
 */
public class EventSource implements Runnable,ApplicationContextAware {
	private ApplicationContext atx = null;

	@Override
	public void setApplicationContext(ApplicationContext atx) throws BeansException {
		this.atx = atx;
	}
	
	public void addMessage(String msg) {
		MessageEvent event = new MessageEvent(this.atx, msg);
		this.atx.publishEvent(event);
	}

	@Override
	public void run() {
		
	}
 }
