package arraylist;


import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
//		ArrayList<String> list = new ArrayList<String>(); //10개
		List<String> list = new Vector<String>();
		list.add("Java");
		list.add("봉조형");
		list.add("Servlet/JSP");
		
		list.add(2,"Database");
		list.add("민프리");
		
		System.out.println("총 객체수: "+list.size());
		
		//List 특징: 인덱스 이용->순서 유지
		for(int i=0;i<list.size();i++) {
			System.out.println(i+":"+list.get(i));
		}
		System.out.println();
		
		list.remove(1);
		list.remove("Database");
		for(int i=0;i<list.size();i++) {
			System.out.println(i+":"+list.get(i));
		}
		list.clear();
		
		for(int i=0;i<list.size();i++) {
			System.out.println(i+":"+list.get(i));
		}
		System.out.println("끝");
	}

}
