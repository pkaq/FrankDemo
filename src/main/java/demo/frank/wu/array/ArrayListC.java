package demo.frank.wu.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:	 数组介绍
 * @FileName: 		 ArrayListC.java
 * @Author:		 WuF
 * @Version: 		 1.0
 * @Date: 			 2015年1月20日 上午10:58:06
 */
public class ArrayListC {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List listA = new ArrayList();
		int[] s={1,2,3,4,5,6,7,8,9,0};
		int[] s2={11,12,13,14,15,16,17,18,19,10};
		listA.add(s);
		listA.add(s2);
		
		List listB = new ArrayList();
		for (int i = 0; i < s2.length; i++) {
			listB.add(new int[s2.length]);
		}
		
		for (int i = 0; i < listA.size(); i++) {
			int[] a = (int[]) listA.get(i); 
			for (int j = 0; j < s.length; j++) {
				int[] v  = (int[]) listB.get(j);
				v[i]=a[i];
			}
		}
		
		for (int i = 0; i <listB.size(); i++) {
			int[] v = (int[]) listB.get(i);
			for (int j = 0; j < v.length; j++) {
				System.err.print(v[j]);
				System.err.println("##########################################");
			}
		}
		
	}

}
