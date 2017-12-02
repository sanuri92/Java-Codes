class GiveInitials{
		public static void main(String args[]){
		
		String name=new String();
		name="Sanath Teran Jayasuriya";
		String ar[]=name.split(" ");
		String a=ar[0];
		String b=ar[1];
		String c=ar[2];
		
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);

		char c1=a.charAt(0);
		char c2=b.charAt(0);
		char c3=c.charAt(0);
		System.out.println("Initials of Name Sanath Teran Jayasuriya:"+c1+""+c2+c3);


	}
}	
/*
Answer
	
Sanath
Teran
Jayasuriya
Initials of Name Sanath Teran Jayasuriya:STJ
/*
