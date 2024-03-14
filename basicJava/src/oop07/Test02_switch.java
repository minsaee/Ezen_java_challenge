package oop07;

public class Test02_switch {

	public static void main(String[] args) {

		switch (30) {
		case 10:
			System.out.println("십");
			break;
		case 20:
			System.out.println("구");
			break;
		case 30:
			System.out.println("팔");
			break;
		default:
			System.out.println("칠육오사삼이일");
		}

		// break;를 명시하지않으면 break;를 만나거나 switch문이 끝날 때 까지 실행된다.
		// default는 case에 값이 없을 경우 실행된다.

	}// end main()

}// end class
