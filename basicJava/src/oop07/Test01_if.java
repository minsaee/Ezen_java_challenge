package oop07;

public class Test01_if {

	public static void main(String[] args) {

		// 변수 선언 + 값
		int kor = 10, eng = 90, mat = 88;
		double aver = (kor + eng + mat) / 3.0;

		// 평균점수에 따라 등급 나누기
		if (aver >= 90) {
			System.out.println("A");
		} else if (aver >= 80) {
			System.out.println("B");
		} else if (aver >= 70) {
			System.out.println("C");
		} else if (aver > 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}// end main()

}// end class
