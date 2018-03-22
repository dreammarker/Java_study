package hashset;

import java.util.*;

public class HashsetExample {

	public static void main(String[] args) {
		Set<Member> set2 =new HashSet<Member>();
	
		set2.add(new Member("홍길동",30));
		set2.add(new Member("홍길동",30));
		
		 System.out.println("총 객체수 :" +set2.size());
	}
}
