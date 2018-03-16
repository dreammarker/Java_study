package exam_dowhile;

import java.util.Scanner;

public class Dowhile_Coffee_String {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		String order = ""; //문자열 객체
		String comma ="잔, "; 
		String menu; 
		int am=0,cp=0,cf=0;
		do {
			System.out.println("\"손님 주문하시겠습니까 ?\""); //
			System.out.printf("카페라떼 ,카푸치노 ,아메리카노 ,그만요,주문안함 ==>");
			menu = sc.next();
			System.out.println();
		
			if(menu.equals("주문안함"))
				break;
			switch(menu)
			{
				case "카페라떼": 
					System.out.println("#"+menu+" 주문하셨습니다"); 
					cp+=1;
					break;
				case "카푸치노":
					System.out.println("#"+menu+" 주문하셨습니다");
					cf+=1;
					break;
					
				case "아메리카노": 
					System.out.println("#"+menu+" 주문하셨습니다"); 
					am+=1;
					break;
					
				case "그만요":  				//", "
					System.out.printf("주문하신 ");
					if(am>0)
				    order=order.concat("아메리카노"+am+"잔,");
					if(cf>0)
					order=order.concat("카푸치노"+cf+"잔,");
					if(cp>0)
					order=order.concat("아메리카노"+cp+"잔,");
					
					System.out.println(order.substring(0,order.length()-1)+"준비하겠습니다");
					break;



			default: 
				System.out.println("잘못 주문하셨습니다");

			}

		}while(!(menu.equals("그만요")));

		if(menu.equals("주문안함"))
		System.out.println("안녕히 가세요");
	}

}
