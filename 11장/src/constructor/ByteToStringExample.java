package constructor;

public class ByteToStringExample {

	public static void main(String[] args) {
						//키코드
		byte[] bytes = { 72, 101, 108, 108,111,32,74,97,118,97,37};
		String str1=new String(bytes);
		System.out.println(str1);
		
		String str2 = new String(bytes, 6,4 );
		System.out.println(str2);
		
		System.out.println();  //구분하기 위한 빈줄
		
		/***indexOf*****/
		String subject ="자바 프로그래밍";
				//해당문자열의 시작 인덱스번호 리턴
		int location = subject.indexOf("프그래밍");  //indexOf문자열찾기 없으면-1
		System.out.println(location);
	
		if(subject.indexOf("자바")!=-1) {
			System.out.println("자바와 관련된 책이군요");
		}
		else
			System.out.println("자바와 관련없는 책이군요");
		
		System.out.println();
		
		/****
		 *replace 대체하는것 
		 */
		
		
	}

}
