class PasswordCreate{
	public static void main(String args[]){
		
		String f_name=new String();
		String m_name=new String();
		String l_name=new String();
		String pasword=new String();


		f_name=args[0];
		m_name=args[1];
		l_name=args[2];

		int age=Integer.parseInt(args[3]);
		
		
	System.out.println("First Name :"+" "+f_name);
	System.out.println("Middle Name :"+" "+m_name);
	System.out.println("Last Name :"+" "+l_name);
	System.out.println("Age :"+" "+age);
	
	String s1=f_name.toLowerCase();
	
	//System.out.println(s1.charAt(0)+""+s1.charAt(1));
	
	String s2=m_name.toLowerCase();
	String s3=l_name.toLowerCase();
	
	int a=(age*100);
	//System.out.println(a);
	System.out.println("Pasword :"+s1.charAt(0)+""+s1.charAt(1)+s2.charAt(0)+""+s2.charAt(1)+s3.charAt(0)+s3.charAt(1)+a);
	

	}


}