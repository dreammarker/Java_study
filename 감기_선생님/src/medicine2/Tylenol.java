/*
 * 열213p-하나의 클래스로 캡슐화 완성하기(2번째 방법)
 */
package medicine2;

/*class T1   // 두통 처치용 캡슐
{
	void take(){System.out.println("두통이 낫습니다.");}
}

class T2   // 복통 처치용 캡슐
{
	void take() {System.out.println("복통이 낫습니다.");}
}*/


	 
public class Tylenol //외부에 노출
{
	//private T1 t1; //필드,참조변수(주소)
	//private T2 t2; //접근 불가,단 클래스 내에서만 접근 가능
	int cnt;	   //만들어진 타이레놀 수 = 주문한 타이레놀 수															
		
	public Tylenol(int cnt)//생성자:반환형 없다.최초에 한번 필드 초기화
	{
		//t1=new T1();
		//t2=new T2();
		this.cnt=cnt;																
	}
	
	private void take_T1(){System.out.println("두통이 낫습니다.");}
	private void take_T2() {System.out.println("복통이 낫습니다.");}
	
	public void take()//메소드:기능
	{
		//t1.take();
		//t2.take();
		take_T1();
		take_T2();
	}
	
	
	//외부 패키지의 클래스에서 접근할때 public선언된 메소드를 통해서 간접접근
	public void show(){ 
		System.out.println("주문한 타이레놀 수 : " + cnt);
		
	}
}

