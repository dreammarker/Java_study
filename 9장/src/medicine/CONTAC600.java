package medicine;

class s1
{
	void take() {
		System.out.println("콧물이 나았습니다");
	}
}
class s2
{
	void take() {
		System.out.println("재채기가 멎습니다");
	}	
}
class s3
{
	void take() {
		System.out.println("코가 뻥 뚫립니다");
	}	
}

public class CONTAC600{
	private s1 s1;       //생성자 생성
	private s2 s2;
	private s3 s3;
	int cnt;
	public CONTAC600(int cnt){
		s1=new s1();       //객체 생성
		s2=new s2();
		s3=new s3();
		this.cnt=cnt;
	}
	
	public void take() {
		s1.take();       //한번에 출력
		s2.take();
		s3.take();
	}
	public void show() {
		System.out.println("주문한 콘택600 수 : "+cnt);
	}
}