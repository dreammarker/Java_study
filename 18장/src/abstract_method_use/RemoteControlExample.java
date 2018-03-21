package abstract_method_use;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = null;
		/***인터페이스의 다형성:
		 *  구현객체를 교체함으로써 프로그램의 실행 결과가 다양해짐***/
		rc = new Television(); //부모인터페이스=구현객체1
		rc.turnOn();
		rc.turnOff();
		
		rc = new Audio(); //구현객체2로 교체만 시키면 
		rc.turnOn();       //실행 결과가 다행해진다.
		rc.turnOff();
	}
}
