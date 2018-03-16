package exam_dowhile;

import java.util.Scanner;

public class Dowhile_Coffee {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
			Scanner sc = new Scanner(System.in);
			int menu; 
			do {
			System.out.println("\"손님 주문하시겠습니까 ?\""); //
			System.out.println("<1>카페라떼 <2>카푸치노 <3>아메리카노 <4>그만요 ==>");
			menu = sc.nextInt();
			
			switch(menu)
			{
			case 1: System.out.println("#카페라떼 주문하셨습니다."); break;
			case 2:	System.out.println("#카푸치노 주문하셨습니다."); break;
			case 3: System.out.println("#아메리카노 나왔습니다.");
			case 4:	System.out.println("주문하신 커피 준비하겠습니다."); break;
			default: System.out.println("잘못 주문하셨습니다");
			}
			}while(menu!=4);
			
			
	}

}
