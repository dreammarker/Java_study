/**
 * 부동소수점(실수)을 입력받을 때는 반드시 NaN 검사를 해야 한다.
 * **/


public class InputDataCheckNaNExample {
	public static void main(String[] args) {
		//악의성있는 사용자가 숫자로 변환이 안되는 NaN을 입력한다면
		String userInput = "NaN";
		double val = Double.valueOf( userInput );//입력값을 double타입으로 변환
				
		double currentBalance = 10000.0;  //통장잔고에 만원이 있는데
		
		currentBalance += val;            //NaN과 더하면 NaN이 저장되어
		System.out.println("현재잔액:"+currentBalance); //통장잔고가 엉망이 될 수 있다.
		                                  //따라서 부동소수점(실수)을 입력받을 때는 반드시 NaN검사를 해야 한다.
	}
}

