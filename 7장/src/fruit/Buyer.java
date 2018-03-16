package fruit;

public class Buyer { //구매자
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
