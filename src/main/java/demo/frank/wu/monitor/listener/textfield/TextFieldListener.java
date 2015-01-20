package demo.frank.wu.monitor.listener.textfield;

import demo.frank.wu.monitor.event.textfield.AfterInputEvent;
import demo.frank.wu.monitor.event.textfield.AfterLoadEvent;
import demo.frank.wu.monitor.listener.Listener;

public class TextFieldListener implements Listener {
	
	private AfterInputEvent afterInputEvent;
	private AfterLoadEvent afterLoadEvent;
	
	public void afterLoad(){
		afterLoadEvent.getEvent();
	}

	public void afterInput(){
		System.out.println("afterLoadEvent fired ");
		afterInputEvent.getEvent();
	}

	@Override
	public void handler() {
		
	}

}
