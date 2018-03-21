package pro4;
            //[예외 클래스 만드는 방법]
            //1. 반드시 Exception 상속받아 예외 클래스 만들기
            //Exception 상속받아 만든 예외 클래스는 반드시 예외 처리를 해줘야함.
public class MenuChoiceException extends Exception{ 
	int wrongChoice;    //잘못된 번호
	
	MenuChoiceException(int wrongChoice) {
		//Exception() 생성자로 전달되는 문자열이 
		//e.getMessage() 메소드 호출시 반환되는 문자열
		super("잘못된 선택이 이뤄졌습니다.");
		this.wrongChoice = wrongChoice;
	}

	public void showWrongChoice()
	{
		System.out.println(wrongChoice+"에 해당하는 선택은 존재하지 않습니다.");
	}
}
