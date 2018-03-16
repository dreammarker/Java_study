package car;

 class CarTest {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Car myCar = new Car();
		
		myCar.speed=5;
		myCar.setGear(1); //private 필드
		myCar.speedUp();
		myCar.showCar();
		
//		System.out.println(myCar);
	}

}
 