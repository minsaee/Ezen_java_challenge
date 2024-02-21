package oop06;

public class Test01_operator {

	public static void main(String[] args) {
		// 산술연산자
		System.out.println(5 + 3);
		System.out.println(5 - 3);
		System.out.println(5 * 3);
		System.out.println(5 / 3);
		System.out.println(5 % 3);

		// 비교연산자(관계연산자)
		System.out.println(5 < 3);
		System.out.println(5 > 3);
		System.out.println(5 <= 3);
		System.out.println(5 >= 3);
		System.out.println(5 != 3);
		System.out.println(5 == 3);

		// 논리연산자
		System.out.println(3 < 5 && 2 > 4); // and
		System.out.println(3 < 5 || 2 > 4); // or

		boolean flag = false;
		System.out.println(!flag); // not

	}// end main()

}// end class
