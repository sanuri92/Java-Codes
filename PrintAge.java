class PrintAge{
	public static void main(String args[]){
		int a=Integer.parseInt(args[0]);
	
	if (18>=a){
		System.out.println("User is 18 or Younger");
	}
	if((19>=a)||(39<=a)){
		System.out.println("User is between 19 and 39");
	}
	if((a==45)||(a==50)){
		System.out.println("User is either 45 OR 50");
	}else{
		System.out.println("User is older than 40");
	}


	}
}
/*
error
*/