package math;

 class Math2 {
	 static int add(int x) {
		 return x;
	 }
	 static int add(int x,int y) {
		 return x+y;
	 }
	 static int add(int x,int y,int z) {
		 return x+y+z;
	 }
	 
	 /******* add()-...사용하여 1개의 메소드로 해결 *****/
	 static int add(int ...x) {
		 int hap=0;
		 for(int i=0;i<x.length;i++)
			 hap=hap+x[i];
		 return hap;
	 }
	 static double mul(double ...x) {
		 double mul=1;
		 for(int i=0;i<x.length;i++) 
			 mul=mul*x[i];
		 return mul;
	 }
	 static int mul(int ...x) {
		 int mul=1;
		 for(int i=0;i<x.length;i++) 
			 mul=mul*x[i];
		 return mul;
	 }
	 
 }
