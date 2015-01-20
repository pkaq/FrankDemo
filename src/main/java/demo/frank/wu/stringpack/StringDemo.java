/**
 * 
 */
package demo.frank.wu.stringpack;

import org.apache.commons.lang.StringUtils;

/**
 * @FileName: StringDemo.java
 * @Author: WuF
 * @Version: 1.0
 * @Date: 2012-4-5上午9:56:06
 * @Description: 
 * @Others: 
 * @FuntionList:
 * @History:
 * @category
 */
public class StringDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "MENU_ID={MENU_ID}";
		s = s.substring(s.indexOf("{")+1, s.indexOf("}"));
		System.err.println(s);
		
//		String[] c = {};
// 		for (int i = 0; i < (c == null?c.length:0); i++) {
//			
//		}
//		
////		字符串常用方法
//		String s = " hello world ";
//		String s2 = " Hello world ";
//		
//		//索引位置
//		int inde = s.indexOf("w");
//		//截取
//		s = s.substring(0,6);
//		//长度
//		int a = s.length();
//		//去除首尾空格
//		s=s.trim();
//		System.err.println(inde);
//		System.err.println(s);
//		System.err.println(a);
//		//比较
//		System.err.println("hello world".equalsIgnoreCase(s2));
//		System.err.println(s2.equalsIgnoreCase("nn"));
//		//转换为字符串
//		System.err.println(1+"");
//		//判空
//		if (null == s || s.equals("")) {
//			
//		}
//		
//		//StringBuilder常用方法
//		StringBuilder stringBuilder = new StringBuilder("a");
//		//增加
//		stringBuilder.append("1");
//		stringBuilder.append("2");
//		//按索引删除
//		stringBuilder.deleteCharAt(2);
//		
//		System.err.println(stringBuilder.toString());
//		
//		//转义字符
//		System.err.println("\"");
//		System.err.println("\\");
//		System.err.println("\n");
//		System.err.println("\r");
//		System.err.println("\n\r");
//		System.err.println("a\tb");
//	
//		
//		//分割字符串为数组
//		String sspilt = "1$2$3$4$5";
//		String[] ssArray = sspilt.split("\\$");
//		for (String string : ssArray) {
//			System.err.println(string);
//		}
//		
	}

}
