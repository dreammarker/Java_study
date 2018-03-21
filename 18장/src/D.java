
class A { 
	//기본 생성자 A(){super();}
}

class B extends A{
	//기본 생성자	B(){super();}
	void c(){System.out.println("B");}

}

class C extends B{
	//기본 생성자C(){super();}
	void c(){System.out.println("C");}
}

class E extends C{
	//기본 생성자E(){super();}
	void c(){System.out.println("E");}

}
public class D {

	public static void main(String[] args) {
		A a=new C(); //부모=자식객체
		((B)a).c();   //가장 맨 마지막에 재정의 된 메소드 호출되므로
		((C)a).c();	
		((E)a).c();
		System.out.println("끝");
	}
	

}
