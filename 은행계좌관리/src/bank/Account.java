/*
 * 다음은 키보드로부터 계좌 정보를 입력받아서, 계좌를 관리하는 프로그램이다.
 * 실행 결과를 보고, BankApplication 클래스의 메소드를 작성해보세요.
 */
package bank;

public class Account {
	private String ano;   //계좌번호
	private String owner; //계좌주
	private int balance;  //계좌총액	
	
	
	public Account(String ano, String owner, int balance) {
		//super();
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
