package demo.frank.wu.spring.event;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.context.ApplicationEvent;

import demo.frank.wu.thread.ThreadExecutor;

/**
 * @Description: 	 消息事件
 * @FileName: 		 MessageEvent.java
 * @Author:		 WuF
 * @Version: 		 1.0
 * @Date: 			 2014年12月29日 下午5:38:57
 * @Others: 
 * @FuntionList:
 * @History:
 * @Category:
 */
public class MessageEvent extends ApplicationEvent {
	private final ExecutorService executor = Executors.newFixedThreadPool(100);
	
	private static final long serialVersionUID = 20L;
	
	private String message;

	public MessageEvent(Object source, String message) {
		super(source);
		this.message = message;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MessageEvent [message=").append(message).append("]");
		return builder.toString();
	}
	
	public void print(){
		Runnable runnable = new ThreadExecutor<String>("Hello Frank");
    	this.executor.execute(runnable);
		this.executor.shutdown();
	}
}
