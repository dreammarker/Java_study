package pro4;
//같은 패키지에서는 기본으로 가져옴

public class PhoneBookVer04 {

	 public static void main(String[] args) {
		 System.out.println("저장할 친구 수 입력");
		 PhoneBookManager manager = new PhoneBookManager(MenuViewer.sc.nextInt());

		int choice;

		while (true) {
			try {
				MenuViewer.showMenu();
				choice = MenuViewer.sc.nextInt();
				MenuViewer.sc.nextLine();
				if(choice<INIT_MENU.INPUT|choice>INIT_MENU.EXIT)
					throw new MenuChoiceException(choice);
				
				switch (choice) {

				case INIT_MENU.INPUT:
					manager.inputData();
					break;
				case INIT_MENU.SEARCH:
					manager.searchData();
					break;
				case INIT_MENU.DELECT:
					manager.deleteData();
					break;
				case INIT_MENU.EXIT:
					System.out.println("프로그램을 종료합니다.");
					return;
//				default: System.out.println("숫자를 잘못 입력하셨습니다");
				}
			} catch (MenuChoiceException e) {
				System.out.println(e.getMessage());
				e.showWrongChoice();
				System.out.println("메뉴 선택을 처음부터 다시 진행합니다.\n");
			}
			finally {//try문으로 들어오면 반드시 실행
				System.out.println("복 많이 받으세요~~!\n");
			}

		}
	}
}
