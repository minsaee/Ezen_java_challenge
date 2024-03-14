package project.part02;

public class calculator {

	public static void main(String[] args) {
		// 조건문으로 계산기 프로그램 구현

		// 변수 선언 + 값
		int x = 33, y = 50;
		char operator = '/';

		// 정수의 값을 받아 연산을 할 때 실수가 나올 경우가 있음
		int ires = 0;
		double dres = 0.0;

		// switch ~ case
		switch (operator) {
		case '+':
			ires = x + y;
			break;
		case '-':
			ires = x - y;
			break;
		case '*':
			ires = x * y;
			break;
		case '/':
			dres = (double) x / y;
			break;
		} // switch end()

		if (operator != '/') {
			System.out.printf("%d %c %d = %d\n", x, operator, y, ires);
		} else {
			System.out.printf("%d %c %d = %.2f\n", x, operator, y, dres);
		}

	}// end main()

}// end class
