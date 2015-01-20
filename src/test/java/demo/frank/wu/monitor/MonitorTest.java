package demo.frank.wu.monitor;

import org.junit.Test;

import demo.frank.wu.monitor.component.TextField;
import demo.frank.wu.monitor.event.Event;
import demo.frank.wu.monitor.listener.textfield.TextFieldListener;

public class MonitorTest {
	@Test
	public void testName() throws Exception {
		TextField textField = new TextField();
		textField.setListener(new TextFieldListener());
		
		textField.fireHandler();
		textField.afterInput(new Event() {
			@Override
			public String getEvent() {
				System.err.println("自定义事件实现");
				return null;
			}
		});
	}
}
