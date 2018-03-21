package abstract_method_use;

public interface RemoteControl {
	//상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드:반드시 자식이 재정의해줘야 함. 안하면 오류
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//디폴트 메소드. 구현객체 .클래스로 주소를 통해 접근
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	//정적 메소드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
