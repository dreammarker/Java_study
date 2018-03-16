package cal;
import cal.Calculator;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator cal =new Calculator();

		System.out.println("1+2="+cal.add(1, 2));
		System.out.println("2+4="+cal.add(2, 4));
		System.out.println("5-1="+cal.sub(5, 1));
	
		cal.showOperatingTimes();
	}

}
