/**
 * 클래스= 필드+생성자(반드시) +메소드
 * */

class Man2 {  //사람.부모
    String name;  //이름

 /*   public Man2(String name) {
        this.name = name;
    }
*/
    public void tellYourName() { 
        System.out.println("My name is " + name); 
    }

    public String getName() {
		return name;
	}


    public Man2(String name) {
	super();  //
	this.name = name;
}

}

class BusinessMan2 extends Man2 { //Man2를 상속 받아서 확장했다.
    String company; 
    String position;
    
    public BusinessMan2(String name, String company, String position) {
        // 상위 클래스의 생성자 호출
        super(name);  //부모의 생성자 호출

        this.company = company;
        this.position = position;
    }

    public void tellYourInfo() {
        tellYourName(); //재사용
    	System.out.println("My company is " + company);
        System.out.println("My position is " + position);
    }
}


class MyBusinessMan2 {
    public static void main(String[] args) {
        BusinessMan2 man
                    = new BusinessMan2("YOON", "Hybrid ELD", "Staff Eng.");
        
	man.tellYourInfo();
		
    }
}