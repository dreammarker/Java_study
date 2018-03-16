import java.util.Scanner;

public class Test_Overloading {

	public static void main(String[] args) {
		Scanner sc = new Scanner("1 2");
		int a1 =sc.nextInt();
		int a2 =sc.nextInt();
		
		System.out.println("두수의 합"+(a1+a2));
		
		sc = new Scanner(System.in);
		System.out.println("두정수를 입력");
		
		int a = sc.nextInt();
		int b =sc.nextInt();
		Test_Overloading t =new Test_Overloading(); //생성자를 호출-객체생성
		int r=t.add(a,b); //static이 아니면 객체생성 후 호출
//		int r=add(a,b);  //static 이므로 객체 생성없이 바로 호출 사용
		System.out.println("두수의 합: "+r);
	
	    int max=Math.max(a, b); //두 수 중 큰수. 클래스명.static 메소드
	    System.out.println("두 정수 중 큰 수: "+max);
	    
	    
	}
	/****메소드 오버로딩 
	 * @return ****/
	  static int add(int a,int b) {
//		System.out.println("두수의 합"+(a+b));  //리턴타입이 없으면 void 
		return a+b;
	}
/*	  int add(int a,int b) {
//			System.out.println("두수의 합"+(a+b));  //리턴타입이 없으면 void 
			return a+b;
		}*/
	  // 더하는 메소드 (실수, 실수)
	  static double add(double a,double b) {
		  return a+b;
	  }
	  
}
