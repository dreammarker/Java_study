package hashset;

import java.util.*;
/**
 * Set     : 순서x, 중복x
 * HashSet : 저장 순서에 상관없는 출력 결과. 
 *           Set이므로 인덱스 이용안하므로 저장 순서 중요하지 않다.
 * 그러나
 * LinkedHashSet : 저장 순서 유지. 예외적인 클래스
 */
public class HashSetExample2 {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();//중복불가
		
		
		
		//Set<String> set = new LinkedHashSet<String>();//중복불가
		
		/**Hash~시작하는 클래스:★객체를 저장(추가)하기 전에 
		 *                     1.반드시 hashCode()메소드 호출(해쉬코드:주소값으로 만듦)
		                       ->같으면 한번더 확인위해 equals()메소드 호출
		                       ->(동등객체)이면 저장X 
		                       2.다른 해쉬코드이면 다른 객체로 인식하여 추가.
		                       **/
		set.add("Java");       
		set.add("JDBC");       	
		set.add("Servlet/JSP");
		//set.add(2, "Database");
		set.add("Java");    //String : hashCode()  equals() 둘다 재정의
		
		System.out.println(set.size());
		/****방법1: 향상된 for 이용 :인덱스로 관리하지 않기 때문에*****/
		for(String element : set){
			System.out.println("\t" + element);
		}
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");    //문자열은 같으면 공유함
		
		
		int size = set.size();  //
		System.out.println("총 객체수: " + size);
		
		/****방법1: 향상된 for 이용 :인덱스로 관리하지 않기 때문에*****/
		for(String element : set){
			System.out.println("\t" + element);
		}
				
		/****방법2-1: 반복자(=지팡이) 이용:인덱스로 관리하지 않기 때문에 *****/
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {           //가져올 객체가 있으면 True, 없으면 False를 리턴
			System.out.println("\t" + itr.next());//컬렉션에서 하나의 객체를 가져온다.
			
			/*String element = it.next();  
			System.out.println("\t" + element);*/
		}
		
		boolean b1=set.remove(1);
		System.out.println(b1);
		set.remove("iBATIS");
		
		System.out.println("총 객체수: " + set.size());
				
		set.clear(); //저장된 모든 객체 삭제		
		if(set.isEmpty()) { System.out.println("비어 있음"); }
	}
}


