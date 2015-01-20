/**
 * 
 */
package demo.frank.wu.thredpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description:	 
 * @FileName: 		 ThreadPoolInstance.java
 * @Author:		 WuF
 * @Version: 		 1.0
 * @Date: 			 2015年1月13日 上午10:27:40
 * @Others: 
 * @FuntionList:
 * @History:
 * @Category:
 */
public class ThreadPoolInstance {
	public static void main(String[] args) {
		ExecutorService t1 = Executors.newFixedThreadPool(30);
		ExecutorService t2 = Executors.newFixedThreadPool(30);
		ExecutorService t3 = Executors.newFixedThreadPool(30);
		
		System.err.println(t1.hashCode());
		System.err.println(t2.hashCode());
		System.err.println(t3.hashCode());
	}
}

