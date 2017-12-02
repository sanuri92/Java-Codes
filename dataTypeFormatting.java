class dataTypeFormatting{

	public static void main(String args[]){
		String heading1="Course Name";
		String heading2="Course Grade";
		String divider="-------------------------------------------";
		
		String course1="Java"; 	String grade1="A";
		String course2="PHP";	String grade2="B";
		String course3="VB.Net";String grade3="A";
	
		System.out.println();
		System.out.printf("%-15s %15s %n",heading1,heading2);
		System.out.println(divider);
		
		System.out.printf("%-15s %10s %n",course1,grade1);
		System.out.printf("%-15s %10s %n",course2,grade2);
		System.out.printf("%-15s %10s %n",course3,grade3);
		
		System.out.println(divider);
		System.out.println();
		
		System.out.printf("%s %d %n","Total :",3456);
		System.out.printf("%-10d %10d %n",2345,3456);
		System.out.printf("%010d %010d %n",2345,3456);
		
		System.out.printf("%f %n",3456.78);
		System.out.printf("%.2f %n",3456.78536576);
		System.out.printf("%010.2f %n",3456.7856789);
		System.out.printf("%10.2f %n",3456.7856789);
		
	}
	

}
/*

Course Name        Course Grade
-------------------------------------------
Java                     A
PHP                      B
VB.Net                   A
-------------------------------------------

Total : 3456
2345             3456
0000002345 0000003456
3456.780000
3456.79
0003456.79
   3456.79


*/