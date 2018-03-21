package method_polymorphism;

public class DriverExample {
	public static void main(String[] args) {
//		Driver driver = new Driver();
		
		Bus bus = new Bus(); //구현객체1
		Taxi taxi = new Taxi();//구현객체2
		
		Driver driver = new Driver();
		driver.drive(bus);
		driver.drive(taxi);
	}
}
