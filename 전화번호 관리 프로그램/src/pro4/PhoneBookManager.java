package pro4;
/**
 * 추상 클래스
 * 1. 부모역할 할 수 있다.
 * 2. 객체생성은 안됨
 */
abstract class Phone{  //추상클래스.. 여러개의 메소드중 하나만 abstruct면 다 abstruct
	final String contry="대한민국";
	
	 String getContry() { //완성된 메소드
		return contry;
	}
	abstract void showPhoneInfo(); //미완성된 메소드를 한개라도 가지고있다면
	//미완성된것을 오브abstract 라고한다.
	//비워둔이유 어차피 자식 클래스에서 재정의해서 사용
}
 class PhoneInfo extends Phone{    //부모로 둔다..
	String name; // 이름
	String phoneNumber;// 번호
	String birth;  //생일
	
	public PhoneInfo(String name, String phoneNumber) {
//		 super(); 컴파일러가 자동으로 삽입해준다.
		  this.name = name; 
		  this.phoneNumber = phoneNumber;
//		this(name, phoneNumber, null);// 생성자안에서만 사용가능.다른 생성자 호출할때
	}

	public PhoneInfo(String name, String phoneNumber, String birth) {
//		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birth = birth;
	}

//final 붙이면 재정의 불가
       void showPhoneInfo() {
		System.out.println("name: " + name);
		System.out.println("phone: " + phoneNumber);

		if (birth != null)
			System.out.println("birth: " + birth);

	}

}
class PhoneUnivInfo extends PhoneInfo
{	//부모의 필드/메소드는 상속받고 자식에만 해당 내용 추가
	String major; //전공
	int year;   //학년
	
	 PhoneUnivInfo(String name, String phoneNumber, String major, int year) {
		super(name, phoneNumber);
		this.major = major;
		this.year = year;
	}

	PhoneUnivInfo(String name, String phoneNumber, String birth, String major, int year) {
		super(name, phoneNumber, birth);
		this.major = major;
		this.year = year;
	}

	@Override
	public void showPhoneInfo() {
		super.showPhoneInfo(); //부모의 메소드 호출(재사용)
		System.out.println("major: " + major);
		System.out.println("year: " + year);
	}
/*	void showPhoneInfo_Uni() {
		// TODO 자동 생성된 메소드 스텁
		super.showPhoneInfo(); //부모의 메소드 호출(재사용)
		System.out.println("major: " + major);
		System.out.println("year: " + year);
	
*/}
class PhoneCompanyInfo extends PhoneInfo
{
	String company; //회사명

	PhoneCompanyInfo(String name, String phoneNumber, String company) {
		super(name, phoneNumber);
		this.company = company;
	}

	PhoneCompanyInfo(String name, String phoneNumber, String birth, String company) {
		super(name, phoneNumber, birth);
		this.company = company;
	}

	@Override
	public void showPhoneInfo() {
		super.showPhoneInfo();
		System.out.println("company: " + company);
	}
/*	@Override
	public void showPhoneInfo_Company() {
		super.showPhoneInfo();
		System.out.println("company: " + company);
	}
*/
}
public class PhoneBookManager {
//	final int MAX_CNT ; // 최초의 1번은 초기화(바로 값 입력 또는 생성자를 통해서 초기화) 100개
	PhoneInfo[] i = null; // PhoneInfo만 저장가능
	int curCnt = 0;// 만들어질 PhoneInfo 객체수와 동일

	//생성자 없을 떄 기본 생성자를 컴파일러가 삽입: 
	 //PhoneBokokManager(){}

	PhoneBookManager(int mAX_CNT) {
		super();
		i=new PhoneInfo[mAX_CNT];
	}
	
	private PhoneInfo readFriendInfo()
	{
		System.out.println("이름: ");
		String name =MenuViewer.sc.next();
		System.out.println("전화번호: ");
		String phone = MenuViewer.sc.next();
		System.out.println("생일: ");
		String birth = MenuViewer.sc.next();
		
		if("0".equals(birth)) return  new PhoneInfo(name,phone);
		else return new PhoneInfo(name, phone, birth);
	}
	
	private PhoneInfo readUnivFriendInfo()
	{
		System.out.println("이름: ");
		String name =MenuViewer.sc.next();
		System.out.println("전화번호: ");
		String phone = MenuViewer.sc.next();
		System.out.println("생일: ");
		String birth = MenuViewer.sc.next();
		
		System.out.println("전공: ");
		String major=MenuViewer.sc.next();
		System.out.println("학년: ");
		int year=MenuViewer.sc.nextInt();
		MenuViewer.sc.nextLine();   //정수 엔터처리
		
		if("0".equals(birth)) return  new PhoneUnivInfo(name,phone,major,year);
		else return new PhoneUnivInfo(name, phone, birth,major,year);
	}
	
	private PhoneInfo readCompanyFriendInfo()
	{
		System.out.println("이름: ");
		String name =MenuViewer.sc.next();
		System.out.println("전화번호: ");
		String phone = MenuViewer.sc.next();
		System.out.println("생일: ");
		String birth = MenuViewer.sc.next();
		
		System.out.println("회사: ");
		String company=MenuViewer.sc.next();
	

		
		if("0".equals(birth)) return  new PhoneCompanyInfo(name,phone,company);
		else return new PhoneCompanyInfo(name, phone, birth,company);
	}
	public void inputData() {
		System.out.println("데이터 입력을 시작합니다");

		System.out.println("1. 일반, 2. 대학, 3. 회사");
		System.out.println("선택>> ");
		int choice=MenuViewer.sc.nextInt();
		MenuViewer.sc.nextLine();
			// 콘솔창에서는 null입력 불가하므로 ("0":생년월일이 업다)로 가정
		// int b=Integer.parseInt(birth);
		PhoneInfo info=null;
		switch(choice) 
		{
			case INPUT_SELECT.NORMAL:
				info=readFriendInfo();
				break;
			case INPUT_SELECT.UNIV:
				info=readUnivFriendInfo();
				break;
			case INPUT_SELECT.COMPANY:
				info=readCompanyFriendInfo();
				break;
		}
		i[curCnt++]=info;
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
			/***메소드를 정의 했을때***/
			i[dataIdx].showPhoneInfo();
			System.out.println("데이터 검색이 완료되었습니다. \n");
		/***메소드를 재정의 되지 않았을때***/
			
		/*	i[dataIdx].showPhoneInfo();
			((PhoneUnivInfo)i[dataIdx]).showPhoneInfo_Uni();
			((PhoneCompanyInfo)i[dataIdx]).showPhoneInfo_Company();
		*/
			
	/*	if(i[dataIdx] instanceof PhoneUnivInfo)  //마지막 자식부터...
			((PhoneUnivInfo)i[dataIdx]).showPhoneInfo_Uni();
		else if(i[dataIdx] instanceof PhoneCompanyInfo)
			((PhoneCompanyInfo)i[dataIdx]).showPhoneInfo_Company();
		else
			i[dataIdx].showPhoneInfo();
		*/
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

