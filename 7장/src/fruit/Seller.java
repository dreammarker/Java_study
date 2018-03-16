package fruit;
/**
 * 
 * 클래스 = 필드( 클래스의 속성 ) + 메소드 (클래스의 기능)
 * 			반드시 생성자 존재
 *	필드는 초기값이 있다. (int:0, double:0.0, String:null,boolean=false)
 */

/**
 *  생성자: 반환형 없다 클래스명과 이름이 같다().
 *  역할:필드를 초기화하고 객체를 생성
 * 객체안에는 생성자 없음
 */
public class Seller { //부모 오브젝트
	private int nofApple;  //사과재고
	private int money;   //돈
	  
	public final  int APPLE_PRICE; //final :값 수정불가 최초에 1번은 초기화
									//static 공유 : 객체안에 존해하지 않음
									//final static : 상수(객체안에 존재x, 공유&)

	public Seller(int nofapple, int money, int aPPLE_PRICE) {
		super(); //먼저, 부모의 생성자를 호출-> 부모 객체 생성 
		this.nofApple = nofapple; //자신의 필드에 초기값을 주어 객체 생성
		this.money = money;   //this:객체안에만. 자기자신 주소
		APPLE_PRICE = aPPLE_PRICE;
	}
	
/*	public Seller(int nofapple, int money) {
		super(); //먼저, 부모의 생성자를 호출-> 부모 객체 생성 
		this.nofApple = nofapple; //자신의 필드에 초기값을 주어 객체 생성
		this.money = money;   //this:객체안에만. 자기자신 주소
	}*/
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
