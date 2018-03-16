package math;
import static java.lang.Math.*;
class MathTest {

	public static void main(String[] args) {
		
		Math m = new Math();
		m.add(3, 5); //메소드 호출 //static 메소드 호출방법
						//가능하나 경고 
		
		//static 메소드 호출방법-2 : 클래스명.static메소드()사용하기
		double d= m.add(3.7, 4.1);
		System.out.println(d);
	
		System.out.println(Math.square(6.3));
		
		System.out.println("반지름이 6인 원넓이"+Math.area(6));
		
		/*System.out.println(java.lang.Math.abs(-5));//절대치
		System.out.println(java.lang.Math.max(111.0, 15.61));//최대값
		*/
		System.out.println(abs(-5));//절대치
		System.out.println(max(111.0, 15.61));//최대값
		System.out.println(Math2.add(2,5,5,5,5,5,4,8,8,8,8,8,8));
		
		System.out.println(Math2.mul(3));
		System.out.println(Math2.mul(3,5,5,5));
		System.out.println(Math2.mul(3,5,5,5,5));
		System.out.println(Math2.mul(3.5,5,5));
		
	}
}
