
public class For_while_dowhile {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int i,sum=0;
		for(i=1;i<=10;i++)
			sum+=i;
		System.out.println(sum);
		
		i=1;
		sum=0;
		while(i<=10) {
			sum+=i; //
			i++;
		}
		System.out.println(sum);
		//do-while 실행 후 조건을 본다. 따라서 적어도 한번은 무조건 실행함.
		i=1;
		sum=0;
		do {
			sum+=i; //
			i++;
		}while(i<=10);
		System.out.println(sum);
		
		
	}

}
