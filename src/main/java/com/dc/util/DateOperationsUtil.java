package com.dc.util;

import java.util.Calendar;
import java.util.Date;

public class DateOperationsUtil {
	
	public static Date addMonth(int month,Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, month);
	    return cal.getTime();
	}

}
