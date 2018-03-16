
public class InfinityAndNancheck {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int x =5;
		int y =0;
		
		try {
			int z = x/y;   //예외 발생 -> 예외 객체 생성
			System.out.println("z: "+z);
		} catch (Exception e) { //예외의 부모
			// TODO 자동 생성된 catch 블록
//			e.printStackTrace(); //예외 처리(예외 종류, 이유, 위치)
			System.out.println("0으로 나누면 안됨.");
		}
		
		double a=5; //5.0
		double b=0; //0.0
		
		System.out.println(a%b);
		
	}

}
