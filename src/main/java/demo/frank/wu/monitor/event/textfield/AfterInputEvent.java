package demo.frank.wu.monitor.event.textfield;

import demo.frank.wu.monitor.event.Event;

public class AfterInputEvent implements Event{

	@Override
	public String getEvent() {
		System.err.println("AfterLoadEvent fired ");
		return null;
	}

}
