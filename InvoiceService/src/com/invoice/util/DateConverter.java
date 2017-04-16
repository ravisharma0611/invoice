package com.invoice.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateConverter {

	public static Date convertDate(String dd, String mm, String yy){
		Date searchDate=null;
		int month = Integer.parseInt(mm);
		int day = Integer.parseInt(dd);
		int year = Integer.parseInt(yy);
		
		Calendar calenderDate=Calendar.getInstance();
		calenderDate.set((year), (month-1), (day));
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
		String dateToSearch = sdf.format(calenderDate.getTime());
		try {
			 searchDate = sdf.parse(dateToSearch);
			 
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return searchDate;
	}
	
	public static Date convertDate(String selectedDate){
		Date searchDate=null;
		String monthTo = selectedDate.split("/")[1];
		String dayTo = selectedDate.split("/")[0];
		String yearTo = selectedDate.split("/")[2];
		int month = Integer.parseInt(monthTo);
		int day = Integer.parseInt(dayTo);
		int year = Integer.parseInt(yearTo);
		
		Calendar calenderDate=Calendar.getInstance();
		calenderDate.set((year), (month-1), (day));
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
		String dateToSearch = sdf.format(calenderDate.getTime());
		try {
			 searchDate = sdf.parse(dateToSearch);
			 
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return searchDate;
	}
}
