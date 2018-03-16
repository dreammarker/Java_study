//import java.lang.*;//기본값이므로 생략
//라이브러리에서 필요한 클래스 가져오는 방법

public class Hi {

	public static void main(String[] args) {
		//키보드와 모니터를 합쳐서 '콘솔'이라 부름
		//콘솔창에 출력. 문자열은 그대로 출력.
		System.out.println("10문자열");
		System.out.print(10);
		
		System.out.println("여러분\n");//\n:새줄 엔터기능과 비슷
		System.out.println("안녕하세요");
		//+(2 가지 기능): 덧셈연산자, 문자열을 연결 
		System.out.println(3+5); //수+수 :더하기
		System.out.println("안녕하세요"+3+5+7+9);//"문자열"+3+5="문자열35"
		System.out.println(3+5+7+9+"문자열");//3+5=8+"문자열"="8문자열 양쪽에 수가있어야 더할수있다."
		System.out.println(10+"\n문자열\t"+5);
		System.out.println(10+'\t'+5);
		System.out.println(10+"\t"+5);
		
		System.out.println("AB"+'\t'+'C');
		System.out.println("AB"+'\t'+'C');
		System.out.println("AB"+'\r'+'C');
		
		/***** 문자(유니코드) : 2 바이트 0->65535 음수가 지정될 수없다 * *****/
		char c1='\ud5d0'; //유니코드16진수 0010 0000 1010 1100->10진수
		System.out.println(c1); //char로 선언 문자로 출력
		System.out.println((int)c1); //정수로 출역하기 위해 강제 형변환
									 //강제 형변환 방법 (자료형)
		int c2 =1000; //10진수 -> 2진수
		System.out.println(c2); //int로 선언 정수로 출력
		System.out.println((char)c2); 
		
		//결과 정수-> 문자로 , 문자->정수로 호환이 가능함(단, 0~65535 정수만 가능)
		
		char ch1='\uD5D0';
		System.out.println(ch1);
		ch1='a';
		ch1='헬';  //2진수로 메모리에 저장되므로 연산이 가능.
		System.out.println("ch1:"+(char)(ch1+2)); //수+수=결과수
		
		System.out.println((char)('a'+2));  //97+2=99문자로 형변환
		System.out.println((char)'a'+2);  //97+2=99
		
		char ch2= 0x3050; //16진수 ->2진수
		System.out.println(ch2);
		char ch3= 0x20ac;
		System.out.println("오늘의 환율은 1$에 0.88"+ch3+"입니다.");
		
		if(ch1<=ch2) System.out.println("참");//if(참/거짓)
		else System.out.println("거짓");
	}

}
