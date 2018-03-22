/*
 * ArrayList와 LinkedList에 10000개의 객체를 삽입하는데
 * 걸린 시간을 측정
 * LinkedList가 빠른 성능을 낸다.
 */
package linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		//둘다 사용방법은 같지만 내부 구조는 완전 다르다.
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime; //시간 측정위해 시작시간과 
		long endTime;   //끝시간 변수 
		
		/**************ArrayList***************/
		startTime = System.nanoTime(); //시작시간=나노타임 저장
		for(int i=0; i<10000; i++) {
			list1.add(0, String.valueOf(i));//리스트의 0번 인덱스에 10000번 문자열이 저장됨
		}
		endTime = System.nanoTime();//for 수행 후,끝시간=나노타임 저장
		System.out.println("ArrayList 걸린시간: " + (endTime-startTime) + " ns");
		
		/***LinkedList : 특정 위치에 삽입/제거할 때 더 빠르다.***/
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간: " + (endTime-startTime) + " ns");
	             //결과는 그 때마다 다르게 나올 수 있다.
	}
}



