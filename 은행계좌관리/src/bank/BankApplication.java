package bank;

import java.util.Scanner;



public class BankApplication {
	private static Account[] accountArray = new Account[100]; 
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;		
		while(run) {
			System.out.println("-----------------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.삭제 | 6.종료");
			System.out.println("-----------------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = sc.nextInt();
			
			switch(selectNo){
				case 1: createAccount(); 
						break;
				case 2: accountList();
						break;
				case 3: deposit();
						break;
				case 4: withdraw();
						break;
				case 5: deleteAno();
						break;
				default:run = false;
						break;
			}
						
			/*if(selectNo == 1) {
				createAccount();
			} else if(selectNo == 2) {
				accountList();
			} else if(selectNo == 3) {
				deposit();
			} else if(selectNo == 4) {
				withdraw();
			} else if(selectNo == 5) {
				deleteAno();
			} else {
				run = false;			
			}*/
		}
		System.out.println("프로그램 종료");
	}
	
	//계좌번호,계좌주,초기입금액을 입력받아 계좌생성하기
	private static void createAccount() {
		System.out.println("--------------");
		System.out.println("계좌생성");
		System.out.println("--------------");
		
		System.out.print("계좌번호: "); 
		String ano = sc.next();    //단어를 읽어들인다.
		
		System.out.print("계좌주: "); 
		String owner = sc.next();
		
		System.out.print("초기입금액: ");
		int balance = sc.nextInt();
		
		//Account newAccount = new Account(ano, owner, balance);
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] == null) {
				//accountArray[i] = newAccount;
				accountArray[i] = new Account(ano, owner, balance);
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
		}
	}
	
	//계좌목록보기(계좌번호,계좌주,총입금액)
	private static void accountList() {
		System.out.println("--------------");
		System.out.println("계좌목록");
		System.out.println("--------------");
		for(int i=0; i<accountArray.length; i++) {
			Account account = accountArray[i];
			if(account != null) {
				System.out.print(account.getAno());
				System.out.print("     ");
				System.out.print(account.getOwner());
				System.out.print("     ");
				System.out.print(account.getBalance());
				System.out.println();
			}
		}
	}
	
	//계좌번호와 예금액 입력받은 후 해당 계좌번호를 찾아 있으면 예금하기
	private static void deposit() {
		System.out.println("--------------");
		System.out.println("예금");
		System.out.println("--------------");
		System.out.print("계좌번호: "); 
		String ano = sc.next();
		System.out.print("예금액: ");
		int money = sc.nextInt();
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("결과: 계좌가 없습니다.");
			return;
		}
		account.setBalance(account.getBalance() + money);
		System.out.println("결과: 예금이 성공되었습니다.");
	}
	
	//계좌번호와 출금액 입력받은 후 해당 계좌번호를 찾아 있으면 출금하기
	private static void withdraw() {
		System.out.println("--------------");
		System.out.println("출금");
		System.out.println("--------------");
		System.out.print("계좌번호: "); 
		String ano = sc.next();
		System.out.print("출금액: ");
		int money = sc.nextInt();
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("결과: 계좌가 없습니다.");
			return;
		}
		account.setBalance(account.getBalance() - money);
		System.out.println("결과: 출금이 성공되었습니다.");
	}	
	
	//Account 배열에서 ano(계좌주)와 동일한 Account 객체 찾아 리턴
	private static Account findAccount(String ano) {
		Account account = null;
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {
				String dbAno = accountArray[i].getAno();
				if(dbAno.equals(ano)) {
					account = accountArray[i];
					break;
				}
			}
		}
		return account;
	}
	
	//계좌번호 입력받아 계좌삭제하기
	private static void deleteAno() {
		System.out.println("--------------");
		System.out.println("계좌삭제");
		System.out.println("--------------");
		
		System.out.print("계좌번호: "); 
		String ano = sc.next();    //단어를 읽어들인다.
		//Account account;
		int i = findAno_delete(ano);
		if(i == -1) {
			System.out.println("결과: 계좌가 없습니다.");
			return;
		}			
		accountArray[i] = null;
		//account.delete(i);
		System.out.println("결과: 계좌가 삭제되었습니다.");
	}
	
	private static int findAno_delete(String ano) {
		//Account account = null;
		int i;
		for(i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {
				String dbAno = accountArray[i].getAno();
				if(dbAno.equals(ano)) break;
				else return -1;
			}
		}
		return i;
	}
}
















