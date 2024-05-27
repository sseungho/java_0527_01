package com.jollypet.test;

public class SystemTimeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long a = System.nanoTime();
		long b = System.currentTimeMillis();
		
//		System.out.println(a);	// 현재시간을 나노 단위 1/100000000 초
//		System.out.println(b); // 현재시간을 1/1000 초

		long t1 = System.currentTimeMillis(); // start time
		long sum = 0;
		for(long i=0;i <= 1000000000; i++) { // 1~10000000000까지의 합
			sum = sum +i ;		}
		
		long t2 = System.currentTimeMillis(); // end time
		
		System.out.println(t2-t1); // 	1~1000000000까지의 합을 구하는데 걸리는 시간

		
	}

}
