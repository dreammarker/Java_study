
public class OperationExample {

	public static void main(String[] args) {
		byte b1 = 1 , b2=2;  //1바이트 = 8비트
		byte b3 = (byte)(b1+b2); 
		
		int iv3 = 10;
		int iv4 = 3;
		System.out.println(iv3 / iv4);  //몫:정수/정수 = 정수
		System.out.println(iv3 % iv4);  //나머지:정수/정수 =정수
		
		System.out.println((double)iv3 % iv4);  //나머지:정수=실수/실수 =실수
		
		byte b4 = (byte)123456789;
		System.out.println("b4:"+b4);

		/***************
		 * 강제로 형변환하면 데이터가 손실 가능, 데이터의 손실이 발생하기 전 점검
		 ****************/
		int i = 127;
		/*byte b =(byte) i;
		System.out.println(b);*/
		// 127<-128(F) 또는 127>127(F): 둘중에 하나만 참이면 참이됨 
		if(i<Byte.MIN_VALUE || i>Byte.MAX_VALUE) {
			System.out.println("byte 타입으로 변환할 수 없습니다.");
			System.out.println("값을 다시 확인해 주세요");
		}else {
			byte b =(byte) i;
			System.out.println(b);
		}
		/******* 자동형변환 주의사항: 정수가 실수로 자동형변환시 *********/
		System.out.println(Integer.MAX_VALUE);  //2147483647 
		
		int num1 =123456780;        //0.123456780*10의 9승
		int num2 =123456780;
		
		double num3 =num2;
		System.out.println(num3);
		num2 = (int) num3;
		System.out.println(num2);
		System.out.println(num1 -num2);
		
	/********자료형의 값이 사이클을 돈다, 최대값+1=최소값********/
		byte b5 = 125;
		/*System.out.println(++b5);
		System.out.println(++b5);
		System.out.println(++b5);
		*/
	/*	int k=10;
		k++;  //단독일 때는 ++이앞에 있던 뒤에 있던 k=k+1와 같다
		System.out.println(k);*/
		int k; //변수선언을 main()메소드 안에 함 . 1->2->3
		for(k=1;k<=3;k++) {//for(초기화;조건문(참/거짓);) 조건이 참일 동안 원하는곳까지 해라...
			System.out.println(++b5);  //3번 실행		
		}
		System.out.println(k);	
		
		for(int k2=1;k2<=3;k2++) {//for(초기화;조건문(참/거짓);) 조건이 참일 동안 원하는곳까지 해라...
			System.out.println(++b5);  //3번 실행		
			System.out.println(k2);
		}
		System.out.println(); //빈줄
		
		/***** 단항 연산자(부호) +,- (-1,+1=1) *********/
		int n1 = 5;
		System.out.println(+n1); //+수 (단항 연산자)
		System.out.println(-n1); //-수 (단항 연산자)
		
		short n2 =7; // short 2바이트
		
		short n3 = (short)+n2; //강제형변환 또는 그릇의 크기를 넓힌다. 모든 연산자들은 int를 기준으로 한다.
		
		
		/**** 단항 연산자: 자기자신을 1증가/1감소 연산자(++,--) *****************/
		int a = 7;         // a 값 변화
		System.out.println(a);
		System.out.println(a+1);
		System.out.println(a);
		//반드시 변수의 값이 변하려면 = 연산자가 있어야 값을 바꿀수 있다.
		
		a++; //++a; a=a+1
		System.out.println(a++);     // a값을 출력 7 -> a값을 1증가 8
		System.out.println(a);       // 8
		System.out.println(--a);    //a값을 감소 7 -> 출력
		System.out.println(a);     //
		
		int b = 7;
		int c = (++b) - (a--);
			//1.b증가 (8) -> 2.b-a=0을-> 3.c에 대입 -> 3. a감소 
		System.out.println(a+"\t"+b+"\t"+c);
		
		/********* 비트연산자(int형으로 반환) ***********/
		int nu1 = 5;  // 
		int nu2 = 3;  //
		int nu3 = -1;  // 10000001 ->  11111110 -> 11111111
		
		System.out.println(nu1 & nu2);
		System.out.println(nu1 | nu2);
		System.out.println(nu1 ^ nu2);
		
		System.out.println(~nu3);   // 부호를 바꾸고 (1의 보수를 취함)
 		System.out.println(~nu1+1); // 2의 보수 
 		System.out.println(~nu2+1); // 2의 보수
		
 		/**** 비트 이동 연산자(<< (곱하기2), >>(나누기2)) 단항연산자 *******/
 		System.out.println((byte)(2<<1));  //1바이트에서 연산
 		System.out.println(2<<2);
 		System.out.println(2<<3);
 		
 		System.out.println(-16>>1);
 		System.out.println(-16>>2);
 		System.out.println(-16>>3);
 		
 		
 		
	}

}
