package com.jollypet.test;

public class StringTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "Korea"; // 자바 문자열 선언
		
		System.out.println(str1.charAt(2));
		char str5 = str1.charAt(2);
		
		String str2 = new String("Korea");
		
		
		int[] intArray = {1,2,3,4,5};
//		String str3 = new String(intArray);

		int a = 10;
//		String str3 = new String(a);

		byte[] byteArray = {71,118,119,71,88};
		String str4 = new String(byteArray);
		System.out.println(str4);
		
		String str7 = new String(byteArray, 2, 3);
		System.out.println(str7);

		String str6 = "졸리펫은여기에!";
		int a2 = str6.indexOf("에");
		System.out.println(a2);
		
		int a3 = str6.indexOf("리펫");
		System.out.println(a3);
		
		int a4 = str6.indexOf("엉");
		System.out.println(a4);
		
		
		if (str6.indexOf("여기")  != -1)  { // true 이면 해당 문자열이 존재하는 경우
			System.out.println("여기 는 여기 있음 ")	;	
			
			
		String str10 = "오늘은 자바 프로그래밍!!!";		
		String str11 = str10.replace("자바", "파이썬");
		
		System.out.println(str10);
		System.out.println(str11);
		
		String ssn = "881021-1024567";
		System.out.println(ssn.substring(7));
		System.out.println(ssn.substring(0,6));
		
		String no1 = ssn.substring(7,9);
		String no2 = "3.14";
		int num1 = Integer.parseInt(no1); // 문자열 -> 정수 변환
		double num2 = Double.parseDouble(no2); // 문자열 -> 실수 변환

		System.out.println(num1/2);
		System.out.println(num2);
		
		int value = 777;
		String strValue = String.valueOf(value); // 정수 -> 문자열 변환
		
		String no4 = "3.141592222";
		String strValue2 = String.valueOf(no4); // 실수 -> 문자열 변환
		
		System.out.println(strValue + " " + strValue2);

		

		}
	}

}
