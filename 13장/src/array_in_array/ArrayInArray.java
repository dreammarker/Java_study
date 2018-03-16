package array_in_array;

public class ArrayInArray {
	public static void main(String[] args) {	
	
	/***2차원 배열 선언하는 방법-1***/	
	int[][] m = new int[2][3]; //행 열
	System.out.println();
	
	
    /***2차원 배열 선언하는 방법-2***/		
	int[][] e = new int[2][];//null로 초기화. 반드시 주소만 저장	
	
	e[0] = new int[] {95,77};       //0으로 초기화
	e[1] = new int[] {92,96,100};
	
	System.out.println();	
	
	
    /***2차원 배열 선언하는 방법-3***/		
	int[][] s = new int[2][];
	s[0] = new int[]{95, 80};          //new int[2]{95, 80}오류:초기값이 주어지면 []안에 수생략
	s[1] = new int[]{92, 96, 100}; 
		
	System.out.println();
	
	
    /***2차원 배열 선언하는 방법-4***/	
	int[][] j = { 
		         {95, 97}, 
		         {98, 99, 100} 
		        };
	
	//총합과 평균 구하기
	int hap = 0; 
	int length_count = 0;
	
	for(int i=0; i<j.length; i++) { //행
		for(int k=0; k<j[i].length; k++) { //열
			hap += j[i][k]; //00 01 10 11 12
			//length_count++; //length_count 구하는 방법1
		}
	}
	
	for(int i=0; i<j.length; i++) //length_count 구하는 방법2(따로 그 값을 구해야 될 때)
		length_count+=j[i].length;
	
	System.out.println("총합 : " + hap);
	double avg = (double) hap / length_count;
	System.out.println("평균 : " + avg);
 
	
	
 }
	
}
