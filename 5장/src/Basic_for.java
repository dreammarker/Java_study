//import java.lang.*; //컴파일러가 자동으로 삽입해줌.
import java.util.Scanner;

public class Basic_for {

	public static void main(String[] args) { // 소문자():메소드

		Scanner sc = new Scanner(System.in);

		/***** 반복문 for문 **********************/
		System.out.print("문자열 입력 후 엔터치세요 : ");
		String s = sc.nextLine();

		System.out.println(s);
		System.out.println(s);
		System.out.println(s);
		System.out.println(s);
		System.out.println(s);

		int i; // 변수가 선언되어 프로그램이 끝날때까지 스택에 남아있음
				// main()메소드 안에 선언했으므로

		for (i = 1; i <= 5; i++) { // 5번 출력
			// for(1.초기화(한번만);2.조건문;4.증가/감소 후 2번으로)
			// 3.조건이 참이면 {} 실행. 거짓이면 빠져나옴
			System.out.println(s);
		}

		System.out.println(i + "일때 거짓이 되어 반복문 빠져나옴 ");
		System.out.println();

		for (i = 5; i >= 1; i--) { // 5->4->3->2->1->0
			// for(1.초기화(한번만);2.조건문;4.증가/감소 후 2번으로)
			// 3.조건이 참이면 {} 실행. 거짓이면 빠져나옴
			System.out.println(s);
		}

		System.out.println(i + "일때 거짓이 되어 반복문 빠져나옴 ");
		System.out.println();

		/******* 1~5출력 ************/
		

		/*
		 * System.out.println(i); 
		 * System.out.println(++i);//1 증가 후 출력
		 * System.out.println(++i); 
		 * System.out.println(++i); 
		 * System.out.println(++i);
		 */

		for (i = 1; i <= 5; i++) {
			System.out.print(i + "\t");
		}

		System.out.println();

		for (i = 0; i <= 4; i++) {
			System.out.print(i + 1 + "\t");// 1 2 3 4 5
		}

		/********* 1~10 까지 더한 결과 **********/
		/*int hap = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
		System.out.println("합:" + hap); //55
        */
		int hap=0;
		for(i=1;i<=10;i++) {
			hap = hap+i;
		}
			
		System.out.println("1~10까지 더한 값:" + hap); // 55
		
      
		/********* 1~10사이에서 짝수만 더한 결과 **********/
		hap = 0; // ★반드시 0으로 초기화
		for (i = 2; i <= 10; i *= 2) {// i=2 4 6 8 10(참) 12(거짓)
			hap = hap + i; // 0+2+4+6+8+10
		}
		System.out.println("1~10사이에서 짝수만 더한 값:" + hap); // 30

		/********* 1~100사이에서 짝수만 더한 결과 **********/
		hap = 0; // ★반드시 0으로 초기화
		for (i = 0; i <= 100; i += 2) {// i=0 2 4...100(참) 102(거짓)
			hap = hap + i; //
		}
		System.out.println("1~100사이에서 짝수만 더한 값:" + hap); 

		/********* 1~입력받은 정수까지 더한 결과 *********/
		System.out.print("마지막 정수 입력:");
		int lastnum = sc.nextInt();
		hap = 0;

		for (i = 1; i <= lastnum; i++) {// i=1 2 3... 입력받은 정수(참) 입력받은 정수+1(거짓)
			hap = hap + i; // 0+1+2+3..+입력받은 정수
		}
		System.out.println("1~" + lastnum + "까지 더한 값:" + hap);
		System.out.println(); //구분하기 위한 빈줄

		/********* 1~입력받은 정수까지 홀수만 더한 결과 *********/

		hap = 0;

		for (i = 1; i <= lastnum; i += 2) {// i=1 3 5... 입력받은 정수(참) 입력받은 정수+1(거짓)
			hap = hap + i; // 0+1+3+5..+입력받은 정수
		}
		System.out.println("1~" + lastnum + "까지 홀수만 더한 값:" + hap);
		System.out.println();

		/****** firstnum(시작값)~lastnum2(끝값) 2개의 입력받은 정수까지 더한 결과 *********/
		System.out.print("시작 정수 입력:");
		int firstnum = sc.nextInt();
		System.out.print("마지막 정수 입력:");
		int lastnum2 = sc.nextInt();

		hap = 0;
		for (i = firstnum; i <= lastnum2; i++) {// i=첫번째 입력받은 정수 .... 두번째 입력받은 정수(참) 입력받은 정수+1(거짓)
			hap = hap + i; // 첫번째 입력받은 정수+..+두번째 입력받은 정수
		}
		System.out.println(firstnum + "~" + lastnum2 + "까지 더한 값:" + hap);
		System.out.println();

		/********* 구구단 중 5단을 출력하는 프로그램을 for문을 이용해서 작성 ******/

		for (i = 1; i <= 9; i++) // 실행할 문장이 한줄이면 {}생략가능
			System.out.println("5 X " + i + " = " + (5 * i));

		/********** 구구단 : 키보드로 입력받은 단만 출력 ********/
		System.out.print("출력시키고 싶은 단 입력: ");

		int dan = sc.nextInt();
		
		System.out.println("# 제"+dan+"단 #");
		for (i = 1; i <= 9; i++) // 실행할 문장이 한줄이면 {}생략가능
		{
			//System.out.println(dan + " X " + i + " = " + (dan * i));
			System.out.printf("%d X %d = %d\t", dan, i, dan * i); //format
			                 //%d:10진수 %o:8진수 %x:16진수
		}
		System.out.println();
		
		
		/***** 초기화 여러개, 증가감소 여러개 가능 ******************/
		int j;

		for (i = 1, j = 1; i <= 9; i++, j++)
			System.out.println(i + " X " + j + "=" + (i * j));

		sc.close();
	}// main()끝

}// 클래스 끝
