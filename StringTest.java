class StringTest{
	public static void main(String args[]){
		String string1="TEST";
		string1.toLowerCase();
		
		System.out.println(string1);
		string1.concat("JAVA");
		System.out.println(string1);
		
		String string2=string1.toLowerCase();
		System.out.println(string2);
		string2 =string2.concat("JAVA");
		System.out.println(string2);


		

		
		
		
		
	}


}
/*Output
TEST
TEST
test
testJAVA
*/