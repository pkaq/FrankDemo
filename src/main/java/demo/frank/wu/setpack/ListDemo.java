/**
 * 
 */
package demo.frank.wu.setpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @FileName: ListDemo.java
 * @Author: WuF
 * @Version: 1.0
 * @Date: 2012-4-5上午10:40:02
 * @Description: 
 * @Others: 
 * @FuntionList:
 * @History:
 * @category
 */
public class ListDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("d");
		list.add("b");
		list.add("c");
		
		//foreach
		for (String str : list) {
			System.err.println(str);
		}
		
		System.err.println("############################################");
		
		//排序list
		Collections.sort(list);
		//普通for
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			System.err.println(s);
		}
		
		
	}
}
