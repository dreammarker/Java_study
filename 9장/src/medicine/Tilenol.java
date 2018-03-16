package medicine;
/**
 * 캡슐화 만들기 두번째 방법
 */

/*class a1
{
   void take() {
      System.out.println("두통이 낫습니다");
   }
}
class a2
{
   void take() {
      System.out.println("복통이 낫습니다");
   }
}*/
public class Tilenol {
//   private a1 s1;
//   private a2 s2;
   int cnt;
   
   public Tilenol(int cnt) {
//      s1=new a1();
//      s2=new a2();
      this.cnt=cnt;
   }
   private void take_T1() { System.out.println("두통이 낫습니다");}
   private void take_T2() { System.out.println("복통이 낫습니다");}
   
   public void take() {
	  
	   take_T1();
	   take_T2();
//      s1.take();
//      s2.take();
   }
   public void show() {
      System.out.println("주문한 타이레놀 수"+cnt+"입니다");
   }
   
}