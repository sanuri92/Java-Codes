class DoubleArithmatic{
	public static void main(String args[]){
		double a=0.5,b=0.3;
		float c=0.5f,d=0.3f;
		double z;
		System.out.println("Double Variables a="+a+" "+" b="+b);
		System.out.println("Float Variables c="+c+" "+" d="+d);
		z=a+b;
		System.out.println("a+b :"+ z);
		z=a-b;
		System.out.println("a-b :"+ z);
		z=a*b;
		System.out.println("a*b :"+ z);
		z=a/b;
		System.out.println("a/b :"+ z);
		z=a%b;
		System.out.println("a%b :"+ z);
		z=c/d;
		System.out.println("c/d :"+ z);
		z=c%d;
		System.out.println("c%d :"+ z);
		
	
	}

}
/*
Double Variables a=0.5  b=0.3
Float Variables c=0.5  d=0.3
a+b :0.8
a-b :0.2
a*b :0.15
a/b :1.6666666666666667
a%b :0.2
c/d :1.6666666269302368
c%d :0.19999998807907104
*/
