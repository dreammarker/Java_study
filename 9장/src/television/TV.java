package television;

public class TV {
	final String company;
	int channel;
	int volume;
	boolean onOff;
	static int antena;  //클래스 변수
	
	static { //복잡한 식같은건 static 에 넣어서 만든다.
		int hap=0;
		for(int i=2;i<=100;i+=2) {
			hap+=i;
		}
		antena=hap;
	}
	
	public TV() {
		company="삼성";
	}
	
	public TV(String company, int channel, int volume, boolean onOff) {
		super();
		this.company = company;
		this.channel = channel;
		this.volume = volume;
		this.onOff = onOff;
	}

	int getChannel() {
		return channel;
	}

	void setChannel(int channel) {
		this.channel = channel;
	}

	int getVolume() {
		return volume;
	}

	void setVolume(int volume) {
		this.volume = volume;
	}

	boolean isOnOff() {  //is~() 메소드의 리턴 값은 참 또는 거짓
		return onOff;
	}

	void setOnOff(boolean onOff) {
		this.onOff = onOff;
	}

	String getCompany() {
		return company;
	}
	void print() {
		if(onOff==true)
		System.out.println("제조회사는"+company+"채널은"+channel+"볼륨"+volume);
		
	}


	
	
}
