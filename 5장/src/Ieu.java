import java.util.Scanner;

//열자바104~118

//import java.lang.*;
//import java.util.Scanner;
public class Ieu {                                                          //  public Ieu(){} 생성자 : 클래스명과 이름이 반드시 같다

	public static void main(String[] args) {
		//Ieu i = new Ieu();
		//i.b();
		
		/*Scanner sc = new Scanner(System.in);// 키보드(=System.in)로 데이터를 입력받아
		
		System.out.print("수입력1:");                 //95엔터
		int n1 = sc.nextInt();*/                        // 정수로 입력
		
		/*System.out.println(n1);
		
		System.out.print("수입력2:"); 
		int n2 = sc.nextInt(); 
		System.out.println(n2);
		System.out.print("문자열입력1:"); 
		sc.nextLine();
		String s = sc.nextLine();//문자열 입력
		System.out.println(s);
		
		String s1="문자열1"; //문자열 상수->메소드 영역의 공유상수풀에 등록
		System.out.println(s1);
		
		String s2="문자열1";
		System.out.println(s2);
		
		String s3=new String("문자열1");//new 생성자로 객체 생성하면 공유상수풀에 등록되지 않고 완전히 새문자열객체를 만듦
		System.out.println(s3);
		
		if(s1 == s3) System.out.println("주소가 같다.");
		else System.out.println("주소가 다르다.");
		
		if(s1.equals(s3))System.out.println("문자열이 같다.");
		else System.out.println("문자열이 다르다.");*/
		
		
		/******홀수 / 짝수 판별*******/
		Scanner sc = new Scanner(System.in);
                       // 키보드(=System.in)로 데이터를 입력받아
		/*
        System.out.print("홀수 또는 짝수 판별합니다. 수 입력1:");     //95엔터
		
		int n1 = sc.nextInt();
	    //int n1 = 20;
		if(n1%2 == 0) {
			System.out.print("짝수"); //실행문장이 1줄이면 {}생략
			//System.out.println("입니다.");       
		}
		else {
			System.out.print("홀수");		
		    //System.out.println("입니다.");          
		}	
		System.out.println("입니다.");          //무조건 실행
		System.out.println();                   //구분하기 위한 빈줄
		
		
		*//******두 수 입력받아 두 수 중 큰수와 차이 구하기*********//*
		
		System.out.println("두 수 중 큰수가 어떤수이고 두수의 차가 얼마인지 알아보기");
		System.out.print("첫번째 수 입력:");
		//double n3 = sc.nextInt(); //실수=정수(자동형변환)
		double n3 = sc.nextDouble(); 
		System.out.print("두번째 수 입력:");
		double n4 = sc.nextDouble(); 

		//System.out.println(n3+"\t"+n4);
				
		System.out.print("두 수 중 큰 수:");
		
		double big; //큰수
		
		if(n3>n4) big = n3; 
		else big = n4; 		
		
		big = (n3>n4)?  n3: n4;  //변수 = (조건문)? 참 : 거짓
		                                                //System.out.printf("%.0f",big);
		System.out.println(big);
		
		
		
		
		
		
		
		
		
		
		 
        System.out.print("두 수의 차:");
        double diff;//차
        
		if (n3 > n4) diff = n3 - n4; 
		else diff = n4 - n3; 

	    diff = (n3 > n4) ? n3 - n4 : n4 - n3;
	                               //System.out.printf("%.0f",diff); //소수 첫째자리에서 반올림됨.
		System.out.println(diff);
		
		System.out.println();           //구분하기 위한 빈줄

		
       *//*******성적 등급 산출-1***********************//*
		
		System.out.print("점수입력1:");             
		int n5 = sc.nextInt();                      
		
		if (n5 >= 90) {                                        //if(조건문:참 또는 거짓을 결과로 돌려주는 것만 올 수 있다.)
			System.out.println("90보다 크다.");                // 참일때 실행.{}중괄호는 실행문이 2줄이상일때
			System.out.print("A");
		                                                       //System.out.println("학점");
		}
		if (n5 >= 80) {
			System.out.println("80보다 크고 90보다 작다.");// 거짓일 때 실행.실행문이 1줄일때 {}생략
			System.out.print("B");
		}
		if (n5 >= 70) {
			System.out.println("70보다 크고 80보다 작다.");// 거짓일 때 실행.실행문이 1줄일때 {}생략
			System.out.print("C");
		}
		if (n5 >= 60) {
			System.out.println("60보다 크고 70보다 작다.");// 거짓일 때 실행.실행문이 1줄일때 {}생략
			System.out.print("D");
		} 
		if (n5 < 60){
			System.out.println("다음 학기에 다시 수강하세요");
			System.out.print("F");
			
		}
		//System.out.println("학점");//무조건 실행
		
		
		if(n5>=60) System.out.println("학점"); //60점 이상일때만 실행
		System.out.println();   //빈줄
		
		*//******성적 등급 산출-2******************//*	
		
		System.out.print("점수입력2:"); //95엔터
		int n6 = sc.nextInt(); // 정수로 입력
		
		if (n6 >= 90) { //if(조건문:참 또는 거짓을 결과로 돌려주는 것만 올 수 있다.)
			System.out.println("90보다 크다.");// 참일때 실행.{}중괄호는 실행문이 2줄이상일때
			System.out.print("A");
			//System.out.println("학점");
		} else if (n6 >= 80) {
			System.out.println("80보다 크고 90보다 작다.");// 거짓일 때 실행.실행문이 1줄일때 {}생략
			System.out.print("B");
		} else if (n6 >= 70) {
			System.out.println("70보다 크고 80보다 작다.");// 거짓일 때 실행.실행문이 1줄일때 {}생략
			System.out.print("C");
		} else if (n6 >= 60) {
			System.out.println("60보다 크고 70보다 작다.");// 거짓일 때 실행.실행문이 1줄일때 {}생략
			System.out.print("D");
		} else {//마지막.이유:조건문이 필요없으므로
			//System.out.println("다음 학기에 다시 수강하세요");
			System.out.println("F학점");
			System.out.println("다음 학기에 다시 수강하세요");
		}
		//System.out.println("학점");//무조건 실행
	
		
		
		if(n6>=60) System.out.println("학점"); //60점 이상일때만 실행
		
		System.out.println();           //빈줄
		
		
		 열112
		 * switch(1. 변수(정수/'문자'/"문자열")
		 *        2. 메소드(소문자~()):(정수/'문자'/"문자열")을 리턴해주는 메소드
		 *        3. 연산식:그 결과가 정수/'문자')
		 *        
		 * if~else if~else if~else와 비슷
		 
		
				
				
																		
																		 ** switch(1. 변수(정수/문자/문자열)
																		 *         2. 정수,'문자', "문자열"
																		 *         3. 정수, 문자, 문자열을 반환하는 연산식/메소드 ) 
																		 * case 정수/'문자'/"문자열" 상수 형태로 (예:1    'a'    "아메리카노"
																		 * if~else if~else if~else와 비슷
																		 ***
		System.out.print("점수입력3:");                           //90엔터
		int num = sc.nextInt();                                   //공백(엔터 탭 빈칸)을 구분자로 하여 공백이 나오면 무시
		
		
		switch( num )   //97                  //b(num)                                        //switch( a() ) //10
		{
		    case 100: //100
		    	System.out.println("100"); 
		    	break;
		    case 90: 
				System.out.println("90"); break;
			case 80:  
				System.out.println("80"); break;
			case 70:  
				System.out.println("70"); break;
			case 60:  
				System.out.println("60"); break;
			default:  
				System.out.println("그외"); //break; 생략가능
		}

		switch (num / 10)           //   95/10=9
		{
			case 10:
				System.out.println("만점입니다.대단해요~");
				System.out.print("A");
				break; //switch문 빠져나옴
			case 9:
				System.out.print("A");
				break;
			case 8:
				System.out.print("B");
				break;
			case 7:
				System.out.print("C");
				break;
			case 6:
				System.out.print("D");
				break;
			default:
				System.out.print("F");// break;//생략가능
		}
		System.out.println("학점");
		
		System.out.println();   //빈줄
		*/
		
		
		
		
		/***String 클래스:문자열 설명*******/
		
		String s1 = "아메리카노"; //"문자열상수"String만 이 방법으로 객체생성이 가능하다.
		String s2 = "아메리카노"; //공유		
		
		//주소 비교는 의미가 없다.
		if(s1==s2) System.out.println("동일한 주소");
		else System.out.println("다른 주소");
		
		if(s1.equals(s2)) System.out.println("같은 문자열1");//같으면 TRUE
		else System.out.println("다른 문자열1");
		
		String s3 = new String("아메리카노");
		
		if(s1==s3) System.out.println("동일한 주소");
		else System.out.println("다른 주소");
		
		if(s1.equals(s3)) System.out.println("같은 문자열2");//같으면 TRUE
		else System.out.println("다른 문자열2");
		
       /*********카페에서 커피 주문****************/
		
		System.out.print("주문하시겠습니까? "
				+ "아메리카노 주문, 카페라떼, 까푸치노, 주문안함 "
				+ "글자를 입력하세요:");
		
		
		
		/*sc.nextLine(); //★버퍼 제일 앞에 위치한 엔터를 처리하기 위해
		String s = sc.nextLine(); // "문자열" 입력.★엔터까지 입력받아 엔터 버리고 
		                                          //나머지로 문자열 객체 생성
*/		
		
		
		String s = sc.next();//공백(엔터 탭 빈칸)을 구분자로 하여 
		                     //공백이 나오면 무시
		
		coffee_cafe(s);
		/*switch (s) {
			case "아메리카노":    //정수, '문자', "문자열"                                                //"1" 숫자를 입력하면
				System.out.println("아메리카노 주문하셨습니다.");
				break;
			case "카페라떼":
				System.out.println("카페라떼 주문하셨습니다");
				break;
			case "카푸치노":
				System.out.println("카푸치노 주문하셨습니다");
				break;
			default:
				System.out.println("주문하지 않으셨습니다.");
				//break;
		}*/
        		
		                                                                         //c(s4);             
       sc.close();
	}
	
	static int b(int num){
		return num+10; 
	 }
	
	
	
	static int a(){
		return 90;
		//return "a";
	}
	
	/*void b(){
		System.out.println("b호출");
	}
	*/
	
    static void coffee_cafe(String s){ //리턴값이 없다
    	switch (s) {
			case "아메리카노": 
				System.out.println("아메리카노 주문하셨습니다");
				break;
			case "카페라떼":
				System.out.println("카페라떼 주문하셨습니다");
				break;
			case "카푸치노":
				System.out.println("카푸치노 주문하셨습니다");
				break;
			default:
				System.out.println("주문하지 않으셨습니다.");
				//break;
	    }
	}
}


