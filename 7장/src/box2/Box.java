package box2;
/**
 * 객체 해시코드란? 객체를 식별할 하나의 정수값(객체마다 다른 값을 가짐)
 * 
 * Object 클래스의 toString()메소드는 
 * 객체의 문자정보를 리턴한다.
 * 객체의 문자정보란 객체를 문자열로 표현한 값을 말한다.
 * 기본적으로 Object 클래스의 toString()메소드는 
 * "클래스명@16진수해시코드"로 구성된 문자 정보를 리턴한다.
 * 
 * Object 클래스의 toString()메소드의 리턴값은 자바 애플리케이션에서는 
 * 별 값어치가 없는 정보이므로 
 * Object 하위 클래스는 toString()메소드를 재정의하여 
 * 간결하고 유익한 정보를 리턴하도록 되어 있다.
 * 
 */
 public class Box {
	 double width;
	 double length;
	 double height;
	 
	 public Box(){}

	 public Box(double width, double length, double height) {
		super();
		this.width = width;
		this.length = length;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Box [width=" + width + ", length=" + length + ", height=" + height + "]";
	}
	 
	
		 
	 
 }
 
 
 
 
 