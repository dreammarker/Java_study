/**
 * 열556-558참조
 * ArrayList를 생성하고 런타임 시 필요에 의해 객체들을 추가하는 것이 일반적이지만, 
 * 고정된  객체들로 구성된 List를 생성할 때도 있다. 
 * 이런 경우에는 Arrays.asList(T…a)메소드를 사용하는 것이 간편하다.

 * List<T> list  = Arrays.asList(T…a);
 * T타입에 맞게 asList() 메소드를 순차적으로 입력하거나, 
 * T[] 배열을 매개값으로 주면 된다.

 */
package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {
	public static void main(String[] args) {
		String[] s= {"a","b"};//배열 선언과 동시에 초기화
		
		/**ArrayList:배열처럼 선언과 동시에 초기화 불가능하다. 
		 *           그러나 추가나 삭제가 가능.
		 *           
		 * Arrays :  배열을 조작하기 위해 만든 클래스
		 * 			  배열처럼 선언과 동시에 초기화 가능하다. 
		 *           그러나 추가나 삭제가 불가능.
		 * 
		 * 그래서 배열처럼 선언과 동시에 초기화가 되고
		 * 추가나 삭제처럼 변경하기 위해***/
		
		// Arrays.asList()이용하여 순차적으로 입력된 값(초기값)으로 고정된 객체 List 생성
		List<String> list1 = Arrays.asList("홍길동", "신용권", "감자바");//1.추가나 삭제 불가능.
		//List<Integer> list1 = Arrays.asList(new Integer(1), new Integer(2));
		/*for (String name : list1) {
			System.out.println(name);
		}*/
		
		list1 = new ArrayList<String>(list1);  //2.그래서 만들어진 리스트로 ArrayList 객체 생성하여 추가나 삭제함.

		//List<Integer> list2 = Arrays.asList(new Integer(1), new Integer(2),
		                                    // new Integer(3));
		List<Integer> list2 = Arrays.asList(1, 2, 3);// 자동 박싱
		for (int value : list2) { // 자동 언박싱
			System.out.println(value);
		}
	}
}
