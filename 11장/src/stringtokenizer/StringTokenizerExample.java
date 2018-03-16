package stringtokenizer;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text1 = "이준형 권준영 배경민";
		
		//how1: 전체 토큰 수를 얻어 for문으로 루핑
		StringTokenizer st = new StringTokenizer(text1);  //구분자의 기본:공백                     //구분문자 살려둠
		int countTokens = st.countTokens(); //꺼내지 않고 남아있는 토큰 수 :  (구분문자인 /까지 포함)
		//System.out.println(countTokens);
		
		/*for(int i=0; i<countTokens; i++) {  //i=0~2
			String token = st.nextToken();
			System.out.println(token);
		}
		*/
		
		for(int i=0; i<st.countTokens();i++) {
			System.out.println(st.nextToken());
		}
		System.out.println();
		
		//how2: 일반적인 방법,남아 있는 토큰을 확인하고 while문으로 루핑
		String text2 = "권혜진/권희지/윤슬기";
		st = new StringTokenizer(text2,"/");
		while( st.hasMoreTokens() ) {
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println();
		
		/*************************/
		//여러가지 구분문자로 문자열을 구분
		String text3 = "옥휘수/&김민재/김승환&^방석민";  
        st = new StringTokenizer(text3, "/&"); //구분문자 / 또는 &
        while( st.hasMoreTokens() ) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
		System.out.println();
     
        //구분문자로 문자열을 구분하고 구분문자는 살려둠
        String text4 = "옥휘수/$김민재$김승환#^방석민";  
        st = new StringTokenizer(text4, "/$#", true); //구분문자 / 또는 $ 또는 #
     	
		while( st.hasMoreTokens() ) {  //구분문자: /& /   & token이있을떄까지 반복
			String token = st.nextToken(); //하나씩끄집어낸다
			System.out.println(token);
		}
		String text5 =sc.nextLine();
		st = new StringTokenizer(text5,"/-");
		while( st.hasMoreTokens() ) {  //구분문자: /& /   & token이있을떄까지 반복
			String token = st.nextToken(); //하나씩끄집어낸다
			System.out.println(token);
		}
		
		System.out.println("주민등록 번호 입력해 주세요(-입력) : ");
		String ssn2=sc.nextLine();
		String[] number =ssn2.split("-");
		for(String n : number) {  //인덱스로 접근하지 않을 떄 사용 가능
			System.out.println(n);
		}
		
	}
}