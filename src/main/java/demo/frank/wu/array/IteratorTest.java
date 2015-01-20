/**
 * 
 */
package demo.frank.wu.array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @FileName: IteratorTest.java
 * @Author: WuF
 * @Version: 1.0
 * @Date: 2012-3-2下午4:31:57
 * @Description: Itearor介绍
 */
public class IteratorTest {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		Iterator it  = list.iterator();
		
		List list2 = new ArrayList();
		list2.add(1);
		list2.add(2);
		it=list2.iterator();
		while (it.hasNext()) {
			System.err.println(it.next().toString());
		}
	}
}
