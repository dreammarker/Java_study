
/**
 [NaN과 Infinity 연산은 주의할 것]
 ------------------------------------------------------------------------------------------
 1. 정수일 때
   5 / 0 -> ArithmeticException 예외발생
   5 % 0 -> ArithmeticException 예외발생
   예외가 발생하면 프로그램은 그 즉시 종료가 되기 때문에 사용자가 신뢰를 못하므로 
   따라서 ArithmeticException 발생하더라도 프로그램이 종료되지 않도록 하기 위해 
   catch{}에서 예외처리를 한다.
 ---------------------------------------------------------------------------------------------  
 2. 실수일 때★★
   5 / 0.0 -> Infinity
   5 % 0.0 -> NaN
   0.0일 경우 예외발생하지 않고 Infinity(무한대)값과 NaN(Not a Number)값을 가진다.
   
   Infinity + 2 -> Infinity
   NaN + 2 -> NaN
   Infinity와 NaN은 수이므로 산술연산이 가능하므로 어떤 수와 연산하더라도 
   Infinity과 NaN이 산출되어 데이터가 엉망이 된다.
   
   따라서 Infinity과 NaN이면 절대로 다음 연산을 수행하지 못하도록 
   if문을 사용해서 실행의 흐름을 변경해야 한다.
 * **/

public class InputDataCheckNaNExample2 {
	public static void main(String[] args) {
		String userInput = "NaN";
		double val = Double.valueOf(userInput);
		
		double currentBalance = 10000.0;
		//부동소수점(실수)을 입력받을 때는 반드시 NaN 검사를 해야 한다.
		if(Double.isNaN(val)) {  //val이 NaN이면 True, 아니면 False
			System.out.println("NaN이 입력되어 처리할 수 없음");
			val = 0.0;           //0.0이 입력되어 
		} 
		
		currentBalance += val; //통장잔고 그대로 유지됨
		System.out.println("현재잔액:"+currentBalance);
	}
}
