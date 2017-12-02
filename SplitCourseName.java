class SplitCourseName{
		public static void main(String args[]){
		
		String c_name=new String();
		c_name="ICS 102 : Introduction to Computing I";
		String ar[]=c_name.split(" ");
		String a=ar[0];
		String b=ar[1];
		String c=ar[3];
		String d=ar[4];
		String e=ar[5];
		String f=ar[6];
		
		System.out.println("Course description:"+c_name);
		
		System.out.println("Course Name:"+a);
		System.out.println("Course Number:"+b);
		System.out.println("Course description:"+c+" "+d+" "+e+" "+f);


	}
}	

/*
Course description:ICS 102 : Introduction to Computing I
Course Name:ICS
Course Number:102
Course description:Introduction to Computing I
*/
