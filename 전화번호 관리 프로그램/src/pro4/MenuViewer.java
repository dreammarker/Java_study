package pro4;

import java.util.Scanner;

public class MenuViewer // static은 모아서 하나의 클래스로 관리
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