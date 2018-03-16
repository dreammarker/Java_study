
public class StringExam {

	public static void main(String[] args) {
		// 문자열은 객체 생성방법 2가지
		String st1 = "Coffee"; //문자열 상수. 공유
		String s1 = "Coffee";
		
		if(st1==s1)System.out.println("같은 객체를 참조한다.");
		else System.out.println("다른 객체를 참조한다.");
		String s2 = new String("Coffee");
		
		if(s1==s2)System.out.println("같은 객체를 참조한다.");
		else System.out.println("다른 객체를 참조한다.");
		
		//주소 비교 의미없다. 값 비교해야 되므로 equals()메소드 이용
		/***equals()문자열의 값을 비교하여 같으면 참, 다르면 거짓을 리턴해줌**/
		if(s1.equals(s2))System.out.println("문자열이 같다.");
		else System.out.println("문자열이 다르다.");
		
		
		/***concat() : 문자열 연결**/
		String st2 = "Bread";
		
//		String st3 = "Coffee".concat("Bread");
		String st3 = st1.concat(st2); //"coffee"+"Bread"=새로운 문자열객체를 생성해준다 "coffeebread"
		System.out.println(st3);
		
		String st4 = "Fresh".concat(st3);
		System.out.println(st4);
		/***subString():문자열에서 부분문자열객체를 생성***/
		String st5 = st1.substring(2); //인덱스 2~끝까지 가지고 와서 부분 문자열 객체 생성
		System.out.println(st5);
		
		String st6 = st1.substring(2,4); //인덱스 2~3까지 가지고 와서 부분 문자열 객체 생성
		System.out.println(st6);
		
		/**compare():문자열 비교하여 같으면 0, 다르면 0이 아닌 수를 결과로 리턴해줌.
		 *각 문자들은 메모리 안에서 2진수로 존재
		 *2진수로 존재하는 각 문자들을 빼서 0이면 같은 문자열.
		 * 0이 아니면 다른 문자열임**/
		if(st1.compareTo(s1)==0) //각 문자들은 메모리 안에서 2진수로 존재
			System.out.println("두 문자열은 일치합니다.");
		else if(st1.compareTo(st2)<0) //"a~" - "c~" = 음수
			System.out.println("사전의 앞에 위치하는 문자: "+st1);
		else
			System.out.println("사전의 앞에 위치하는 문자:"+st2);
	
		/**value of():기본타입->문자열로 **/
		int n1=123;
		int n2=223;
		
		double n3=123.4;
		s1=String.valueOf(n3);  //클래스명.static 메소드() 123.4 -> "123.4"
		int n4=s1.length();//문자열의 길이를 구해준다
		System.out.println(n4);
		String ss2=s1.substring(1, 2); //인덱스 1~1까지 "2"
		s2=s1.substring(1,2);
		s2=s1.substring(1,s1.length()-3);
		char ch1= s1.charAt(1); //문자열에서 원하는 1개의 문자 추출.
		
		char ch=48;
		System.out.println((int)ch);
		String.valueOf(ch);
	
	}

}
