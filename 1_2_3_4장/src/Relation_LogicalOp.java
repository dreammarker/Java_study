/*
 * 관계(비교)연산자, 논리연산자: 그 결과가 반드시 참/거짓
 */
public class Relation_LogicalOp {

	public static void main(String[] args) {
		System.out.println(3>=2);
		System.out.println(3==2);
		System.out.println(3!=2);
		System.out.println(3.0==3); //관계연산자도 연산자이므로 반드시 타입을 통일해서 비교한다.                                                                       );
			
		char n1=65,n2=97;
		System.out.println((int)n1);
		boolean r;
		
		//변수 n1에 저장된 값이 1과 100사이의 수인가?
		r =(n1>1 && n1<100); //참&&참이면 참 동시에 참이면 참
		System.out.println(r);
		
		//변수 n2에 저장된 값이 2 또는 3의 배수인가?
		r=(n2%2==0||n2%3==0); //둘중에 하나만 참이면 참이다.
		System.out.println(r);
		
		// 변수 n1이 0인가?
		r=!(n1!=0);
		System.out.println(r);
	}		//실수 ==(정수->실수)

}
