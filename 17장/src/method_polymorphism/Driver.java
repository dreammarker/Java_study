package method_polymorphism;

public class Driver {
	public void drive(Vehicle vehicle) { //부모 인터페이스<= 구현객체 :자동형변환
		vehicle.run();
	}
}
