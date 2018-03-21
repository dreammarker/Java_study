package fruit;

class Plants{              //식물
	@Override
	public String toString() {
		return "Plants";
	}	
}

class Fruit extends Plants{ //과일
	@Override
	public String toString() {
		return "Fruit";
	}	
}

class Orange extends Fruit{ //오렌지
	@Override
	public String toString() {
		return "Orange";
	}	
}

class Apple extends Fruit{  //사과
	@Override
	public String toString() {
		return "Apple";
	}	
}
/*************************/
class Box{       //과일만 담을 상자. 
	Object ob; 

	Object get() {
		return ob;
	}

	void set(Object ob) {
		this.ob = ob;
	}	
}
/*************************/

class Box1<T>{       //과일만 담을 상자. 제네릭 클래스
	T ob; 

	T get() {
		return ob;
	}

	void set(T ob) {
		this.ob = ob;
	}	
}

class Box2<L, R>{       //제네릭 클래스. 기본타입 불가 그러나 자동으로 박싱되어 들어감
	L left;
	R right;

	void set(L l, R r) {
		left=l;
		right=r;
	}

	@Override
	public String toString() {
		return "Box2 [left=" + left + ", right=" + right + "]";
	}	
}

class Generic{
	<T,U> void show(T i1, U i2){        //<T,U>:컴파일러에게 제네릭 메소드라고 알려줌
		System.out.println(i1);
		System.out.println(i2);
	}	
}

class Box3{ //중요함....제네릭 메소드와 와일드 카드 중 와일드 카드를 사용하도록 권고됨
	static <T> void outbox(Box1<T> b){           //1.제네릭 메소드(모든 타입 가능)
		T o = b.get(); 
		System.out.println(o);	
//		b.set(new T()); 오류 생성자 이용못함
		b.set((T)new Object()); //상자에 넣기할 때 컴파일오류없이 그냥 지나감. 이것이 문제임 그래서 타입을 제한함.     
	}
	
	static void outbox1(Box1<? extends Fruit> b){  //1.와일드카드? 메소드
		Fruit o = b.get();    //상자에서 꺼내기만 가능
		System.out.println(o);	
		//b.set(new Fruit()); //상자에 넣기할 때 컴파일오류       
	}
	
	static <T extends Fruit> void outbox2(Box1<T> b){//2.제네릭 메소드(타입 제한)
		Fruit o = b.get(); //상자에서 꺼내기만 가능
		System.out.println(o);	
		//b.set(new Fruit()); //상자에 넣기할 때 컴파일오류
	}
		
	static void inbox(Box1<? super Fruit> b, Fruit o){//★3.Fruit타입 또는 Fruit의 부모만 올수 있도록 제한
		b.set(new Fruit());	//상자에 넣기만 가능
//		Fruit o = b.get();  //상자에 꺼내기할때 자식=부모 오류...	자식=부모	
	}	
}

public class FruitAndBox {
	public static void main(String[] args) {
		
		Box b = new Box();
		
		Orange o1 = new Orange();//오렌지 생성
		b.set(o1);
		Apple a1 = new Apple();
		b.set(a1);
		
		b.set("과일문자열"); //과일만을 담기위해 만든 상자에 문자열을 담을 수 있다.
		//그래서 문자열이 담길 때 컴파일 오류를 ....해결방법:제네릭 클래스
		
		Box1<Fruit> a = new Box1<Fruit>();  //객체생성시 타입이 결정됨.T를 Fruit로 결정 
		Box1<Orange> o = new Box1<Orange>(); //오렌지 상자
				
		a.set(new Fruit());
		a.set(new Apple());
		a.set(new Orange()); //과일 담을 상자에 오렌지 담을수 있다.오렌지가 자식이므로
		
		o.set(new Orange()); //오렌지를 담고
		//o.set("문자열");//컴파일 오류없이 ...해결책:컴파일오류를 만들수 있도록 제네릭 클래스로 설계
		
	
		Fruit a2=a.get(); 
		Orange o2=o.get();
		
		System.out.println(a2);
		System.out.println(o2);
		
		Box2<String, Integer> b2 = new Box2<String, Integer>(); //생성시 
		b2.set("사과", 3);//3은 기본타입->자동박싱되어 대입됨
		System.out.println(b2);
		
		Generic g = new Generic();
		g.<Fruit,Orange>show(a2, o2);
		//g.show(a2, o2);
		
		Box1<String> o3 = new Box1<String>();
		o3.set("문자열");
		Box3.outbox(o3);
		
		
		Box1<Fruit> o4 = new Box1<Fruit>();
		Box3.inbox(o4, new Fruit());		
		Box3.outbox(o4);
		
		
		
	}

}
