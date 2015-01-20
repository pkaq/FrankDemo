/**
 * 
 */
package demo.frank.wu.bravo.calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author WuF
 * @date 2011-10-19上午11:36:42
 */
public class CalendarDemo {
	public static void main(String[] args) throws ParseException {
		System.err.println("First======================>");
		//获取当前日期
		Date datea = new Date();
		System.err.println(datea);
		//使用弃用方法
		System.err.println(datea.toLocaleString());
		//设置日期格式
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//格式化日期
		String curDate = sdf.format(datea);
		System.err.println(curDate);
		
		System.err.println("上一个月======================>");
		Calendar calendar = Calendar.getInstance();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM");
        Date date = dateFormat.parse("2013-02");
        
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, -1);
		System.err.println(dateFormat.format( calendar.getTime()));
		
		System.err.println("设置月份==============================>");
		Calendar cd = Calendar.getInstance();
		cd.setTime(new Date());
		Date me = cd.getTime();
		
		cd.set(Calendar.DAY_OF_MONTH, 1);
		Date mf = cd.getTime();
		
		String startDate = sdf.format(mf);
		String endDate = sdf.format(me);
		System.err.println(startDate);
		System.err.println(endDate);
		
		System.err.println("设置时间=======================================>");
		calendar.set(Calendar.YEAR, 2005);
		calendar.set(Calendar.MONTH, 0);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		System.err.println(dateFormat.format( calendar.getTime()));
		
		
		System.err.println("16:00==============================================>");

		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMddhhmmss");
		
		calendar.setTime(new Date());
		calendar.set(Calendar.HOUR_OF_DAY, 16);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		
		Date today = calendar.getTime();
		
		calendar.add(Calendar.DAY_OF_MONTH, -1);
		Date yesterday = calendar.getTime();
		
		String todayTable = "m" + sdf2.format(today);
		String yesterdayTable = "m" + sdf2.format(yesterday);
		
		sdf2.applyPattern("yyyy-MM-dd HH:mm:ss");
		String curTime = sdf2.format(today);
		String yesTime = sdf2.format(yesterday);

		String ystdDataSQL = "select * from "+yesterdayTable+" t where convert(char,t.sj,120) >='"+yesTime+"'";
		String tdDataSQL = "select * from "+todayTable+" t where convert(char,t.sj,120) <'"+curTime+"'";
		
		System.err.println(ystdDataSQL);
		System.err.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.err.println(tdDataSQL);
		
	
//		
//		StringBuilder is = new StringBuilder("insert into T_BASE_STDTIME values(");
//		DBHelper dbHelper = new DBHelper("cmes");
//		do {
//			int year = calendar.get(Calendar.YEAR);
//			Date date = calendar.getTime();
//			String dateStr = sdf.format(date);
//			System.err.println(dateStr);
//			is.append("'"+IDGenerator.generateID()+"',");
//			is.append("'"+year+"',");
//			is.append("to_date('"+dateStr+"','yyyy-MM-dd')");
//			dbHelper.insert(is.toString());
//			calendar.add(Calendar.DAY_OF_MONTH, 1);
//		}while(calendar.get(Calendar.YEAR)<=2036);
		
		
	}
}
