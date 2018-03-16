
 class InRecul {

	 
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		showHi(3);
	}
	
	//재귀 메소드 : 순서 중요하고 종료조건 중요
	public static void showHi(int cnt) {
		System.out.println("Hi~ ");
	
		
		if(cnt == 1) {   //종료조건의 위치 중요!
			return;    //메소드를 다시 호출하기 전에 종료 조건 넣기
		}
		
		showHi(--cnt);   //3  2  1
		
	}
}
