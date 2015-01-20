package demo.frank.wu.spring.event;

import org.springframework.context.ApplicationListener;
/**
 * @Description: 	  事件监听
 * @FileName: 		 EventListener.java
 * @Author:		 WuF
 * @Version: 		 1.0
 * @Date: 			 2014年12月29日 下午5:37:46
 * @Others: 
 * @FuntionList:
 * @History:
 * @Category:
 */
public class EventListener implements ApplicationListener<MessageEvent> {

	@Override
	public void onApplicationEvent(MessageEvent event) {
		if (!(event instanceof MessageEvent)) {
			return;
		}

		MessageEvent msgevent = (MessageEvent) event;
		System.out.println("监听到变动  :::" + msgevent.toString());
		
		msgevent.print();

	}

}
