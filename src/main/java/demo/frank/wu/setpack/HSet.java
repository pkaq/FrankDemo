/**
 * 
 */
package demo.frank.wu.setpack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * @FileName: HSet.java
 * @Author: WuF
 * @Version: 1.0
 * @Date: 2012-4-17下午3:01:41
 * @Description: 
 * @Others: 
 * @FuntionList:
 * @History:
 * @category
 */
public class HSet {
	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add("1");
		list.add("2");
		
		Set s = new HashSet();
		
		
		
		s.addAll(list);
		
		Iterator it = s.iterator();
		while (it.hasNext()) {
			String se = (String) it.next();
			System.err.println(se);
			
		}
		
		
	}
}
