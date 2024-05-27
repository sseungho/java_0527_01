package com.jollypet.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date now = new Date();
		
		String strNow1 = now.toString();
		
		
		System.out.println(now);
		System.out.println(strNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);

//		Calendar now2 = new Calendar();	추상 클래스 이므로 instance 생성 불가 -> 에러 발생
		
		Calendar now2 = Calendar.getInstance();
		
		int year = now2.get(Calendar.YEAR);
		System.out.println(year);
		
		int month = now2.get(Calendar.MONTH) + 1;
		System.out.println(month);
		
		int day = now2.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		
		int dayWeek = now2.get(Calendar.DAY_OF_WEEK);
		System.out.println(dayWeek);
		
		int amPm = now2.get(Calendar.AM_PM);
		System.out.println(amPm);
	}

}
