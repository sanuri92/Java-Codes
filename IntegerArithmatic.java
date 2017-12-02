class IntegerArithmatic{
	public static void main(String args[]){
		int x=10;
		int y=6;
		int z=x+y;
		System.out.println("X="+x+" "+" Y="+y);
		System.out.println("x+y :"+ z);
		z=x-y;
		System.out.println("x-y :"+ z);
		z=x*y;
		System.out.println("x*y :"+ z);
		z=x/y;
		System.out.println("x/y :"+ z);
		z=(x+y)/y*y/(x-y);
		System.out.println("(x+y)/y*y/(x-y) :"+ z);
	
	
	}

}
/*

X=10  Y=6
x+y :16
x-y :4
x*y :60
x/y :1
(x+y)/y*y/(x-y) :3


*/