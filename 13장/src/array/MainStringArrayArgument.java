package array;

public class MainStringArrayArgument {

	public static void main(String[] args) {
		if(args.length!=4) {
			System.out.println("실행할 때 4개의 숫자를 입력해 주세요"+"(정수2개 실수2개)");
			
//			System.exit(0);
			return;
		}
		
//		System.out.println("성공");
	
		String strNum1 =args[0];
		String strNum2 =args[1];
		
		String strNum3 =args[2];
		String strNum4 =args[3];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		double num3 =Double.parseDouble(strNum3);
		double num4 =Double.parseDouble(strNum4);
		
		double result = num1+num2+num3+num4;
		System.out.println(result);
		System.out.println(String.valueOf(result).charAt(1));
		
	}

}
