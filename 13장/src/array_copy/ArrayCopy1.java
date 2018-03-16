package array_copy;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 배열 복사 방법-1
 */
public class ArrayCopy1 {
	public static void main(String[] args) {
		int[] o = { 1, 2, 3 }; // 원본 배열
		int[] n = new int[5]; // 복사 배열. 기본값인 0으로 채워진 배열

		for (int i = 0; i < o.length; i++) {
			n[i] = o[i]; // 복사배열=원본배열값
		}

		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i] + ", ");// 복사배열 출력
		}
		/*
		 * 배열 복사 방법-2
		 */

		String[] olds = new String[] { "java", "array", "copy" };
		String[] news = new String[5];// 기본값인 null인 문자열배열객체 생성

		System.arraycopy(olds, 0, news, 0, olds.length);

		for (int i = 0; i < news.length; i++) { // (조건문)?참:거짓
			System.out.print(news[i] + (((i + 1) == news.length) ? "" : ", "));
			/*
			 * if(i!=news.length-1) System.out.print(", ");
			 */
			// (조건문)?참:거짓
			// 최대값
			int a = 10, b = 20;
			if (a > b)
				System.out.println("최대값" + a);
			else
				System.out.println("최소값" + b);
			// (조건문)?참:거짓
			System.out.println("최대값" + ((a > b) ? a : b));
			/**
			 * 초기값을 내가 원하는 값으로 채우고 싶을 때
			 */
			/* 배열은 크기를 늘리거나 줄일 수 없다. 따라서 
			 * 더 많은 저장 공간이 필요하면 큰 배열 만들고 이전 항목들을 복사해야 된다.
			 * 
			 * 배열 복사 방법-3
			 * Arrays클래스 : 배열을 조작하기 위해 나온 클래스
			 */    
			int[] a1 = new int[5]; // 초기값이 0
			Arrays.fill(a1, 2); // 초기값을 2로
			
			/*for(int c=0;c<a1.length;c++) {
				a1[c]=2;
			}*/
		
			int i1;
			for (i1 = 0; i1 < a1.length; i1++) {
				a1[i1]=2;
				System.out.print(a1[i1] + "\t");
			}
			
			System.out.println();// 빈줄. 구분하기 위해

			char[] a2 = new char[3];// 기본값이 '\0':null
			Arrays.fill(a2, 'a'); // 초기값을 'a'로

			for (i1 = 0; i1 < a2.length; i1++)
				System.out.print(a2[i1] + "\t");
			System.out.println();// 빈줄. 구분하기 위해

			// 배열 복사 방법-3
			Scanner sc = new Scanner(System.in);

			char[] arr1 = { 'J', 'A', 'V', 'A' };
			System.out.print("늘릴 배열크기 입력:");

			int len = sc.nextInt();

			char[] arr2 = Arrays.copyOf(arr1, arr1.length+len);
			System.out.println(arr2); // JAVA 반드시 toString()을 호출하지는 않는다.
			System.out.println(arr2.toString());// Object의 toString()호출

			System.out.println(Arrays.toString(arr2));

			/** 빈방에 문자'!'과 문자'~' 입력 **/
			
			  arr2[4] = '!'; arr2[5] ='~';
			 

			arr2[arr1.length] = '!'; // arr1.length=4
			arr2[arr1.length + 1] = '~';

			/** 빈방에 값(문자) 입력 **/
			for (i1 = 0; i1 < len; i1++) {
				System.out.print("문자 입력:");
				arr2[arr1.length + i1] = sc.next().charAt(0);
				// 리턴타입  String
			
			}
			
			System.out.println(Arrays.toString(arr2));

			// 배열 복사 방법-4
			char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);// 1~3전까지, 인덱스1~2까지
			System.out.println(arr3); // AV
			System.out.println(Arrays.toString(arr3)); // [A, V]
		}

	}

}
