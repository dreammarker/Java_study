package lowlevel;

class Kiwi_Juice {

	public int[] thePouring(int[] capacities, int[] bottles, int[]fromId,int[] toId) {
		// capacities 병의용량 bottles 주스담긴병의 용량 fromId번째 병에서 -> toId번째병으로 옮긴다.
		for(int i=0;i<fromId.length;i++)
		{
			int f=fromId[i];          
			int t=toId[i];	//f번째에서 t번재로 			
			int space=capacities[t] - bottles[t];//capacities[]병의 용량 bottles 주스의 양
			
			if(space>=bottles[f]) {
				int vol = bottles[f];
				bottles[t]+=vol;
				bottles[f]=0;
				
			}else {
				int vol =space;
				bottles[t]+=vol;
				bottles[f]-=vol;
			}
		}
		return bottles;
		
	}

}
