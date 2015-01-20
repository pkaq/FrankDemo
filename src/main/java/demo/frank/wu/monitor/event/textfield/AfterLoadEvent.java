package demo.frank.wu.monitor.event.textfield;

import demo.frank.wu.monitor.event.Event;

public class AfterLoadEvent implements Event{

	@Override
	public String getEvent() {
		System.err.println("AfterInputEvent fired ");
		return null;
	}

}
