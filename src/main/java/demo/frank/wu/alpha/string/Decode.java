package demo.frank.wu.alpha.string;

import java.io.UnsupportedEncodingException;
/**
 * @Description:	 字符串转码
 * @FileName: 		 Decode.java
 * @Author:		 WuF
 * @Version: 		 1.0
 * @Date: 			 2015年1月20日 上午10:56:22
 */
public class Decode {
	public static void main(String[] args) {
		try {
			String dstr = "%E6%B0%B4%E4%BB%93%E6%B0%B4%E4%BD%8D%E7%9B%91%E6%B5%8B";
			String str  = new String(dstr.getBytes("ISO-8859-1"),"UTF-8");
			System.err.println(str);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

	}

}
