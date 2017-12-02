class NameExchange{
		public static void main(String args[]){
		
		String name1=new String();
		String name2=new String();
		String name3=new String();
		String name4=new String();

		name1=args[0];
		name2=args[1];
		name3=args[2];
		name4=args[3];
		
		
		
		System.out.println("Student 1 Name :"+args[0]+" "+args[1]);
		System.out.println("Student 2 Name :"+args[2]+" "+args[3]);

		System.out.println("Exchange Names of Student");
		System.out.println("Student Name1 Exchange :"+args[0]+" "+args[3]);
		System.out.println("Student Name2 Exchange :"+args[2]+" "+args[1]);

		

	}
}	

/*
OUTPUT
Student 1 Name :sanuri isara
Student 2 Name :isuru yasantha
Exchange Names of Student
Student Name1 Exchange :sanuri yasantha
Student Name2 Exchange :isuru isara
*/