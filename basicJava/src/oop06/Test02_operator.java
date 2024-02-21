package oop06;

public class Test02_operator {

	public static void main(String[] args) {
		// 대입연산자
		int a = 1;
		a = a + 3; // 1+3
		System.out.println("a : " + a);

		a += 3; // 4+3
		System.out.println("a : " + a);

		a -= 2; // a = a-2
		a *= 2; // a = a*2
		a /= 2; // a = a/2
		a %= 2; // a = a%2

		System.out.println("a : " + a);

		// 1 증감 연산자
		int x = 1;
		x = x + 1;
		x += 1;
		x++;
		++x;
		System.out.println("x : " + x);

		x = x - 1;
		x -= 1;
		x--;
		--x;
		System.out.println("x : " + x);
		
		// 삼항연산자
		String str = (5>3) ? "맞다" : "틀리다";
		System.out.println(str);
	}// end main()

}// end class
