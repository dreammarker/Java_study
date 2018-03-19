package pro4;
//같은 패키지에서는 기본으로 가져옴

public class PhoneBookVer04 {

	 public static void main(String[] args) {
		 System.out.println("저장할 친구 수 입력");
		 PhoneBookManager manager = new PhoneBookManager(MenuViewer.sc.nextInt());

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
