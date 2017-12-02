class StringTest3{
	public static void main(String args[]){
	
		StringBuilder sb1=new StringBuilder("12345");
		sb1.append("6789");
		System.out.println(sb1);
		sb1.delete(0,2);
		System.out.println(sb1);
		sb1.reverse();
		System.out.println(sb1);
		
		StringBuilder sb2=new StringBuilder("Test");
		System.out.println(sb2);
		sb2.append(" Java ").delete(0,4).insert(0,"Begin");
		System.out.println(sb2);
		
		
	}


}
/*
123456789
3456789
9876543
Test
Begin Java
*/