package field_array;

public class Car {
	Tire[] tires = {  //부모인터페이스 타입 배열로 선언
		new HankookTire(),
		new HankookTire(),
		new HankookTire(),
		new HankookTire()
	};
	
	void run() {
		for(Tire tire : tires) {
			tire.roll();
		}
	}
}
