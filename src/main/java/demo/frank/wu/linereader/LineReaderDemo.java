package demo.frank.wu.linereader;

import java.io.File;
import java.io.FileReader;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author WuF
 * @date 2011-11-3下午6:05:53
 */
public class LineReaderDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File f  = new File("e:\\1.txt");
		try {
			LineNumberReader reader = new LineNumberReader(new FileReader(f));
			String temps = reader.readLine();
			List<String> list = new ArrayList<String>();
			while (null != temps) {
				temps = reader.readLine();
				int begin = temps.indexOf("thunderHref=\"");
				int end = temps.indexOf("\" thunderPid=");
				if (begin>-1) {
					String s = temps.substring(begin+"thunderHref=\"".length(), end);
					System.err.println(s);
					list.add(s);
				}
			}
			for (String string : list) {
				System.err.println(string);
			}
			
		} catch (Exception e) {
		}
	}

}
