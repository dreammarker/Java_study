package box1;

/*import java.lang.*; //rt.jar
 *            util.Scanner; 
 *다른 패키지에 있는 클래스를 import하려면 이때 해당 클래스가 public이어야 가능 
 *
 * 접근제한자(2개) 클래스=접근제한자(4개) 필드,멤버변수,인스턴스(객체)변수(일반변수:0 false,참조:null)+메소드     
 *       ★생성자:필드초기화->객체생성. 생성자는 객체안에 존재하지 않음.
 *         접근제한자(4개) 반환형X 클래스명(매개변수,..){}
 *         만약 생성자가 없으면:컴파일러가 자동으로 기본생성자 삽입
 *                             클래스명(){}
 *                              
 *         생성자(){
 *            super()//반드시 첫줄. 생략가능->컴파일러가 자동으로 삽입
 *                   //부모생성자 호출->부모생성->자식 생성
 *         }
 *         
 *         생성자 오버로딩:여러개의 생성자 정의
 *                         컴파일러가 알아서 호출
 *         this():생성자 안에서만 사용가능. 다른 생성자 호출. 
 *                매개변수가 작은 생성자에서 사용 코드 줄이는 효과
 *                
 * this.:자기자신의 주소, 객체안에만 존재, static은 사용 불가
 * 
 *       ★접근제한자(4개) 반환형(=리턴타입,x면 void) 메소드(매개변수,...){
 *       
 *        }
 *        메소드 오버로딩
 *        get~(){return 필드값;} : 필드값을 알고 싶을 때
 *        set~(필드에 입력할 값){필드=값} :필드에 값을 입력하고 싶을 때 호출
 *        
 *        private 필드:클래스 내에서만 접근
 *                     필드값을 알고 싶을 때-get~()메소드를 호출하여 간접적으로 알수 있다.
 *                                         
 * 접근 제한자
 * 1.클래스 : public, default 
 * 2.필드, 메소드, 생성자 :public - 모든 클래스에서 접근가능 
 *                        protected - 같은 패키지의 클래스와 다른 패키지의 자식은 접근가능
 *                        default -같은 패키지의 클래스만 접근가능
 *                        private - 같은 클래스내에서만 접근가능
 *                        
 *  
 * 메모리 올리는 법
 * 1.static(공유):객체 생성없이 바로 메모리에 올라감
 *                메모리에 올라갈 때 초기화 - 클래스이름으로 접근
 *                static{복잡한 초기화 단계}
 * 2.생성자 호출->객체생성 : 참조변수(주소)로 접근
 *               
 * final :필드-값 수정 불가
 *            -최초의 1번의 초기화(방법1:생성자를 통해서->객체마다 다른값, 
 *                                방법2:=직접값입력->객체마다 값이 동일)
 *        클래스-상속 불가
 *        메소드-재정의(상속받아 수정) 불가
 *        
 * 상수:final static double PI = 3.14; //공유. 값수정불가. 값변경시 효율적
*/
 class Box {
	 static final String maker="김민재";
	 private String color;
		int width;  //가로 기본값0. private-같은 클래스 내에서만 접근
		int height; //세로 0
		int lenght;  //높이 0
		
		//Box(){}기본 생성자
		//객체가 만들어질려만 반드시 객체를 생성해야한다.
		//기본생성자가 하나도 없을때 컴파일러가 자동 삽입
		Box(){
																
		}
		
	
		Box(int width, int lenght) {
			super();
			this.width = width;
			this.lenght = lenght;
			height=100; //높이가 100
		}


		Box(int width, int height, int lenght) {
/*//		super();  //반드시 첫줄에, 부모생성자 호출->부모객체 생성
			color="파랑";
			this.width = width;
			this.height = height;
			this.lenght = lenght;*/
			this("파랑",width,lenght,height); //반드시 생성자안에서만 사용. 다른 생성자 호출
		}


		Box(String color, int width, int height, int lenght) {
//			super();   //기본값으로 없으면 자동으로 컴파일러가 삽입해줌
			this.color = color;
			this.width = width;
			this.height = height;
			this.lenght = lenght;
		}


		String getColor() {
			return color;
		}


		void setColor(String color) {
			this.color = color;
		}


		int getWidth() {
			return width;
		}


		void setWidth(int width) {
			this.width = width;
		}


		int getHeight() {
			return height;
		}


		void setHeight(int height) {
			this.height = height;
		}


		int getLenght() {
			return lenght;
		}


		void setLenght(int lenght) {
			this.lenght = lenght;
		}
		void showSize() {
			System.out.println("상자의 제조사:"+maker+" 색깔, 가로, 세로, 높이는"+color+","+width+","+height+"입니다");
		}


		@Override
		public String toString() {
			// TODO 자동 생성된 메소드 스텁
			return "박스의 가로, 세로, 높이는"+width+","+lenght+","+height;
		}


/*		@Override
		public String toString() {
			return "Box [color=" + color + ", width=" + width + ", height=" + height + ", lenght=" + lenght + "]";
		}*/
 }
