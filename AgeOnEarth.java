class AgeOnEart{
	public static void main(String args[]){
		float x=Float.parseFloat(args[0]);
		
		int m=88;
		int v=225;
		int j=4380;
		int s=10767;
		float y=(x*(float)365)/(float)m;
		System.out.println("Age on Planet Mercury :"+y);
		y=(x*(float)365)/(float)v;
		System.out.println("Age on Planet Venus :"+y);
		y=(x*(float)365)/(float)j;
		System.out.println("Age on Planet Jupiter :"+y);
		y=(x*(float)365)/(float)s;
		System.out.println("Age on Planet Saturn :"+y);
		
		
	}
}

/*
AgeOnEart 26.1
Age on Planet Mercury :108.255684
Age on Planet Venus :42.34
Age on Planet Jupiter :2.175
Age on Planet Saturn :0.88478684

*/
