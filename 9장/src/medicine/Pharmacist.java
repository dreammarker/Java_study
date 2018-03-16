package medicine;



public class Pharmacist{
   public final String pharmacy_name; //약국 이름 공개는 하되 수정 불가
   private int firstmoney;        //약사가 가진 돈
   private int lastmoney;
   
   private int cnt_t;          //콘택 약의 수
   private int cnt_con;
 
   public static final int CONTAC600_PRICE=1000;
   public static final int Tilenol_PRICE;


  static {
	  /*int price=0;
	  for(int i=1;i<=100;i++) {
		  price +=200;
	  }
	  */Tilenol_PRICE = tylenol_price();
  }

  static int tylenol_price() {
	  int price=0;
	  for(int i=1;i<=10;i++) {
		  price +=200;
	  }
	  return price;
  }

   
   public Pharmacist(String pharmacy_name, int money,int cnt_con, int cnt_t) {
	super();
	this.pharmacy_name = pharmacy_name;
	firstmoney = money;
	lastmoney = money;
	this.cnt_t = cnt_t;
	this.cnt_con = cnt_con;
	
}
public void menuExplain() {
      System.out.println("\"손님 주문하시겠습니까 ?\""); //
      System.out.println("1.타이레놀,2.콘텍,3.그만요,4.안사요=>");
   }
   public void menuplain() {
	   System.out.println("\n손님, 콘택600은 1개에"
			   				+ Pharmacist.CONTAC600_PRICE
			   				+ "원, 타이레놀은 1개에 "
			   				+ Pharmacist.Tilenol_PRICE+"원입니다");
   }
   
 

 

  


   
    public CONTAC600 saleCONTAC600(int m,int c){ //(돈, 약의 수)
      //작성위치   
    	if(cnt_con < c) {//약사의 콘택600수 < 주문한 수
			System.out.println("<약사>.\n"
					   + "지금 콘택600 약이 부족합니다.\n"
					   + "남은 약은 " + cnt_con +"개 밖에 없습니다.\n"
					   + "다음에 가져다 놓겠습니다.\n");
			return null;//주소
		}
		else {	
    		lastmoney = firstmoney + m;
    		cnt_con = cnt_con - c;	    		
    		return new CONTAC600(c);
		}
   }
   
   public Tilenol saleTilenol(int m,int c) {
      if(cnt_t<c) {
      	System.out.println("타이레놀 약이" + (c-cnt_t) + "개 부족합니다");
  		System.out.println("다음에 준비해 놓겟습니다");
      return null;  
      }
      lastmoney=firstmoney+m;
      cnt_t-=c;
      return new Tilenol(c);   
   }
 /*  public  void tincnt(int m){
	   	System.out.println("타이레놀 약이" + (tilcnt - getTilcnt()) + "개 부족합니다");
		System.out.println("다음에 준비해 놓겟습니다");
   }
   public void concnt(int m) {
	   System.out.println("콘텍 약이" + (cnt - getTilcnt()) + "개 부족합니다");
		System.out.println("다음에 준비해 놓겟습니다");
   }*/
   public void Tilenosale(){
      System.out.println("타이레놀 몇개 주문하시겟습니까");
   }
   public void ConTACsale() {
	   System.out.println("콘텍600 몇개 주문하시겟습니까");
   }
   public void showPharmacist(){ //약사의 현재상황
      //작성위치
		System.out.println("\n"
				+"***************************************\n" 
				+ pharmacy_name + "약국\n" 
				+ "1. 남은 콘택600  : " + cnt_con + "개  \n" 
				+ "2. 남은 타이레놀 : " + cnt_t + "개  \n" 
				+ "3. 수입          : " + lastmoney +"원 \n"
				+"***************************************\n" );
   }
   
}