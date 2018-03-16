package format;

public class FormatString {
	//필드
	public static void main(String[] args) {
		int age = 20;                    //main안에 있는건 변수
		double height = 178.2;
		
		String name = "YOON SUNG WOO"; //캐릭터형 배열 주소 
//		System.out.printf()=system.out.format()이 동일한 결과 같다.
		System.out.printf("name: %s \n",name); //f:format. %s:문자열(주소와 매핑)
		System.out.printf(" age: %d \n height: %e \n\n",age,height);
	
		System.out.printf(" %d - %o - %x \n\n",77,77,77);//10, 8 , 16진수
		
		System.out.printf("%g \n",0.00014);//그대로 - 출력의 대상에 따라 %e 또는 %f로 출력됨
		System.out.printf("%g \n",0.000014);  //지수형태
	
	
	
	}

	
}
