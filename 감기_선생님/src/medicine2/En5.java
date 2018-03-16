package medicine2;

import medicine2.Sc;
import medicine2.CONTAC600;
import medicine2.Pharmacist5;
import medicine2.Tylenol;

class ColdPatient //감기환자
{
	int firstmoney;     //처음 가진 돈
	int lastmoney;      //약 사고 남은 돈
	int cnt_con;        //콘택600 개수
	int cnt_t;          //타이레놀 개수
		
	public ColdPatient(int money) {   //생성자
		//super(); 생략하면 컴파일러가 자동으로 삽입 → 부모 생성자를 먼저 호출하여 부모 객체를 만든 후 
		firstmoney = money;  //→ 자식 객체를 만든다.
		lastmoney = money;
	}
	
	CONTAC600 buyCONTAC600(Pharmacist5 pm, int money, int cnt_con){  //약사에게 돈을 주고 약을 산다.
		CONTAC600 con = pm.saleCONTAC600(money, cnt_con);  //약사는 돈을 받고 약을 판다.
		if(con != null) {
			lastmoney -= money;      
			this.cnt_con += cnt_con;
		}
		return con;
	}
	
	void takeCONTAC600(CONTAC600 cap){ //CONTAC600 먹기
		cap.take(); 
	}
	
	Tylenol buyTylenol(Pharmacist5 pm, int money, int cnt_t){  //약사에게 돈을 주고 약을 산다.
		Tylenol t = pm.saleTylenol(money, cnt_t);  //약사는 돈을 받고 약을 판다.
		if(t != null) {
			lastmoney -= money;      
			this.cnt_t += cnt_t;
		}
		return t;
	}
	
	void takeTylenol(Tylenol cap){ //타이레놀 먹기
		cap.take(); 
	} 
	
	void showColdPatient(){   //감기환자의 현재 상태 출력
		/*System.out.println(firstmoney+"원을 가진 감기환자는 " + 
						"콘택600은 " + cnt_con + "개 사고 \n" +
						"타이레놀은 " + cnt_t + "개 사서  \n" + 
						lastmoney +"원의 돈이 남았습니다.");		
		*/
		System.out.println("\n"
				+"***************************************\n" 
				+ "감기환자\n"
				+ "1. 처음 가진 돈	 : "+ firstmoney + "원 \n" 
				+ "2. 구입한 콘택600  : " + cnt_con + "개  \n" 
				+ "3. 구입한 타이레놀 : " + cnt_t + "개  \n" 
				+ "4. 지출하고 남은 돈: " + lastmoney +"원 \n"
				+"***************************************\n" );
	}	
}

/*class Sc{
	static Scanner s=new Scanner(System.in);
}*/

public class En5
{
	public static void main(String args[])
	{   
		//Pharmacist5.Tylenol_PRICE=10;
		ColdPatient p = new ColdPatient(10000); //10000원 가진 환자 객체 생성하여 그 주소를 c에 저장
		
		Pharmacist5 pm = new Pharmacist5("예담", 0, 1, 2, 1000);  //돈은 없고 콘택600은 100개,타이레놀 200개의 약을 가진 약사 객체 생성하여 그 주소를 pm에 저장
		//Pharmacist5 pm2 = new Pharmacist5("대구", 0, 10, 20, 2000);
		
		String s1;
		int cnt;
				
		do{	
		   /*System.out.println("\n손님, 콘택600은 1개에 " + Pharmacist5.CONTAC600_PRICE 
				           +"원, 타이레놀은 1개에 " + Pharmacist5.Tylenol_PRICE + "원입니다. :" );*/
						
			pm.menuExplain(); //약 종류와 가격 설명
			pm.menuWhat();
			
			s1 = Sc.s.next(); //클래스명.참조변수.메소드()
			
			if(s1.equals("안사요")) {
				//System.out.println("안녕히 가세요~");
				break;
			}
			
		    switch(s1){		    
			  case "콘택600" :
				System.out.print(s1 + " 몇 개 드릴까요?(예:3) :" );
				cnt = Sc.s.nextInt();  //약의 개수를 입력받기, static이므로 클래스명Sc.참조변수s
				CONTAC600 con=p.buyCONTAC600(pm, cnt*pm.CONTAC600_PRICE, cnt);   //주체:환자는 약사에게 약값을 주고 약개수만큼 약 사기
				if(con!=null) p.takeCONTAC600(con);     //환자는 약을 받아 먹기
     			break;
			  
			  case "타이레놀" :
				System.out.print(s1 + " 몇 개 드릴까요?(예:3) :" );
				cnt = Sc.s.nextInt();  //약의 개수를 입력받기, static이므로 클래스명Sc.참조변수s
				Tylenol t=p.buyTylenol(pm, cnt*Pharmacist5.Tylenol_PRICE, cnt);   //주체:환자는 약사에게 약값을 주고 약개수만큼 약 사기
				if(t!=null) p.takeTylenol(t);          //환자는 약을 받아 먹기
				break;
			 
			  case "그만요" :
				p.showColdPatient();       //환자의 현재 상태 출력
				pm.showPharmacist();       //약사의 현재 상태 출력
			    break;
			  
			  default : System.out.println("잘못 주문하셨습니다.\n");
		    }
		}while(!(s1.equals("그만요")));	
		
		System.out.println("안녕히 가세요.\n");
	}
}

