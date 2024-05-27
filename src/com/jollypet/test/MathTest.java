package com.jollypet.test;

public class MathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double ran1 = Math.random();	// 0.0 ~ 1.0 사이의 random 실수 반환( 0.0 <= ran1 < 1.0)
		
//		System.out.println(ran1);
		
		// 1~45 중에서 1개 숫자 반환
		
		int lotto1 = (int)((ran1 * 45) + 1);
		
		System.out.println(lotto1);
		
	}

}
