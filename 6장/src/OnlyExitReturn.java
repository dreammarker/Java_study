
public class OnlyExitReturn {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		divide(5,2.5);
//		System.out.println(r);
		
		divide(9,0); 
//		System.out.println(r); //무한대에 연산을 하면 결과는 항상 무한대
		divide(6,2);
//		System.out.println(divide(6,2));
	
	}
	public static void divide(double num1, double num2) {
		if(num2 == 0) {
			System.out.println("0으로 나눌 수 없습니다. ");
			return;
		}
			System.out.println("나눗셈 결과: "+(num1/num2));

		/***방법2***/
		/*		double num3 =num1 / num2;
		if(Double.isFinite(num3)) 
		System.out.println("값 산출 불가");
		else 
		System.out.println("나눗셈 결과: "+num3);*/
//		return (num1/num2);
	}

}
