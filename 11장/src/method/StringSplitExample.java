package method;

public class StringSplitExample {
	public static void main(String[] args) {
		String text = "홍길동 & 이수홍,박연수,김자바-최명호";
		String[] names = text.split(" & |,|-");//구분자 & 또는 , 또는 -임
		                           //주의사항:공백도 구분자로 인식됨
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		
		
		for(String name : names) { //인덱스로 접근하지 않을 때 사용
			System.out.println(name);
		}
	}
}