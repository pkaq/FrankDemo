/**
 * 
 */
package demo.frank.wu.setpack;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @FileName: SetDemo.java
 * @Author: WuF
 * @Version: 1.0
 * @Date: 2012-4-5上午10:20:04
 * @Description: 
 * @Others: 
 * @FuntionList:
 * @History:
 * @category
 */
public class MapDemo {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		//泛型MAP
		Map<String, String> map = new HashMap<String, String>();
		map.put("userName", "root");
		map.put("password", "123");
//		System.err.println(map.get("password"));
		
		//遍历MAP1
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.err.println("Key is:"+key+" Value is:"+map.get(key));
		}
		String[] root = {"1","2"};
		//非泛型Hashmap
		HashMap hm = new HashMap();
		hm.put("total", "100");
		hm.put("root", root);
		
		
		
		
	}
}
