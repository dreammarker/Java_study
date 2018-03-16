package constructor;

import java.io.IOException;

public class KeyboardToStringExample {

	public static void main(String[] args) throws IOException{
		/*
		 * 1.예외 처리방법 
		 
			byte[] bytes=null;
			int readByteNo=0;
			try {
				bytes = new byte[100];
				System.out.println("입력: ");
				readByteNo = System.in.read(bytes); //IOException예외 발생 가능성.
			} catch (IOException e) {
				e.printStackTrace();
			}*/
			/*
			 * 1.예외 처리방법 -2
			 * throws IOException로 처리하라고 던진다.a
			 */
				byte[] bytes = new byte[100];;
				System.out.println("입력: ");
				int readByteNo = System.in.read(bytes); //IOException예외 발생 가능성.
		
		String str= new String(bytes,0,readByteNo-2); //
								//문자수 -2 만큼 문자열을 만든다.
		System.out.println(str);
		System.out.println(readByteNo);// 엔터 -> \r(13) \r(10)
	}

}
