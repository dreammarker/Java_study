package hashset;

import java.util.Objects;


public class Member {
	 public String name;  //이름
	 public int age;      //나이		
	

	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

//마오 ->소스->hashCode()와 equals(0) 생성
/*	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
*/

/*	@Override
	public int hashCode() {
		// TODO 자동 생성된 메소드 스텁
		return name.hashCode() + age;     //방법1
	}
	*/

	//주소비교(Object)가 아니라 값 비교 재정의
/*	@Override  //equals() 재정의-방법1
	public boolean equals(Object obj) { 
		Member member = (Member) obj;
		
		//if(name.equals(member.name) && (age==member.age)) 
		if(member.name.equals(this.name) && (member.age==this.age))
				return true;  //참이면 같으므로 추가하지 않음
		else return false;
		
	}*/
	
	

	/*@Override //equals() 재정의-방법2
	public boolean equals(Object obj) {
		if(obj instanceof Member) { //obj가 Member 또는 자식으로 형변환된다면
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age==age);
		} 
		else return false;	
	}  */ 
	
	
	 
	 
	

	
 
	  
 /****************************************************************************************************************************
 Hash~시작하는 클래스는 해시 알고리즘을 기반으로 구현된 클래스이므로 검색속도가 매우 빠르다.
 HashSet <E> 클래스는 데이터의 중복을 허용하지 않으므로 저장하기 전 동일한 데이터가 있는지 검색한다.

 1. 먼저, Object 클래스의 hashCode() 메소드(해시 알고리즘을 구현한 메소드 : 객체의 M번지를 이용해서 해쉬코드     만들어 리턴하기 때문에  객체마다 다른 값을 가지므로 객체가 다르면 전혀 다른 해쉬값을 반환하도록 정의됨)
의 반환값을 해시 값으로 활용하여 어느 부류에 속하는지 검색의 부류를 결정한 후(검색의 범위를 확 줄여버리므로 검색속도가 매우 빠르다.)

2. 해당 부류 내에 존재하는 데이터들과의 내용비교는(객체 변수의 값이 완벽히 일치하는지 확인하는 비교는)
equals() 메소드를 통해서 진행을 한다. 

 따라서 2개의 객체가 동등한 객체로 인식이 되도록 하려면 
public int hashCode() 메소드와 public boolean equals(Object obj)메소드를 
오버라이딩해야 한다.
******************************************************************************************************************************/
/****************************************************************************************************************************
  name의 hashCode()와 (age%3)를 더한 값을 해쉬코드 값으로 리턴한다. 
  3을 %연산(0, 1, 2로 3부류로 나뉜다. 어느 부류인지 판별하므로 검색의 대상이 줄어 
  HashSet <E> 클래스는 검색 속도가 매우 빠르다. )한 것은 임의적인 결정이다. 
  7, 10, 25로 변경하고 출력순서가 어떻게 변경되는지 확인해본다.
  hashCode() 정의방식에 따라서 HashSet <E> 클래스의 성능은 차이를 보인다. 
******************************************************************************************************************************/



}