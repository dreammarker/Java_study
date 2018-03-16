package array;

import java.util.Scanner;

public class ArrayCreate {

	public static void main(String[] args) {

		int s1=83;
		int s2=90;
		int s3=87;
		int s4=90;
		
		int sum =0;
		
		System.out.println();
		
		int[] scores= {83,90,87};
		for(int i=0;i<scores.length;i++) {
			sum+=scores[i];
		}
		System.out.println(sum);
		sum=0;
		scores[0] = 100; //83->100
		scores[1] = 99; //90->99
		scores[2] = 98; //87->98
		
		
		for(int i=0;i<scores.length;i++) {
			sum+=scores[i];
		}
		
		System.out.println(sum);
		System.out.println(scores);
		System.out.println(scores.toString());
		
		
		/*** 배열 선언 후 배열 목록 생성 방법-1**/
		int[] scores1=null;   //배열 선언
//		System.out.println(scores1[0]);   //예외발생->프로그램이 종료
//		
//		System.out.println("프로그램이 종료되었습니다");

		/*Scanner sc =new Scanner(System.in);
		System.out.println("배열의 크기 입력: ");
		int size =sc.nextInt();
		scores1=new int[size];
		int a;
		int i;
		sum=0;
		
		for( i=0;i<scores1.length;i++) {
			 a=sc.nextInt();
			scores1[i]=a;
			System.out.printf("scores1[%d]:%d\n",i,scores1[i]);
			sum+=scores1[i];
		}*/
//		System.out.printf("총합 %d 평균 %f",sum,(double)sum/scores1.length);
		/******배열 선언과 배열 목록 생성 방법************/
		int[] scores2= /*new int[]*/ {10,20,30};
		int[] scores2_2=null;
		
		scores2_2 =new int[] {10,20,30};  //1.new int[] 생략불가
		sum=0;
		for(int x=0;x<scores2_2.length;x++) {
			sum+=scores2_2[x];
		}
		System.out.printf("합계 : %d 평균 : %f\n",sum,(double)sum/scores2_2.length);
		//2.new int[3] 배열의 크기 입력하면 오류
	sum=0;
		for(int value:scores2_2) {
			sum+=value;
		}
		System.out.printf("합계 : %d 평균 : %f\n",sum,(double)sum/scores2_2.length);
		
		
	}

}
