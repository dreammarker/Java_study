//import fruit.Buyer;
//import fruit.Seller;

public class FruitSalesMain {

	public static void main(String[] args) {
		
		/*Seller s1 = new Seller(30,0,1000); //판매자1
		Seller s2 = new Seller(50,0,2000); //판매자2
		*/
		
		
		Seller s1 = new Seller(30,0); //판매자1
		Seller s2 = new Seller(50,0); //판매자2
		
		Buyer b = new Buyer(0,10000);      //구매자 

		System.out.println("사과 1개의 가격은 얼마인가요?(공개)");
		/*System.out.println("판매자1:"+s1.APPLE_PRICE+"원입니다.");
		System.out.println("판매자2:"+s2.APPLE_PRICE+"원입니다.");
		*/
		System.out.println("판매자2:"+Seller.APPLE_PRICE+"원입니다."); 
		//클래스 명으로 접근한다  static
		
		
		
//		s1.APPLE_PRICE=10; 가격 변경을 마음대로 할수 없도록
		
		b.buy(s1, 3000);
		b.buy(s2, 4000);

		//		b.access(s1);
		
		System.out.println("과일 판매자1의 현재 상황");
		s1.showsale();
		
		System.out.println("과일 판매자2의 현재 상황");
		s2.showsale();
		
		System.out.println("과일 구매자의 현재 상황");
		b.showBuy();
		
		int m=s1.getMoney();
		System.out.println("판매자 1이 가진 돈"+m);
		
		int n=s1.getNofApple();
		System.out.println("판매자 1이 가진 사과수"+n);
		/*		s1.money +=500; 
		b.money -=500;
		
		s1.nofApple -=20;
		b.nofApple +=20; */ //사과 
//		s1.setMoney(0);
		System.out.println("판매자 1이 가진 최종 돈"+s1.getMoney());
	}
}
