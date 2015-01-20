package demo.frank.wu.ws.server.impl;
 
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.jws.WebService;

import demo.frank.wu.thread.ThreadExecutor;
import demo.frank.wu.ws.server.HelloWorld;
 
/**
 * @Description:	 简单的Webserver实现类,必须保证实现类与接口在同一个包下或targetNamespace相同
 * @FileName: 		 HelloWorldImpl.java
 * @Author:		 WuF
 * @Version: 		 1.0
 * @Date: 			 2015年1月20日 上午10:37:20
 * @Others: 
 * @FuntionList:
 * @History:
 * @Category:
 */
@WebService(endpointInterface="demo.frank.wu.ws.server.HelloWorld",targetNamespace="http://server.ws.wu.frank.demo/")
public class HelloWorldImpl implements HelloWorld {
	private String testString = "frank";
	
    public String sayHi(String text) {
        System.out.println("sayHi called");
        return "Hello " + text;
    }
    	
    public void testResponse() throws InterruptedException{
    	//采用线程池执行
    	ExecutorService executor = Executors.newFixedThreadPool(100);
    	Runnable runnable = new ThreadExecutor<String>(testString);
    	executor.execute(runnable);
    	System.err.println("Response test");
    	System.err.println("break point");
    }

	public String getTestString() {
		return testString;
	}

	public void setTestString(String testString) {
		this.testString = testString;
	}
}
