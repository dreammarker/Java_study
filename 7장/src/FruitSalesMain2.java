//import fruit.Buyer;
//import fruit.Seller;
import fruit.*;


 class Buyer { //구매자
	int nofApple; //사과수
	 int money;   //돈
	
	 
	 public Buyer(int nofApple, int money) {
		super();
		this.nofApple = nofApple;
		this.money = money;
	}
	 
	 /** 생성자 : 반환형 없다. 클래스명과 이름이 같다.()
	  *  역할: 필드를 초기화
	  * 
	  */
	 public void buy(Seller s, int money) {
		 nofApple += s.sale(money);
		 this.money -= money;
	 }
	 
	 public void showBuy() {
		 System.out.println("가진 사과: "+nofApple);
		 System.out.println("현재 잔액: "+money);
	 }
	 
	 
	/* public void access(Seller s){
		 s.money =0;   //구매자 측에서 판매자의 돈을 맘대로 바꿀수잇다.
		 System.out.println(s.money);
	 }*/
}
 //1개의 파일에 여러개의 클래스를 설계할 떄 public 클래스는 단1개
 //main()이 있는 클래스에 public을 붙인다
 class Seller { //부모 오브젝트
	private int nofApple;  //사과재고
	private int money;   //돈
	 
	public final static int APPLE_PRICE=1000; //final :값 수정불가
									//static 공유 : 객체안에 존해하지 않음
									//final static : 상수(객체안에 존재x, 공유&)

/*	public Seller(int nofapple, int money, int aPPLE_PRICE) {
		super(); //먼저, 부모의 생성자를 호출-> 부모 객체 생성 
		this.nofApple = nofapple; //자신의 필드에 초기값을 주어 객체 생성
		this.money = money;   //this:객체안에만. 자기자신 주소
		APPLE_PRICE = aPPLE_PRICE;
	}*/
	
	public Seller(int nofapple, int money) {
		super(); //먼저, 부모의 생성자를 호출-> 부모 객체 생성 
		this.nofApple = nofapple; //자신의 필드에 초기값을 주어 객체 생성
		this.money = money;   //this:객체안에만. 자기자신 주소
	}
	public int sale(int money){  //4000
		
		int n = money/APPLE_PRICE; //4000/1000
		this.money += money; //판매자의 돈+4000
		nofApple -= n; //판매자의 사과수 -n
		return n;   //4개를 구매자한테 준다.
		
	}
	
	public void showsale() //판매자의 현재상황 
	{
		System.out.println("남은 사과: "+nofApple);
		System.out.println("판매 수익: "+money);
	}
	public int getNofApple() { //private 필드값은 메소드를 통해서 값을 얻을수 있다
		return nofApple;
	}
//	public void setNofApple(int nofApple) { //값을 변경할 수 있다.
//		this.nofApple = nofApple;
//	}
	public int getMoney() {
		return money;
	}
//	public void setMoney(int money) {
//		this.money = money;
//	}
	
	
}

public class FruitSalesMain2 {

	public static void main(String[] args) {
		
		/*Seller s1 = new Seller(30,0,1000); //판매자1
		Seller s2 = new Seller(50,0,2000); //판매자2
		*/
		
		
		fruit.Seller s1 = new fruit.Seller(30,0,1500); //판매자1 다른 패키지 객체 생성.
		fruit.Seller s2 = new fruit.Seller(50,0,2000); //판매자2
		
		Seller s3 = new Seller(50,0); //같은 패키지의 Seller로 객체생성
		Seller s4 = new Seller(50,0); //판매자2
		
		Buyer b = new Buyer(0,10000);      //구매자 

		System.out.println("사과 1개의 가격은 얼마인가요?(공개)");
		/*System.out.println("판매자1:"+s1.APPLE_PRICE+"원입니다.");
		System.out.println("판매자2:"+s2.APPLE_PRICE+"원입니다.");
		*/
		System.out.println("판매자2:"+Seller.APPLE_PRICE+"원입니다."); 
		//클래스 명으로 접근한다  static
		
		
		
//		s1.APPLE_PRICE=10; 가격 변경을 마음대로 할수 없도록
		
		b.buy(s3, 3000);
		b.buy(s4, 4000);

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
