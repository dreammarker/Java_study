package lowlevel;

class Kiwi_Juice2 {

	public int[] thePouring(int[] capacities, int[] bottles, int[]fromId,int[] toId) {
		// TODO 자동 생성된 메소드 스텁
		for(int i=0;i<fromId.length;i++)
		{
			int f=fromId[i];
			int t=toId[i];

			int vol =Math.min(bottles[f], capacities[t]-bottles[t]);
			bottles[t]+=vol;
			bottles[f]-=vol;

		}
		return bottles;

	}

}
