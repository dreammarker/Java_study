package method;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "안녕하세요";
		
	/****기본 문자셋으로 인코딩과 디코딩*****/
		
		byte[] bytes1 = str.getBytes(); //인코딩
		System.out.println("bytes1.length: " + bytes1.length);
		
		String str1 = new String(bytes1);//디코딩
		System.out.println("bytes1->String: " + str1);
		
	
	//getBytes() 잘못된 문자셋을 매개값으로 줄 경우, 
	//java.io.UnsupportedEncodingException 예외가 발생하므로 예외 처리가 필요
			
		try {
			/****EUC-KR(기본값)을 이용해서 인코딩과 디코딩*****/	
			byte[] bytes2 = str.getBytes("EUC-KR");                        //MS949,EUC-KR2로 수정->예외발생
			System.out.println("bytes2.length: " + bytes2.length);
			
			String str2 = new String(bytes2, "EUC-KR");                    //"EUC-KR"생략가능(기본값이므로)
			System.out.println("bytes2->String: " + str2);
			
			/****UTF-8을 이용해서 인코딩과 디코딩*****/			
			byte[] bytes3 = str.getBytes("UTF-8");    //한글1자:3바이트
			System.out.println("bytes3.length: " + bytes3.length);
			                                          //String str3 = new String(bytes3, "EUC-KR"); //"EUC-KR"로 수정하면 한글 깨짐
			String str3 = new String(bytes3, "UTF-8");//"UTF-8"생략하면 한글이 깨진다.
			System.out.println("bytes3->String: " + str3);	
			
		} catch (UnsupportedEncodingException e) {
			// TODO 자동 생성된 catch 블록
//			e.printStackTrace();//예외종류, 순서, 라인(줄)
			System.out.println("문자셋이 맞지 않아요~");
		}
		
	}
}

