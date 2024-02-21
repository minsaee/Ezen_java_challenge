package oop05;

public class Test03_format {

	public static void main(String[] args) {
		// 출력서식
		
//		System.out.printf("출력서식", 값);
		
		System.out.printf("%d, %d, %d", 10, 20 ,30);
		System.out.printf("\n나이 : %d", 99);
		System.out.printf("\n\n\n나\t이 : %d", 99);
		System.out.printf("\n나이 : #%5d#", 99);
		System.out.printf("\n나이 : #%-5d#", 99);
		System.out.println();
		
		System.out.printf("%f %f\n", 1.1, 2.2);
		System.out.printf("키 : %f\n", 180.5);
		System.out.printf("키 : #%9.2f#\n", 180.5);  //키 : #   180.50#
		System.out.printf("키 : #%-9.2f#\n", 180.5); //키 : #180.50   #
		System.out.printf("키 : %.2f\n", 180.5);
		
		System.out.printf("%c\n", 'A');
		System.out.printf("#%-5c#\n", 'B'); //#B    #
		
		System.out.printf("%s\n", "BEEN");
		System.out.printf("#%-9s#\n", "ZINO"); //#ZINO     #

	}//end main()

}//end class
