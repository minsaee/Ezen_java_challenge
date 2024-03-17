package oop08;

public class Test01_for {

	public static void main(String[] args) {

		// 증감에 따른 반복문
		for (int a = 1; a <= 5; a += 1) {
			System.out.println(a + "실행" + a);
		} // end for()

		System.out.println("=====");

		for (int a = 5; a >= 1; a -= 1) {
			System.out.println(a + "실행" + a);
		} // end for()

		// 유효범위(SCOPE)
		// 특정 변수가 생존할 수 있는 범위
		// for문 안에 선언된 변수는 for문 안에서만 유효하다.

	}// end main()

}// end class
