package method;

import java.util.Scanner;

public class StringCharAtExample {

	public static void main(String[] args) {
		//charAt()
		System.out.println("주민등록 번호 입력해 주세요(숫자만입력) : ");
		Scanner sc = new Scanner(System.in);
		int a1;
		String ssn = sc.next(); //엔터(\r\n:2바이트)까지 읽
		char sex = ssn.charAt(6);
		
		if(sex=='1'||sex=='3')
			System.out.println("남자입니다");
		if(sex=='2'||sex=='4')
			System.out.println("여자입니다");
		
		if(ssn.length()==13) {
			System.out.println("주민번호 자리수가 맞습니다");
		}
		else
			System.out.println("주민번호 자리수가 아닙니다");
		/********* 방법1 ***********/
		String year;
		
		if(sex<'3')
			year ="19" +ssn.substring(0, 2);
		else
			year ="20" +ssn.substring(0, 2);
		
		System.out.println(year + "년"
							+ssn.substring(2,4)+"월"
							+ssn.substring(4,6)+"일");
		//		int length=ssn.length();
//		System.out.println("입력한문자길이"+length);
	}

}
