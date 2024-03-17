package oop08;

public class Test02_for {

	public static void main(String[] args) {

		// 이중반복문

		for (int a = 1; a <= 2; a += 1) {
			System.out.println("....start" + a);
			System.out.println("outer" + a);
			for (int b = 1; b <= 5; b += 1) {
				System.out.println(b + "inner");
			}

		} // end for()

	}// end main()

}// end class
