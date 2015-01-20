package demo.frank.wu.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

    /**
     Function: main 
     Description:  		 		
     @param args		
     */
    public static void main(String[] args) {
        Date date = new Date();
        
        System.err.println(date.toString());
        
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String fmt = simpleDateFormat.format(date);
        
        System.err.println(fmt);

    }

}
