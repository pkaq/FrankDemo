package demo.frank.wu.thread;

/**
 * @Description:	 用于执行未实现Runnable接口的对象方法
 * @FileName: 		 ThreadExecutor.java
 * @Author:		 WuF
 * @Version: 		 1.0
 * @Date: 			 2014年12月29日 下午5:39:53
 * @Others: 
 * @FuntionList:
 * @History:
 * @Category:
 */
public class ThreadExecutor<T> implements Runnable {
	private T obj;

	public ThreadExecutor(T obj) {
		this.obj = obj;
	}

	public void run() {
		try {
			Thread.sleep(15000);
			this.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		System.out.println(" Do something.."+this.obj);
		return super.toString();
	}
}
