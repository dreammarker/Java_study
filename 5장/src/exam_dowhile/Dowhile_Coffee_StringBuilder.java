package exam_dowhile;

import java.util.Scanner;

public class Dowhile_Coffee_StringBuilder {

	public static void main(String[] args) {
		StringBuilder order = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		 //문자열 객체
		
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
				    order=order.append(" 아메리카노 "+am+"잔,");
					if(cf>0)
					order=order.append(" 카푸치노 "+cf+"잔,");
					if(cp>0)
					order=order.append(" 아메리카노 "+cp+"잔,");
					int i=order.length();
					order.delete(i-1, i); //subString과 다른점 객체가 더 생성되어서 더많은 일을 하게된다.
					System.out.println(order+" 준비하겠습니다");
					break;



			default: 
				System.out.println("잘못 주문하셨습니다");

			}

		}while(!(menu.equals("그만요")));

		if(menu.equals("주문안함"))
		System.out.println("안녕히 가세요");
		
		
	}

}
