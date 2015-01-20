package demo.frank.wu.bravo.su;

import org.apache.commons.lang.StringUtils;

public class StrUtilDemo {

	public static void main(String[] args) {
		String str = "hello ,world";
		String nullStr = null;
		String emptyStr = "";
		String spaceStr = "  ";
		String tabStr = "\t";
		
		System.out.println("Blank || Empty ===============================================>");

		System.out.println(StringUtils.isEmpty(tabStr));
		System.out.println(StringUtils.isBlank(tabStr));
 
	}

}
