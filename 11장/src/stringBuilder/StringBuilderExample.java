package stringBuilder;

public class StringBuilderExample {

	public static void main(String[] args) {
		// StringBuilder sb = new String(); //16개의 초기버퍼 만듬 딘일쓰레드
		StringBuffer sb =new StringBuffer(); //멀티쓰레드에서 사용 
		
		sb.append("Java");  //버퍼에 추가
		sb.append("Program Study");
		System.out.println(sb);
		System.out.println(sb.toString());
		
		sb.insert(4,'2');   //줄서기할 때 새치기 . '2',2로 수정해도 결과는 같다           
		System.out.println(sb);
		
		sb.setCharAt(4, '9'); //인덱스4에 대항하는문자 변경
		System.out.println(sb);
		
		sb.replace(6, 13, "Book"); //인덱스 6~12
		System.out.println(sb);
		
		sb.delete(4, 5); //4~4 즉 4
		System.out.println(sb);
		
		sb.insert(4, true);
		System.out.println(sb);
	
		int length = sb.length(); //문자수
		System.out.println("총문자수 : "+length);
		
	}

}
