package oop04;

public class Test01_datatype {

	public static void main(String[] args) {
		// 기본 자료형(Data type)

		// 1. 정수형
		// byte < short < int < long
		// 1바이트 2바이트 4바이트 8바이트

		byte a; // a라는 byte형 변수 선언
		a = 5; // a라는 변수에 5를 저장(대입연산자)
		System.out.println(a);

		short s = 7; // 변수 선언 및 대입을 동시에 할 수 있음
		System.out.println(s);

		int i = 9;
		System.out.println(i);

		long l = 15;
		System.out.println(l);

		// 변수타입은 최초의 한 번만 지정한다.

		int c = 2, d = 3; // 동일한 자료형의 변수는 콤마로 연속 선언이 가능함
		System.out.println(c + d);

		c = 200;
		d = 300; // 변수는 새로운 값을 대입 할 수 있음

	}// end main()

}// end class
