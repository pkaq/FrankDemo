/**
 * 
 */
package demo.frank.wu.setpack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @FileName: ZDemo.java
 * @Author: WuF
 * @Version: 1.0
 * @Date: 2012-4-5上午10:48:43
 * @Description: 
 * @Others: 
 * @FuntionList:
 * @History:
 * @category
 */
public class ZDemo {
	public static void main(String[] args) {
		String[] array = {"1","3","2"};
		Map<String,String[]> map = new HashMap<String,String[]>();
		map.put("array", array);
		
		List<Map<String,String[]>> list = new ArrayList<Map<String,String[]>>();
		list.add(map);
		
		//取得数组1
		Map<String,String[]> mmp = list.get(0);
		String[] array1 = mmp.get("array");
		System.err.println(array1[0]);
		
		//取得数组2
		String[] array2 = list.get(0).get("array");
		
		//遍历数组
		for (int i = 0; i < array2.length; i++) {
			System.err.println(array2[i]);
		}
		
	}
}
