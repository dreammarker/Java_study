package pro4;

public class PhoneSizeException extends Exception {
	
	public PhoneSizeException(){
		super("더 이상 전화번호를 저장할 공간이 없습니다.");
	}

}
