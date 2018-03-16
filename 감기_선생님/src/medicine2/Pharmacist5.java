/**
 * 이름이 있는 약사
 */
package medicine2;

import medicine2.CONTAC600;

public class Pharmacist5{
		public String pharmacy_name;         //약국 이름 공개는 하되 수정 불가하도록
		
		private int firstmoney;     //처음 가진 돈
	    private int lastmoney;      
	    
    	private int cnt_con;        //콘택600 갯수
    	private int cnt_t;          //타이레놀의 갯수
    	
    	public CONTAC600 contac;
    	public Tylenol t;
    	
    	public final int CONTAC600_PRICE;  //final:최초의 한번은 초기화->생성자를 통해서
    	//public static final int Tylenol_PRICE = 2000;  //상수
    	public static final int Tylenol_PRICE;
		
    	
    	/*
    	 * static 초기화 블록:복잡한 식이나 메소드 호출할 때 사용
    	 * 컴파일된 클래스 로딩시 단 한 번 실행이 되는 영역 
    	 */
    	static {  
    		/*int price=0; 
    		for(int i=1;i<=10;i++) {
    			price += 200;
    		}*/
    		Tylenol_PRICE = tylenol_price();
    	}
    	
    	static int tylenol_price(){
    		int price=0;
    		for(int i=1;i<=10;i++) {
    			price += 200;
    		}
    		return price;
    	}
    	
		public Pharmacist5(String pharmacy_name, int money, int cnt_con, int cnt_t, int CONTAC600_PRICE) {
			this.pharmacy_name = pharmacy_name;
			firstmoney = money;
			lastmoney = money;
			this.cnt_con = cnt_con;
			this.cnt_t = cnt_t;
			
			this.CONTAC600_PRICE=CONTAC600_PRICE;
			
			//contac = null;
			//t = null;
		} 
		
		public void menuExplain(){ //약 종류와 가격 설명
			System.out.println("\n손님, 콘택600은 1개에 " + CONTAC600_PRICE 
			           +"원, 타이레놀은 1개에 " + Tylenol_PRICE + "원입니다." );
		}
    	
		public void menuWhat(){
			System.out.print("무슨 약 드릴까요?(콘택600, 타이레놀, 그만요, 안사요) :" );
		}
		
    	public CONTAC600 saleCONTAC600(int m, int c){
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
    	
    	public Tylenol saleTylenol(int m, int c){
    		if(cnt_t < c) {
    			System.out.println("<약사>.\n"
    					         + "지금 타이레놀이 부족합니다.\n"
    					         + "남은 약은 " +cnt_t+"개 밖에 없습니다.\n"
    					         + "다음에 가져다 놓겠습니다.\n");
    			return null;
    		}
    		else {	
    			lastmoney = firstmoney + m;
	    		cnt_t = cnt_t - c;
	    		return new Tylenol(c);
	    		
    		}
    	}
    	
    	public void showPharmacist(){
    		/*System.out.println("\n" + pharmacy_name + "약국의 약사는 " + 
    						"콘택600은 "  + cnt_con + "개 남았고  \n"+ 
    						"타이레놀은 "+ cnt_t + "개 남았으며  \n"+ 
    						money +"원의 돈을 벌었습니다.");
    		*/
    		System.out.println("\n"
    				+"***************************************\n" 
    				+ pharmacy_name + "약국\n" 
    				+ "1. 남은 콘택600  : " + cnt_con + "개  \n" 
					+ "2. 남은 타이레놀 : " + cnt_t + "개  \n" 
					+ "3. 수입          : " + lastmoney +"원 \n"
					+"***************************************\n" );
    	}
    }

