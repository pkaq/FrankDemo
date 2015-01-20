package demo.frank.wu.monitor.component;

import demo.frank.wu.monitor.event.Event;
import demo.frank.wu.monitor.listener.Listener;
import demo.frank.wu.monitor.listener.textfield.TextFieldListener;

public class TextField {
	private TextFieldListener listener;
	
	public TextField() {
		System.err.println("组件已创建");
	}
	
	public void addListener(Listener listener){
		
	}
	
	public void addEvent(Event event){
		
	}
	
	public void fireHandler(){
		this.listener.handler();
	}
	
	public void afterLoad(){
		this.listener.afterLoad();
	}
	
	public void afterInput(){
		this.listener.afterInput();
	}
	
	public void afterLoad(Event evnet){
		this.listener.afterLoad();
	}
	
	public void afterInput(Event event){
		this.listener.afterInput();
	}
	public TextFieldListener getListener() {
		return listener;
	}

	public void setListener(TextFieldListener listener) {
		this.listener = listener;
	}
}
