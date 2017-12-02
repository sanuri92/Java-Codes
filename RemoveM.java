class  RemoveM{
	public static void main(String args[]){
	String s1="I\'m a JaVa PrOgRaMmEr";
	//String x=s1.toLowerCase();
	String s2=s1.replaceAll("m","");
	String x=s2.replaceAll("M","");
	String s3=s2.trim();
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	
	
	}


}                                                                                  

/*
I'm a JaVa PrOgRaMmEr
I' a JaVa PrOgRaMEr
I' a JaVa PrOgRaMEr
*/
