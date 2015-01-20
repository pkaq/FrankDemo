/**
 * 
 */
package demo.frank.wu.md5;

/**
 * @Description:	 
 * @FileName: 		 MD5Test.java
 * @Author:		 WuF
 * @Version: 		 1.0
 * @Date: 			 2015年1月14日 下午2:04:54
 * @Others: 
 * @FuntionList:
 * @History:
 * @Category:
 */
public class MD5Test {
	public static void main(String[] args) {
		String gs = new MD5().getMD5ofStr("admin123");
		System.err.println(gs);
	}
}
