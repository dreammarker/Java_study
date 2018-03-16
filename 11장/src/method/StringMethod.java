package method;

import java.util.Scanner;

public class StringMethod {
	public static void main(String[] args) {
				
		/***indexOf()********/
        String subject = "자바 프로그래밍";
                      //해당문자열의 시작 인덱스번호 리턴
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
		if(subject.indexOf("자바") != -1) {
			System.out.println("자바와 관련된 책이군요");
		} else {
			System.out.println("자바와 관련없는 책이군요");
		}
		
		System.out.println(); //구분하기 위한 빈줄
		
		/***replace()********/
		String newStr = subject.replace("자바", "JAVA");
	
		System.out.println(subject);
		System.out.println(newStr);
	                 //문자열의 수정본이 아니라 완전히 새로운 문자열 생성
		
		System.out.println(); //구분하기 위한 빈줄
		
		/***trim()**********/
		String tel1 = "  02"; 
		String tel2 = "123   ";
		String tel3 = "   1234   ";
		
		String tel = tel1.trim() + tel2.trim() + tel3.trim();//사용자가 의미없이 넣어준 앞뒤 공백 제거
		System.out.println(tel);                             //중간에 공백 제거는 안함
	
		System.out.println(); //구분하기 위한 빈줄
		
		/***toLowerCase():소문자, toUpperCase():대문자**********/
		String str1 = "Java"; //문자열 상수풀에 등록되어 공유
		String str2 = "JAVA"; //문자열 상수풀에 등록되어 공유	
		
		System.out.println(str1.equals(str2));
		
		
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2));
		
		System.out.println(str1.equalsIgnoreCase(str2));//대소문자 상관없이 비교			
	
		System.out.println(); //구분하기 위한 빈줄
		
		/***compareTo()******/
		if(str1.compareTo(str2) < 0) //같으면 0, 다르면 0이 아닌 수(양수,음수)
			System.out.println("str1이 앞선다");
	    else if(str1.compareTo(str2)>0)
			System.out.println("str2가 앞선다");
	    else System.out.println("두 문자열이 같다");
		
		System.out.println(); //구분하기 위한 빈줄
		
		/***compareTo()******/
		if(str1.compareTo(str2)==0)
			System.out.println("두 문자열이 같다");
		else
			System.out.println("두 문자열이 다르다");
		
		
		
		/***valueOf():기본 타입(int,double)을 문자열로 변환(static 메소드)********/
		str1 = String.valueOf(10); //클래스명.static 메소드    "10"
		str2 = String.valueOf(10.5);//"10.5"
		String str3 = String.valueOf(true);//"true"		
		
		char ch1=str3.charAt(2);
		System.out.println(ch1);
		char ch2=str3.charAt(2);
		System.out.println(ch2);
		
		System.out.println("*문자열*");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println(); //구분하기 위한 빈줄
		
		/***parse~() : 문자열을 기본 타입으로 변환하는 방법********/
		int v1 = Integer.parseInt(str1);
		double v2 = Double.parseDouble(str2);
		boolean v3 = Boolean.parseBoolean(str3);
		
		//Character.parseCharacter();//Character만 없다.이유:문자열을 문자하나로 변경불가
		char ch3 = str1.charAt(0); //그래서 charAt() 사용
		
		System.out.println("*기본타입*");
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
	}
}
