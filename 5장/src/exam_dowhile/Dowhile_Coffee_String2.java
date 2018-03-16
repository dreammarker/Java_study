package exam_dowhile;

import java.util.Scanner;

public class Dowhile_Coffee_String2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String menu;
		String order="";
		int am=0,cp=0,cf=0;
		do {
			System.out.print("선택하세요 카페라떼 ,카푸치노 ,아메리카노 ,그만요,주문안함 ==>\n");
			menu="";
			menu = sc.nextLine();
			if(menu.equals("주문안함"))
				break;
			switch (menu) {
			case "아메리카노":
				System.out.println("아메리카노 주문하셨습니다.");am++;
				break;
			case "카페라떼":
				System.out.println("카페라떼 주문하셨습니다.");cp++;
				break;
			case "카푸치노":
				System.out.println("카푸치노 주문하셨습니다.");cf++;
				break;
			case "끝":
				if(am+cp+cf==0) {System.out.println("잘가");break;}
				if(am>0)order=order.concat(" 아메리카노"+am+"잔,");
				if(cp>0)order=order.concat(" 카페라떼"+cp+"잔,");
				if(cf>0)order=order.concat(" 카푸치노"+cf+"잔,");
				if(am+cp>0)order=order.substring(0,order.length()-1);
				System.out.println("주문하신"+order+" 준비하겠습니다.");
				break;
			default:
				System.out.println("아메리카노,카페라떼,카푸치노중에 선택하세요");
			}
		} while (!menu.equals("끝"));
		if(menu.equals("주문안함"))
			System.out.println("안녕히 가세요");
	}

}
