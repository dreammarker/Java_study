package cal;

class Adder
{
	private int cntAdd;
	
	Adder() {
		cntAdd = 0;
	}
	
	int getCntAdd() {
		return cntAdd;
	}
	
	int add(int num1,int num2) {
		cntAdd++;
		return num1+num2;
	}
	
}
class Subtractor
{
	private int cntSub;
	
	Subtractor() {
		cntSub = 0;
	}
	
	int getCntSub() {
		return cntSub;
	}
	
	int Sub(int num1,int num2) {
		cntSub++;
		return num1-num2;
	}
	
}

public class Calculator {
	private Adder a;
	private Subtractor s;
	
	public Calculator()
	{
		a = new Adder();
		s = new Subtractor();
	}
	
	public int add(int num1, int num2) {
		return a.add(num1, num2);
	}
	
	public int sub(int num1, int num2) {
		return s.Sub(num1, num2);
	}
	public void showOperatingTimes() {
		System.out.println("덧셈 횟수"+a.getCntAdd());
		System.out.println("뺄셈 횟수"+s.getCntSub());
	}
}
