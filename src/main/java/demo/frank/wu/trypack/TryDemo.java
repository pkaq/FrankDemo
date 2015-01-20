/**
 * 
 */
package demo.frank.wu.trypack;

/**
 * @FileName: tryDemo.java
 * @Author: WuF
 * @Version: 1.0
 * @Date: 2012-4-5上午11:33:16
 * @Description: 
 * @Others: 
 * @FuntionList:
 * @History:
 * @category
 */
public class TryDemo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int a =1;
		int b = 0;
		int c = 0;
		try {
			c = a/b;
		} catch (Exception e) {
			System.err.println(">>>>>>>>>>>>>>>>>>>>异常了");
			c = 10;
			e.printStackTrace();
		}
		System.err.println(c);
		
		String tt = TryDemo.returnVal();
		System.err.println(tt);
	}
	
	@SuppressWarnings("finally")
	public static String returnVal(){
		String s = "T";
		
		try {
			System.err.println("Try");
			return "s";
		} catch (Exception e) {
			System.err.println("Catch");
		}finally{
			System.err.println("Finally");
			return s;
		}
		
	}

}
