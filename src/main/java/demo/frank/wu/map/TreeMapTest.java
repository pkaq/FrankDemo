/**
 * 
 */
package demo.frank.wu.map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;


/**
 * @FileName: TreeMapTest.java
 * @Author: WuF
 * @Version: 1.0
 * @Date: 2012-1-12下午2:10:32
 * @Description: 
 * @Others: 
 * @FuntionList:
 * @History:
 */
public class TreeMapTest {
	
	public static void main(String[] args) {
		TreeMap<String, Double> tm = new TreeMap<String,Double>(new Comparator<String>() {
		/* (non-Javadoc)
		 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
		 */
		@Override
		public int compare(String o1, String o2) {
			return -1;
		}
		});
		System.err.println("A");
		tm.put("01月", 1.0d);
		System.err.println("B");
		tm.put("12月", 3.0d);
		System.err.println("C");
		
		for (String key : tm.keySet()) {
			System.err.println(key);
		}
		
		
//		List<String> list = new ArrayListt<String>();
		
	}
	
	
	public ArrayList  aaa(String args) {
		
		return null;
	}
	 
	
}
