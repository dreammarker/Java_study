package field_array;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		
		myCar.tires[0] = new KumhoTire(); //금호타이어로 교체
		myCar.tires[1] = new KumhoTire();
		
		myCar.run();
	}
}
