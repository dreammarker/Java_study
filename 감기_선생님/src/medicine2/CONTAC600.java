/*
 *  열214p-포함 관계로 캡슐화 완성하기
 */
package medicine2;

class S1   // 콧물 처치용 캡슐
{
	void take(){System.out.println("콧물이 싹~ 낫습니다.");}
}

class S2   // 재채기 처치용 캡슐
{
	void take() {System.out.println("재채기가 멎습니다.");}
}

class S3   // 코막힘 처치용 캡슐
{
	void take() {System.out.println("코가 뻥 뚫립니다.");}
}
	 
public class CONTAC600 //여러개의 클래스 중 public은 단 하나 = 파일이름
{
	private S1 s1; //필드,참조변수(주소)
	private S2 s2; //접근 불가,단 클래스 내에서만 접근 가능
	private S3 s3;
    int cnt;//만들어진 콘택600 수 = 주문한 콘택600 수
        
	public CONTAC600(int cnt)//생성자:반환형 없다.최초에 한번 필드 초기화
	{
		s1=new S1();
		s2=new S2();
		s3=new S3();
		this.cnt=cnt;
	}
	
	/*public CONTAC600()       //생성자:반환형 없다.최초에 한번 필드 초기화
	{
		s1=new S1();
		s2=new S2();
		s3=new S3();
		cnt=1;
	}*/
	
	public void take()//메소드:기능
	{
		s1.take();
		s2.take();
		s3.take();
	}
	
	//외부 패키지의 클래스에서 접근할때 public선언된 메소드를 통해서 간접접근
	public void show(){ 
		System.out.println("주문한 콘택600 수 : "+cnt);
		
	}
}

