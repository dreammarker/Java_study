package television;

public class TVtest {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		TV tv = new TV();
		
		tv.onOff=true; //직접 접근
		TV.antena=200; //클래스명을 적고 .static변수 또는 메소드
//		if(tv.onOff==true);
		/*System.out.println("제조회사는"+tv.company+"채널은"+tv.channel+"볼륨"+tv.volume);
		*/
		tv.print();
		TV you=new TV("소니",15,30,true);
		
		you.channel=30; //직접 접근
		you.setChannel(50);
		
		you.print();
		
	}

}
