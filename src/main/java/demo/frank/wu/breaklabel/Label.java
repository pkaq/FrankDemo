package demo.frank.wu.breaklabel;

/**
 * @Description:	 BreakLable示例
 * 在Java 中，break语句有3种作用。
 * 第一，你已经看到，在switch语句中，它被用来终止一个语句序列。
 * 第二，它能被用来退出一个循环。
 * 第三，它能作为一种“先进”的goto 语句来使用。下面对最后 2种用法进行解释。 
 * @FileName: 		 Label.java
 * @Author:		 WuF
 * @Version: 		 1.0
 * @Date: 			 2015年1月20日 上午11:01:13
 */
public class Label {
	public static void main(String[] args) {
		int i = -1;
		test: for (i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				switch (i) {

				case 5:
					break test;
				default:
					break;
				}
			}

		}
		System.err.println(i);

	}
}
