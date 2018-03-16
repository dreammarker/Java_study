
public class UseVariable {

	public static void main(String[] args) {
		/***** final 상수*****/
		int max_size=100; //변수
		max_size=200;
		
		final int MAX_SIZE=100; //상수(대문자). 값을 지정할 수 없다.
//		max_size2=200;
		
		System.out.println(Math.PI); //static 필드
		
		System.out.println(Math.abs(-3.7)); //static 메소드. 절대치 |-3.7| = 3.7
		
		
		
		
		
		
		/***** 정수 *****/
		int n1;        //정수 변수 선언
		n1=10;         //초기값선언 선언하지 않으면 쓰레기값이 나온다.
		System.out.println(n1);
		
		n1=30;          //변하는 수가 들어간다(n1:변수)(30:상수-값이 고정)
		System.out.println(n1);
	
		int n2 = 20;  //선언과 동시에 초기화
		System.out.println(n2);
		
		if(n1>n2) System.out.println("참");//if(참/거짓)
		else System.out.println("거짓");
		
		if(method(3)) System.out.println("참");
		else System.out.println("거짓");
		
		float d= (float)method(max_size,3.7); //(상수 : 이름없는 메모리 8바이트) 
		System.out.println(d);
			
		method('핡');
		System.out.println(n1+n2);
		System.out.println("두수의 합:"+(n1+n2)); //"두수의 합:"+50=>"두수의 합:50" 문자열로 바뀌게 되어있다
		n1 = 0xA;   //0x 16진수
		n2 = 012;   //0 : 8진수(0~7)
		
		System.out.println(n1+n2);  //정확환 연산결과:정수는 컴퓨터 메모리에 정확하게 표현가능
									//그러나 표현범위 제한
		System.out.println(n1+"\t\t"+n2);

		/***** 실수(정밀도 double>float 표현범위가 넓기떄문) *****/
		double n3 = 1.0000001; //실수 변수 선언과 동시에 초기화
		double n4 = 2.0000001; //실수를 메모리에 표현할 때는 오차가 발생한다.
		
		System.out.println(n3+n4);  //오차있는 연산결과: 실수는 정확하게 표현가능.
                                    //그러나 표현 범위는 같다.
		System.out.println(n3+"\t"+n4);
		
		
		/***** 침과 거짓 *****/
		boolean b =true;  //false
		if(10>50) System.out.println("참");//if(참/거짓)
		else System.out.println("거짓");
		
		
		
		
		
		/***** 정수 *****/
		byte n5 = 10;  //1바이트
		short n6 = 100; //2바이트
		
		long n7 = 1000000000000000L; //8바이트
		System.out.println(Long.MAX_VALUE); //대문자: 상수
		//변수(메모리에 이름이 있다) = 상수(이름없는 메모리에 값이 저장됨-값을 변경못함)
		//상수에서(정수:4바이트, L을 붙이면 8바이트/ 실수:8바이트)
		
		/***** 실수 *****/
		System.out.println(Double.MAX_VALUE);
		float f1=20000000000.0F; //4바이트
		float f2=200000000000000L; //실수(4)=정수(8) 정수가 실수로 자동형 변환되어 저장됨.
		
		double e1 = 1.2e-13; //0.00000000000000012; 
		double e2 = 1.2E+18; //1200000000000000000.0;
	
	    System.out.println(e1+"\t"+e2);
	
	
	
	
	
	} //메소드 안에 메소드 정의 불가
	
	/***** 메소드 오버로딩 ******/
	/*static boolean method(int a){
		return true;
	}*/
	
	static int method(){ //메소드 명은 같아도 됨. (매개변수가 다르면 됨)
		return 10;
	}
	
	static boolean method(double b){ //메소드 명은 같아도 됨. (매개변수가 다르면 됨)
		return false;
	}
	
	/*static double method(float c) { //변수는 선언하고 사용해야한다.
		int b=10;
		return b; //b는 int인데 double로 자동 형 변환 되어 리턴됨.
	}*/
	static double method(int a,double c){ //메소드 명은 같아도 됨. (매개변수가 다르면 됨)
	
			return a+c;  //a가 float으로 자동형변환되어 연산됨. 그 결과도 float
						//float->double 으로 자동형변환되어 리턴됨.
	}
	static void method(char ch){ //리턴 값이 없을때 void를 쓴다.
		System.out.println(ch);
	}
	
}
