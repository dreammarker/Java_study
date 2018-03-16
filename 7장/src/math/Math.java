package math;

class Math {
/***
 * 
 *   매개변수가 필드를 필요로 하지 않고 매개변수만 필요
 *   static붙인다 
 */
	 static void  add(int a,int b) {
			System.out.println(a+b);
		//		return a+b;
	}
	
	 static double add(double a,double b) {
		return a+b;
	}
	
	static int square(int a) {
		return a*a;  //정수->실수 리턴타입: 같거나 /넓게 (자동 형변환되므로)
	}
	
	static double square(double a) {
		return a*a;
	}
	static final double PI =3.14;  //상수.공유 
	
	static double area(double a) {
		return a*a*PI;
	}
	static final int A;
	static {
		int i;
		int hap=0;
		for(i=0;i<=10;i++) {
			hap+=i;
		}
		A=hap;
	}
	
}
