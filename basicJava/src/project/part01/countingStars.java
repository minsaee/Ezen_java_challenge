package project.part01;

public class countingStars {

	public static void main(String[] args) {
		// int money 선언 + 값
		int money = 99999;

		int m = money / 10000;
		money = money % 10000;
		int o = money / 1000;
		money = money % 1000;
		int n = money / 100;
		money = money % 100;
		int e = money / 10;

		System.out.printf("만원 %d 장\n천원 %d 장\n백원 %d 장\n십원 %d 장", m, o, n, e);

	}// end main()

}// end class
