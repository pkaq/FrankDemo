package demo.frank.wu.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.frank.wu.spring.event.EventSource;

public class EventTest {
	public static void main(String[] args) {
		String[] xmlConfig = new String[] { "spring/applicationContext.xml" };
		// 使用ApplicationContext来初始化系统
		ApplicationContext context = new ClassPathXmlApplicationContext(xmlConfig);
		EventSource eventSource = (EventSource) context.getBean("eventSource");
		
		eventSource.setApplicationContext(context);
		eventSource.addMessage("Msg one");
		eventSource.addMessage("Msg two");

	}
}
