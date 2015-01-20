package demo.frank.wu.alpha.string;

/**
 * @Description:	 字符串比较以及常用方法
 * @FileName: 		 StrDemo.java
 * @Author:		 WuF
 * @Version: 		 1.0
 * @Date: 			 2015年1月20日 上午10:56:37
 */
public class StrDemo {
	public static void main(String[] args) {
		
		/**
		 * 字符串比较
		 */
		String str_a = "hello";
		String str_b = "hello";
		System.err.println(str_a == str_b);
		
		String str_c = new String("hello");
		String str_d = new String("hello");
		System.err.println(str_c == str_d);
		
		
		String stra = " 1$2 $3 $4 ";
		String[] sa = stra.split("\\$");
		for (String string : sa) {
			System.err.println(string);
		}
		
		
//		str_a.charAt(index);
//		str_a.valueOf(b);
//		str_a.length();
//		str_a.contains(s);
//		str_a.isEmpty();
//		str_a.substring(beginIndex, endIndex);
//		str_a.toString();
//		str_a.split("");
//		str_a.trim();
//		str_a.indexOf(ch);
//		str_a.equals(anObject);
//		str_a.equalsIgnoreCase(anotherString);
//		str_a.endsWith(suffix);
//		str
		
		
	}
}
