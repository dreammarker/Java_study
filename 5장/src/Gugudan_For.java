import java.util.Scanner;

public class Gugudan_For {


	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);


		/***구구단을 아래로 출력 **/
		int i,j;
/*
		for(i =2; i<=9; i++)
		{ 
			//			 System.out.println("# 제"+i+"단 #");
			System.out.printf("\"# 제 %d 단 #\"\n",i);
			for(j=1;j<=9;j++) 
			{
				//				 if(j==1)
				//					 System.out.printf("# 제 %d 단 #\n",i);
				System.out.printf("%d X %d = %2d\n",i,j,(i*j));
				//				 	 System.out.println(i + " X " +j +" = " + (i*j));
			}
			System.out.println();
		}
		*//**구구단을 옆으로 출력(제 몇 단 넣기 ) -방법1 (단독 for 문)**//*

		//		 for(i =2;i<=9;i++) 
		//		 {
		//			 System.out.printf("# 제 %d 단 #\t",i);
		//		 }

		System.out.println();
		*//**구구단을 옆으로 출력(제 몇 단 넣기 ) -for문안에 넣기 방법2**//*
		for(i=1;i<=9;i++)
		{
			if(i==1) {
				for(i=2;i<=9;i++)   //1->2.....->9(참)->10(거짓)->11
					System.out.printf("# 제 %d 단 #\t",i);
				System.out.println();
				i=1;
			}
			for(j=2;j<=9;j++) 
			{

				System.out.printf("%d X %d = %2d      ",j,i,(i*j));	 
				//			 	 System.out.print(j+ " X " +i+" = "+(i*j)+" ");
			}
			System.out.println();
		}

		System.out.println();  //구분하기 위해
		*//**구구단을 옆으로 출력(제 몇 단 넣기 ) -for문안에 넣기 방법3**//*
		for(i=0;i<=9;i++) 
		{
			for(j=2;j<=9;j++) {
				if(i==0)
					System.out.printf("# 제 %d 단 #\t",j);
				else System.out.printf("%d X %d = %2d\t",j,i,(i*j));
			}
			System.out.println();
		}
		*/
			/*******키보드로 입력받은 단까지 출력(방법1)****/
		/*System.out.printf("몇단을 출력하시겟습니까:");
		int dan=sc.nextInt();
		
		for(i=0;i<=9;i++) 
		{
			for(j=2;j<=dan;j++) {
				if(i==0)
					System.out.printf("# 제 %d 단 #\t",j);
				else 
				
					System.out.printf("%d X %d = %2d\t",j,i,(i*j));
			}
			System.out.println();
		}
		*/

		System.out.println();
		/*** 두수의 곱이 72가 되는것만 출력 ****/
		for(i=0;i<=9;i++) 
		{
			for(j=2;j<=9;j++) {
					if(i*j==72)
					{
						if(j==8)
						System.out.printf("%d X %d = %2d\t",j,i,(i*j));
					}
					
			}
		
		}
		
		outer:for(i=0;i<=9;i++) 
		{
			for(j=2;j<=9;j++) {
					if(i*j==72) 
					{
						System.out.printf("%d X %d = %2d\t",j,i,(i*j));
						break outer;
					}
			}
		

		}
		
		
	
		
	}
}
