package pro3;

import java.util.Scanner;

class PhoneInfo {
	String name; // 이름
	String phoneNumber;// 번호
	String birth;  //생일

	public PhoneInfo(String name, String phoneNumber) {
		 super();
		  this.name = name; 
		  this.phoneNumber = phoneNumber;
//		this(name, phoneNumber, null);// 생성자안에서만 사용가능.다른 생성자 호출할때
	}

	public PhoneInfo(String name, String phoneNumber, String birth) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birth = birth;
	}


	public void showPhoneInfo() {
		System.out.println("name: " + name);
		System.out.println("phone: " + phoneNumber);

		if (birth != null)
			System.out.println("birth: " + birth);

	}

}

class PhoneBookManger {
//	final int MAX_CNT ; // 최초의 1번은 초기화(바로 값 입력 또는 생성자를 통해서 초기화) 100개
	PhoneInfo[] i = null; // PhoneInfo만 저장가능
	int curCnt = 0;// 만들어질 PhoneInfo 객체수와 동일

	//생성자 없을 떄 기본 생성자를 컴파일러가 삽입: 
	 //PhoneBokokManager(){}

	PhoneBookManger(int mAX_CNT) {
		super();
		i=new PhoneInfo[mAX_CNT];
	}
	
	public void inputData() {
		System.out.println("데이터 입력을 시작합니다");

		System.out.println("이름: ");
		String name = MenuViewer.sc.next();

		System.out.println("전화번호: ");
		String phone = MenuViewer.sc.next();

		System.out.println("생년월일: ");
		String birth = MenuViewer.sc.next();
	
			// 콘솔창에서는 null입력 불가하므로 ("0":생년월일이 업다)로 가정
		// int b=Integer.parseInt(birth);

		if (birth.equals("0"))
			i[curCnt++] = new PhoneInfo(name, phone);//문장이끝난후더해진다 후위++
		else
			i[curCnt++] = new PhoneInfo(name, phone, birth);

		System.out.println("데이터 입력이 완료 되었습니다.\n");
	}


	 
	public void searchData() {
		System.out.println("데이터 검색을 시작합니다..");

		System.out.println("이름");
		String name = MenuViewer.sc.next();

		int dataIdx=search(name); //몇번째에 있는지 알려주는 메소드
		if(dataIdx<0)
		{
			System.out.println("해당하는 데이터가 존재하지 않습니다.");
		}
		else
		{
			i[dataIdx].showPhoneInfo();
			System.out.println("데이터 검색이 완료되었습니다. \n");
		}
	}
	
	private int search(String name)
	{
		for(int idx=0;idx<curCnt;idx++)
		{
//			PhoneInfo curInfo=i[idx];
			
			if(name.equals(i[idx].name))//if(name.compareTo(i[idx].name)==0)
				return idx;
		}
		return -1;
	}
	
	public void deleteData() {
		System.out.println("데이터 검색을 시작합니다..");

		System.out.println("이름");
		String name = MenuViewer.sc.next();

		int dataIdx=search(name); //몇번째에 있는지 알려주는 메소드
		if(dataIdx<0)
		{
			System.out.println("해당하는 데이터가 존재하지 않습니다.");
		}
		else
		{
			for(int idx=dataIdx; idx<(curCnt-1);idx++) 
				i[idx]=i[idx+1]; //앞방=뒷방주소
			
			
			curCnt--;
			System.out.println("데이터 삭제가 완료되었습니다. \n");
		}
	}
	
}

class MenuViewer // static은 모아서 하나의 클래스로 관리
{
	public static Scanner sc = new Scanner(System.in);

	public static void showMenu() {
		System.out.println("선택하세요...");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 데이터 검색");
		System.out.println("3. 데이터 삭제");
		System.out.println("4. 프로그램 종료");
		System.out.print("선택: ");
	}
}

public class PhoneBookVer03 {

	 public static void main(String[] args) {
		 System.out.println("저장할 친구 수 입력");
		PhoneBookManger manager = new PhoneBookManger(100);

		int choice;

		while (true) {
			MenuViewer.showMenu();
			choice = MenuViewer.sc.nextInt();
			MenuViewer.sc.nextLine();
			switch (choice) {

			case 1:
				manager.inputData();
				break;
			case 2:
				manager.searchData();
				break;
			case 3:
				manager.deleteData();
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				return;

			}

		}
	}
}