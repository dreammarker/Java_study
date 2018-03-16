
public class SCE {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int num1 = 0;
		int num2 = 0;
		boolean result;
/*		num1+=10; 미리증가시킨다.
		num2+=10;*/
		
		//& && | || 차이 앞에서 이미 참이거나 거짓이면 실행안한다.
		result = ((num1+=10)<0)&((num2+=10)>0);  //거짓&&둘다참이면 참
		System.out.println(result+"\t"+num1+"\t"+num2);
		
		result = ((num1+=10)>0)|((num2+=10)>0);  //참||(실행안됨)하나가 참이면 참
		System.out.println(result+"\t"+num1+"\t"+num2);
		
		
		
		
	}

}
