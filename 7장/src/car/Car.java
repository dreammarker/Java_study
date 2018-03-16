package car;

class Car {
		//필드 = 멤버 변수(클래스를 구성하는 멤버이므로)
		String color; //클래스를 이루는건 필드
		int speed;
		private int gear;
		
		
		/*
		 * *생성자 없으면 컴파일러가 자동으로 기본생성자를 삽입
		 *  기본생성자 : Car(){}
		 *  	클래스의 접근제한자 같다.
		 */
	/*	void changeGear(int g) {
			gear
		}*/
		void setGear(int gear) {
			this.gear = gear;
		}  
		
		void speedUp() {
			speed=speed+10;
		}
		
		void sppedDown() {
			speed=speed-10;	
		}
		void showCar() {
			System.out.println("Car [color=" + color + ", speed=" + speed + ", gear=" + gear + "]");}

		@Override
		public String toString() {
			return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear + "]";
		}
		
		
}
