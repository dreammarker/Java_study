package while_exam;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		while(true) {  //for(;;)
		System.out.println("입력 한 두 정수가 0이면 계산지가 멈춥니다.");
			
		System.out.println("첫번째 수를 입력하세요:");
		int n1=sc.nextInt();

		System.out.println("두번째 수를 입력하세요:");
		int n2=sc.nextInt();

		if(n1==0 && n2==0) 
		{
			break;
		}
		
		System.out.println("계산할 연산자를 입력하세요 :");
		String operator =sc.next();
		
		System.out.println("계산지가 멈춥니다.");
		
		if(n1==0&&n2==0)
			break;
		
		//연산자 입력부분 operator
//		System.out.println("1:덧셈 2:빼기 3:곱하기 4:나누기");
		switch(operator) //정수, 문자, 문자열 ,메소드 ,연산식
		{
		case "+":
			System.out.println(n1+"+"+n2+"="+(n1+n2));
			break;
		case "-":
			System.out.println(n1+"-"+n2+"="+(n1-n2));
			break;
		case "*":
			System.out.println(n1+"*"+n2+"="+(n1*n2));
			break;
		case "/":
			System.out.println(n1+"/"+n2+"="+((n1/(double)n2)));
			break;
	/*	case "%":
			System.out.println(n1+"%"+n2+"="+(n1%n2));
			break;*/
		default:
			System.out.println("잘못된 연산자입니다");
		}
		
		//if문으로 변경
		if("+".equals(operator)) {
			System.out.println(n1+"+"+n2+"="+(n1+n2));
		}
		else if(operator.equals("-")) {
			System.out.println(n1+"-"+n2+"="+(n1-n2));
		}
		else if(operator.equals("/")) {
			System.out.println(n1+"/"+n2+"="+((double)n1/n2));
		}
		else if(operator.equals("*")) {
			System.out.println(n1+"*"+n2+"="+(n1*n2));
		}
		else 
		{
			System.out.println("잘못된 연산자입니다");
		}
		
		
		
		}
		sc.close();
		System.out.println("계산기 stop");
	}
}
