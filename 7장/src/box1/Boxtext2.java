package box1;
import box2.Box;
public class Boxtext2 {

	public static void main(String[] args) {
	
			box1.Box b=new box1.Box();
			
			
			b.setWidth(20);
			b.setColor("녹색");
			b.setHeight(24);
			b.setLenght(24);
			
			b.showSize();
			System.out.println(b);
			System.out.println(b.getColor());
	
			Box b2 = new Box(10.0, 20.0, 30.3);
			System.out.println(b2);
			
	
	}

}
